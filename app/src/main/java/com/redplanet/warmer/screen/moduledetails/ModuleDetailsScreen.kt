package com.redplanet.warmer.screen.moduledetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ModuleDetailsScreen(
	onBack:  () -> Unit,
	modifier: Modifier = Modifier,
) {
	Surface {
		Column(
			modifier = modifier
				.fillMaxSize(),
			verticalArrangement = Arrangement.Center,
			horizontalAlignment = Alignment.CenterHorizontally,
		) {
			Text("Module details screen")
			Button(
				onClick = { onBack() }
			) {
				Text("On back")
			}
		}
	}
}
