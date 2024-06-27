package com.redplanet.warmer.screen.home.home.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Cards(
	cards: List<String>,
	currentCardId: Int,
	onSwapNextCard: (Int) -> Unit,
	modifier: Modifier = Modifier
) {
	val pagerState = rememberPagerState(
		initialPage = currentCardId,
	) { cards.size }

	HorizontalPager(
		modifier = modifier,
		state = pagerState
	) {
		CardItem(cards[it])
	}
	LaunchedEffect (pagerState.currentPage) {
		onSwapNextCard(pagerState.currentPage)
	}

}
