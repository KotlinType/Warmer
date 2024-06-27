package com.redplanet.warmer.screen.view.module

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
fun SearchModule(
	onSearch: () -> Unit,
	modifier: Modifier = Modifier
) {
	Row(
		modifier = modifier
			.fillMaxWidth(),
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(
			text = "Доступные модули",
			style = MaterialTheme.typography.bodyLarge
		)
		IconButton(
			modifier = Modifier
				.size(28.dp),
			onClick = onSearch
		) {
			Icon(
				modifier = Modifier
					.size(28.dp),
				painter = painterResource(R.drawable.ic_refresh),
				contentDescription = "back"
			)
		}
	}
}
