package com.redplanet.warmer.screen.home.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AccountScreen(
	modifier: Modifier = Modifier,
) {
	Column(
	modifier = modifier
		.fillMaxSize(),
		verticalArrangement = Arrangement.Center,
	horizontalAlignment = Alignment.CenterHorizontally,
	) {
		Text("Account screen")
	}
}
