package com.redplanet.warmer.screen.home.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.R
import com.redplanet.warmer.screen.view.Header

@Composable
fun HomeScreen(
	onModuleDetails: (ip: String) -> Unit,
	modifier: Modifier = Modifier,
) {
	Column(
		modifier = modifier.fillMaxSize(),
	) {
		Header(
			title = "Согревайка", // TODO move to strings
			onAdd = {},
		)
		Surface(
			shape = RoundedCornerShape(topStart = 10.dp,  topEnd = 10.dp)
		) {
			Column(
				modifier = Modifier
					.fillMaxSize(),
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.Center
			) {
				Text("Home screen")
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
