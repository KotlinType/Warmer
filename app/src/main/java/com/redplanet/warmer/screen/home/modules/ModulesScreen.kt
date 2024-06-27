package com.redplanet.warmer.screen.home.modules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.redplanet.warmer.screen.view.Header

@Composable
fun ModulesScreen(
	onModuleDetails: (ip: String) -> Unit,
	modifier: Modifier = Modifier,
) {
	Column(
		modifier = modifier.fillMaxSize(),
	) {
		Header(
			title = "Модули", // TODO move to strings
		)
		Surface {
			Column(
				modifier = modifier
					.fillMaxSize(),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally,
			) {
				Text("Modules screen")
				Button(
					onClick = {
						onModuleDetails("192:168:53:36")
					}
				) {
					Text("details")
				}
			}
		}
	}
}
