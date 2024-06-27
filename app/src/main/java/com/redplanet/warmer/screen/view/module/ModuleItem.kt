package com.redplanet.warmer.screen.view.module

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.R

@Composable
fun ModuleItem(
	title: String,
	temperature: String,
	onModuleDetails: () -> Unit,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier
			.fillMaxWidth(),
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically
	) {
		Row(
			modifier = modifier,
			verticalAlignment = Alignment.CenterVertically
		) {
			Icon(
				modifier = Modifier
					.size(20.dp),
				painter = painterResource(R.drawable.ic_wifi),
				contentDescription = "wifi"
			)
			Text(
				modifier = Modifier
					.padding(start = 10.dp),
				text = title,
				style = MaterialTheme.typography.bodyLarge
			)
		}
		Row(
			modifier = modifier,
			verticalAlignment = Alignment.CenterVertically
		) {
			Text(
				modifier = Modifier
					.padding(end = 10.dp),
				text = "$temperature °C",
				style = MaterialTheme.typography.bodySmall,
				color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
			)
			IconButton(
				modifier = Modifier
					.size(28.dp),
				onClick = onModuleDetails
			) {
				Icon(
					modifier = Modifier
						.size(28.dp),
					painter = painterResource(R.drawable.ic_properties),
					contentDescription = "properties"
				)
			}
		}
	}
}
