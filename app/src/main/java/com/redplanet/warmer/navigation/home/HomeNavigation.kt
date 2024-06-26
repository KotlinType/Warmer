package com.redplanet.warmer.navigation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.redplanet.warmer.R
import com.redplanet.warmer.base.navigation.BaseDestination
import com.redplanet.warmer.navigation.home.route.account.AccountRoute
import com.redplanet.warmer.navigation.home.route.home.HomeRoute
import com.redplanet.warmer.navigation.home.route.modules.ModulesRoute

private sealed class AuthDest : BaseDestination() {
	/**
	 * @property destination basic navigation destination
	 */
	data object Home : AuthDest() {
		override val destination: String = "home"
	}

	/**
	 * @property destination basic navigation destination
	 */
	data object Modules : AuthDest() {
		override val destination: String = "moduleDetails"
	}

	/**
	 * @property destination basic navigation destination
	 */
	data object Account : AuthDest() {
		override val destination: String = "account"
	}
}

@Composable
fun HomeNavHost(
	onNavigateToModuleDetails: (ip: String) -> Unit,
	navController: NavHostController = rememberNavController()
) {
	Scaffold(
		bottomBar = { ButtonBar(navController) }
	) { paddingValue ->
		Column(
			modifier = Modifier.padding(bottom = paddingValue.calculateBottomPadding())
		) {
			NavHost(
				navController = navController,
				startDestination = AuthDest.Home.destination
			) {
				composable(AuthDest.Home.destination) {
					HomeRoute(onModuleDetails = onNavigateToModuleDetails)
				}
				composable(AuthDest.Modules.destination) {
					ModulesRoute(onModuleDetails = onNavigateToModuleDetails)
				}
				composable(AuthDest.Account.destination) {
					AccountRoute()
				}
			}
		}
	}
}

@Composable
private fun ButtonBar(
	navController: NavController
) {
	val listItems = listOf(
		BottomItem.ScreenHome,
		BottomItem.ScreenModule,
		BottomItem.ScreenPeople,
	)
	NavigationBar(
		containerColor = Color(0xFF961E3A), // TODO move to ui
	) {
		val backStackEntry by navController.currentBackStackEntryAsState()
		val currentRout = backStackEntry?.destination?.route
		listItems.forEach { item ->
			val background =
				if (currentRout == item.route) Color(0xFFBB2649) // TODO move to ui
				else Color(0xFF961E3A) // TODO move to ui
			NavigationBarItem(
				selected = currentRout == item.route,
				onClick = {
					navController.navigate(item.route)
				},
				enabled = currentRout != item.route,
				icon = {
					Icon(
						painter = painterResource(id = item.iconId),
						contentDescription = item.title
					)
				},
				colors = NavigationBarItemColors(
					selectedIconColor = Color(0xFFFFFFFF), // TODO move to ui
					selectedTextColor = Color(0xFFFFFFFF), // TODO move to ui
					selectedIndicatorColor = Color.Unspecified, // TODO move to ui
					unselectedIconColor = Color(0xFFFFFFFF), // TODO move to ui
					unselectedTextColor = Color(0xFFFFFFFF), // TODO move to ui
					disabledIconColor = Color(0xFFFFFFFF), // TODO move to ui
					disabledTextColor = Color(0xFFFFFFFF), // TODO move to ui
				),
				modifier = Modifier.fillMaxWidth().background(color = background),
			)
		}
	}
}

private sealed class BottomItem(
	val title: String,
	val route: String,
	val iconId: Int,
) {
	object ScreenHome: BottomItem(
		"Home",
		AuthDest.Home.destination,
		R.drawable.home
	)
	object ScreenModule: BottomItem(
		"Module",
		AuthDest.Modules.destination,
		R.drawable.modules
	)
	object ScreenPeople: BottomItem(
		"Account",
		AuthDest.Account.destination,
		R.drawable.people
	)
}
