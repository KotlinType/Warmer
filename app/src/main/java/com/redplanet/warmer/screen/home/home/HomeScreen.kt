package com.redplanet.warmer.screen.home.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.redplanet.warmer.screen.home.home.view.Cards
import com.redplanet.warmer.screen.view.Header

@Composable
fun HomeScreen(
	cards: List<String>,
	currentCardId: Int,
	onSwapNextCard: (Int) -> Unit,
	onModuleDetails: (ip: String) -> Unit,
	onAddNewCard: () -> Unit,
	modifier: Modifier = Modifier,
) {
	Column(
		modifier = modifier.fillMaxSize(),
	) {
		Header(
			title = "Согревайка", // TODO move to strings
			onAdd = onAddNewCard,
		)
		Surface(
			shape = RoundedCornerShape(topStart = 10.dp,  topEnd = 10.dp)
		) {
			Cards(
				cards = cards,
				currentCardId =  currentCardId,
				onSwapNextCard = onSwapNextCard
			)
		}
	}
}
