package com.redplanet.warmer.screen.home.modules

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.screen.view.Header
import com.redplanet.warmer.screen.view.module.ModuleItem
import com.redplanet.warmer.screen.view.module.SearchModule

@Composable
fun ModulesScreen(
	listModules:  List<Any>, // TODO replace "Any" with a module model
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
					.fillMaxSize()
					.padding(20.dp),
			) {
				SearchModule(
					onSearch = {}
				)
				listModules.forEach {
					ModuleItem(
						title = "192.168.53.36",
						temperature = "33.3",
						onModuleDetails = {
							onModuleDetails("192.168.53.36")
						},
						modifier = Modifier.padding(top = 10.dp),
					)
				}
				if (listModules.isEmpty()) {
					Box(
						modifier = Modifier.fillMaxSize(),
						contentAlignment = Alignment.Center
					) {
						Text(
							text = "Доступных модулей не найдено",
							style = MaterialTheme.typography.bodyMedium,
						)
					}
				}
			}
		}
	}
}
