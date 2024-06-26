package com.redplanet.warmer.navigation.moduledetails

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.redplanet.warmer.navigation.moduledetails.viewmodel.ModuleDetailsViewModel
import com.redplanet.warmer.screen.moduledetails.ModuleDetailsScreen

@Composable
fun ModuleDetailsRoute(
	ip: String?,
	onBack: () -> Unit,
) {
	val moduleDetailsViewModel = viewModel<ModuleDetailsViewModel>()
	ModuleDetailsScreen(
		onBack = onBack,
		modifier = Modifier.statusBarsPadding().navigationBarsPadding()
	)
}