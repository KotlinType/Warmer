package com.redplanet.warmer.navigation.moduledetails

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.redplanet.warmer.navigation.moduledetails.viewmodel.ModuleDetailsViewModel
import com.redplanet.warmer.screen.moduledetails.ModuleDetailsScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ModuleDetailsRoute(
	ip: String?,
	onBack: () -> Unit,
) {
	val moduleDetailsViewModel = viewModel<ModuleDetailsViewModel>()
	Scaffold {
		ModuleDetailsScreen(
			onBack = onBack,
			modifier = Modifier.statusBarsPadding().navigationBarsPadding()
		)
	}
}