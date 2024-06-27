package com.redplanet.warmer.screen.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Header(
	modifier: Modifier = Modifier,
	title: String,
	onBack: (() -> Unit)? = null,
	onAdd: (() -> Unit)? = null
) {
	Row(
		modifier = modifier
			.padding(horizontal = 10.dp),
		verticalAlignment = Alignment.CenterVertically,
	) {
		onBack?.let {
			IconButton(
				modifier = Modifier
					.padding(end = 20.dp)
					.size(44.dp),
				onClick = onBack
			) {
				Icon(
					modifier = Modifier.size(24.dp),
					imageVector = Icons.AutoMirrored.Filled.ArrowBack,
					contentDescription = "back"
				)
			}
		}
		Text(
			modifier = Modifier
				.weight(1f)
				.padding(start = 10.dp, bottom = 10.dp, top = 10.dp),
			text = title,
			style = MaterialTheme.typography.titleLarge
		)
		onAdd?.let {
			IconButton(
				modifier = Modifier
					.size(44.dp),
				onClick = onAdd
			) {
				Icon(
					modifier = Modifier
						.size(24.dp),
					imageVector = Icons.Default.Add,
					contentDescription = "back"
				)
			}
		}
	}
}
