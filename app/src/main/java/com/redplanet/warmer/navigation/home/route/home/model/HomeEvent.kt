package com.redplanet.warmer.navigation.home.route.home.model

sealed class HomeEvent {
	data object EnterHome : HomeEvent()
	data class SwapNextCard(val idCard: Int) : HomeEvent()
	data object OpenAddDialog : HomeEvent()
	data class AddNewCard(val name: String) : HomeEvent()
	data object CloseAddDialog : HomeEvent()
}
