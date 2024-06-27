package com.redplanet.warmer.screen.view.module

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ModuleDetailsItem(
	@DrawableRes icon: Int,
	title: String,
	subtitle: String,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
	) {
		Icon(
			modifier = Modifier
				.size(24.dp),
			painter = painterResource(icon),
			contentDescription = title
		)
		Text(
			modifier = Modifier.padding(top = 5.dp),
			text = title,
			style = MaterialTheme.typography.bodyMedium
		)
		Text(
			modifier = Modifier.padding(top = 5.dp),
			text = subtitle,
			style = MaterialTheme.typography.bodySmall,
			color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
		)
	}
}
