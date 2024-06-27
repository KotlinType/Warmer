package com.redplanet.warmer.navigation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.redplanet.warmer.R
import com.redplanet.warmer.base.navigation.BaseDestination
import com.redplanet.warmer.navigation.home.route.account.AccountRoute
import com.redplanet.warmer.navigation.home.route.home.HomeRoute
import com.redplanet.warmer.navigation.home.route.modules.ModulesRoute
import com.redplanet.warmer.navigation.view.bottombar.ButtonBar
import com.redplanet.warmer.navigation.view.bottombar.DefaultButtonItem

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

private sealed class BottomItem(
	title: String,
	route: String,
	iconId: Int,
) : DefaultButtonItem(title, route, iconId) {
	data object ScreenHome: BottomItem(
		"Home",
		AuthDest.Home.destination,
		R.drawable.ic_nav_bar_home
	)
	data object ScreenModule: BottomItem(
		"Module",
		AuthDest.Modules.destination,
		R.drawable.ic_nav_bar_modules
	)
	data object ScreenPeople: BottomItem(
		"Account",
		AuthDest.Account.destination,
		R.drawable.ic_nav_bar_people
	)
}

@Composable
fun HomeNavHost(
	onNavigateToModuleDetails: (ip: String) -> Unit,
	navController: NavHostController = rememberNavController()
) {
	Scaffold(
		bottomBar = { ButtonBar(
			navController = navController,
			listItems = listOf(
				BottomItem.ScreenHome,
				BottomItem.ScreenModule,
				BottomItem.ScreenPeople,
			)
		) }
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
