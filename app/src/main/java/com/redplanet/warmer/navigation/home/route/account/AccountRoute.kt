package com.redplanet.warmer.navigation.home.route.account

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.redplanet.warmer.navigation.home.route.account.viewmodel.AccountViewModel
import com.redplanet.warmer.screen.home.account.AccountScreen

@Composable
fun AccountRoute() {
	val accountViewModel = viewModel<AccountViewModel>()

	AccountScreen(
		modifier = Modifier.statusBarsPadding().navigationBarsPadding()
	)
}
