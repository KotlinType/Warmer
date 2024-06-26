package com.redplanet.warmer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.redplanet.warmer.base.navigation.BaseDestination
import com.redplanet.warmer.navigation.home.HomeNavHost
import com.redplanet.warmer.navigation.moduledetails.ModuleDetailsRoute

private sealed class MainDest : BaseDestination() {
	data object Main : MainDest() {
		override val destination: String = "main"
	}

	data object ModuleDetails : MainDest() {
		override val destination: String = "moduleDetails/{ip}"
		public override val destinationArg: (String) -> String = { super.destinationArg(it) }
	}
}

@Composable
fun MainNavHost(
	navController: NavHostController = rememberNavController()
) {
	NavHost(
		navController = navController,
		startDestination = MainDest.Main.destination
	) {
		composable(MainDest.Main.destination) {
			HomeNavHost(
				onNavigateToModuleDetails = {
					navController.navigate(MainDest.ModuleDetails.destinationArg(it))
				}
			)
		}
		composable(MainDest.ModuleDetails.destination) {
			val ip = it.arguments?.getString("ip")
			ModuleDetailsRoute(
				ip = ip,
				onBack = { navController.popBackStack() }
			)
		}
	}
}
