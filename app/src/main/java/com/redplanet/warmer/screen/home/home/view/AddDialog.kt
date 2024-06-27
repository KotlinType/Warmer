package com.redplanet.warmer.screen.home.home.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.screen.view.CustomButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddDialog(
	onClose: () -> Unit,
	onAdd: (String) -> Unit,
	modifier: Modifier = Modifier
) {
	BasicAlertDialog(
		modifier = modifier
			.fillMaxWidth(),
		onDismissRequest = onClose
	) {
		Column(
			modifier = Modifier
				.fillMaxWidth()
		) {
			Box(
				modifier = Modifier
					.fillMaxWidth()
					.background(
						color = MaterialTheme.colorScheme.background,
						shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
					)
					.padding(horizontal = 20.dp, vertical = 10.dp)
			) {
				Text(
					text = "Новый пользователь", // TODO move to strings
					style = MaterialTheme.typography.titleLarge,
					color = MaterialTheme.colorScheme.onBackground
				)
			}
			Column(
				modifier = Modifier
					.fillMaxWidth()
					.background(
						color = MaterialTheme.colorScheme.surface,
						shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
					)
					.padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 10.dp)
			) {
				val cardName = rememberSaveable { mutableStateOf("") }
				TextField(
					modifier = Modifier,
					value = cardName.value,
					onValueChange = { cardName.value = it },
					colors = TextFieldDefaults.colors(
						focusedContainerColor = Color.Transparent,
						unfocusedContainerColor = Color.Transparent,
					),
					placeholder = {
						Text(
							text = "Имя пользователя", // TODO move to strings
							style = MaterialTheme.typography.bodyMedium,
						)
					}
				)
				Row(
					modifier = Modifier
						.fillMaxWidth()
						.padding(top = 20.dp),
					horizontalArrangement = Arrangement.SpaceBetween,
				) {
					CustomButton(
						title = "Отмена",
						onClick = onClose
					)
					CustomButton(
						title = "Добавить",
						onClick = {
							onAdd(cardName.value)
						}
					)
				}
			}
		}
	}
}