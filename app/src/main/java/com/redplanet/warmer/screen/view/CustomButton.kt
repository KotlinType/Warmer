package com.redplanet.warmer.screen.view

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
	title: String,
	onClick: () -> Unit,
	modifier: Modifier = Modifier
) {
	Button(
		modifier = modifier,
		shape = RoundedCornerShape(10.dp),
		contentPadding = PaddingValues(horizontal = 10.dp, vertical = 5.dp),
		onClick = onClick
	) {
		Text(
			text = title,
			style = MaterialTheme.typography.bodyMedium
		)
	}
}