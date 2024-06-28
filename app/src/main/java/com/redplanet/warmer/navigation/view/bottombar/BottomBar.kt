package com.redplanet.warmer.navigation.view.bottombar

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.redplanet.warmer.navigation.utils.bufferNavigation

abstract class DefaultButtonItem(
	val title: String,
	val route: String,
	val iconId: Int,
)

@OptIn(ExperimentalComposeApi::class)
@Composable
fun ButtonBar(
	navController: NavController,
	listItems: List<DefaultButtonItem>
) {
	NavigationBar(
		containerColor = MaterialTheme.colorScheme.primary,
	) {
		val backStackEntry by navController.currentBackStackEntryAsState()
		val currentRout = backStackEntry?.destination?.route
		listItems.forEach { item ->
			val background =
				if (currentRout == item.route) MaterialTheme.colorScheme.secondary
				else MaterialTheme.colorScheme.primary
			NavigationBarItem(
				selected = currentRout == item.route,
				onClick = {
					bufferNavigation(navController, item.route)
				},
				enabled = currentRout != item.route,
				icon = {
					Icon(
						painter = painterResource(id = item.iconId),
						contentDescription = item.title
					)
				},
				colors = NavigationBarItemColors(
					selectedIconColor = MaterialTheme.colorScheme.onPrimary,
					selectedTextColor = MaterialTheme.colorScheme.onPrimary,
					selectedIndicatorColor = Color.Unspecified,
					unselectedIconColor = MaterialTheme.colorScheme.onPrimary,
					unselectedTextColor = MaterialTheme.colorScheme.onPrimary,
					disabledIconColor = MaterialTheme.colorScheme.onPrimary,
					disabledTextColor = MaterialTheme.colorScheme.onPrimary,
				),
				modifier = Modifier.background(background)
			)
		}
	}
}
