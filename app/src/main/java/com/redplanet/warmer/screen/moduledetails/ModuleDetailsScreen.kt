package com.redplanet.warmer.screen.moduledetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.R
import com.redplanet.warmer.screen.view.Header
import com.redplanet.warmer.screen.view.module.ModuleDetailsItem

@Composable
fun ModuleDetailsScreen(
	onBack:  () -> Unit,
	modifier: Modifier = Modifier,
) {
	Column(
		modifier = modifier.fillMaxSize(),
	) {
		Header(
			title = "Свойства модуля", // TODO move to strings
			onBack = onBack
		)
		Surface(
			shape = RoundedCornerShape(topStart = 10.dp,  topEnd = 10.dp)
		) {
			Column(
				modifier = modifier
					.fillMaxSize()
					.padding(20.dp),
			) {
				Row {
					ModuleDetailsItem(
						modifier = Modifier.weight(1f),
						icon = R.drawable.ic_details_temperature,
						title = "Температура", // TODO move to strings
						subtitle = "33.3 °C" // TODO replace with a temperature from viewmodel
					)
					ModuleDetailsItem(
						modifier = Modifier.weight(1f),
						icon = R.drawable.ic_details_ip,
						title = "IP-адрес", // TODO move to strings
						subtitle = "192.168.152.202" // TODO replace with a ip-address from viewmodel
					)
				}
				Row(
					modifier = Modifier
						.padding(top = 20.dp)
				) {
					ModuleDetailsItem(
						modifier = Modifier.weight(1f),
						icon = R.drawable.ic_wifi,
						title = "Технология", // TODO move to strings
						subtitle = "Wi-Fi 4" // TODO replace with a wifi technology from viewmodel
					)
					ModuleDetailsItem(
						modifier = Modifier.weight(1f),
						icon = R.drawable.ic_details_router,
						title = "Роутер", // TODO move to strings
						subtitle = "192.168.152.1" // TODO replace with a router from viewmodel
					)
				}
				Row(
					modifier = Modifier
						.padding(top = 20.dp)
				) {
					ModuleDetailsItem(
						modifier = Modifier.weight(1f),
						icon = R.drawable.ic_details_signal_strength,
						title = "Уровень сигнала", // TODO move to strings
						subtitle = "Отличный" // TODO replace with a signal strength from viewmodel
					)
					ModuleDetailsItem(
						modifier = Modifier.weight(1f),
						icon = R.drawable.ic_details_subnet_mask,
						title = "Маска подсети", // TODO move to strings
						subtitle = "255.255.255.0" // TODO replace with a subnet mask from viewmodel
					)
				}
			}
		}
	}
}
