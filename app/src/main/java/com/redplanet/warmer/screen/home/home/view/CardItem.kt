package com.redplanet.warmer.screen.home.home.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.R

@Composable
fun CardItem(
	title: String,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.fillMaxSize(),
		horizontalAlignment = Alignment.CenterHorizontally,
	) {
		Text(
			modifier = Modifier
				.padding(top = 20.dp),
			text = title,
			style = MaterialTheme.typography.bodyLarge
		)
		Image(
			modifier = Modifier
				.padding(vertical = 20.dp),
			painter = painterResource(R.drawable.people),
			contentDescription = "people"
		)
	}
}