package com.redplanet.warmer.navigation.home.route.home.model

sealed class HomeEvent {
	data object EnterHome : HomeEvent()
}
