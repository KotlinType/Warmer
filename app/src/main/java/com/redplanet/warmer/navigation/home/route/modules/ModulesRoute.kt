package com.redplanet.warmer.navigation.home.route.modules

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.redplanet.warmer.navigation.home.route.modules.viewmodel.ModulesViewModel
import com.redplanet.warmer.screen.home.modules.ModulesScreen

@Composable
fun ModulesRoute(
	onModuleDetails: (ip: String) -> Unit,
) {
	val modulesViewModel = hiltViewModel<ModulesViewModel>()

	ModulesScreen(
		listModules = listOf(), // TODO replace "listOf()" with a listModules from viewmodel
		onModuleDetails = onModuleDetails,
		modifier = Modifier.statusBarsPadding().navigationBarsPadding()
	)
}
