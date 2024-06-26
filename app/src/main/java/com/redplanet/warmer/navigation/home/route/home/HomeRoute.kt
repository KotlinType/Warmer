package com.redplanet.warmer.navigation.home.route.home

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.redplanet.warmer.navigation.home.route.home.viewmodel.HomeViewModel
import com.redplanet.warmer.screen.home.home.HomeScreen

@Composable
fun HomeRoute(
	onModuleDetails: (ip: String) -> Unit,
) {
	val homeViewModel = viewModel<HomeViewModel>()

	HomeScreen(
		onModuleDetails = onModuleDetails,
		modifier = Modifier.statusBarsPadding().navigationBarsPadding()
	)
}
