package com.redplanet.warmer.navigation.home.route.home.model

sealed class HomeState {
	data class Default(
		val cards: List<String>,
		val currentCardId: Int,
	) : HomeState()
	data object AddDialog : HomeState()
}
