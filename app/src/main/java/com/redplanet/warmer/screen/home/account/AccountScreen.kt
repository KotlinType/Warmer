package com.redplanet.warmer.screen.home.account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.redplanet.warmer.screen.view.Header

@Composable
fun AccountScreen(
	modifier: Modifier = Modifier,
) {
	Column(
		modifier = modifier.fillMaxSize(),
	) {
		Header(
			title = "Аккаунт", // TODO move to strings
		)
		Surface {
			Column(
				modifier = modifier
					.fillMaxSize(),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally,
			) {
				Text("Account screen")
			}

		}
	}
}
