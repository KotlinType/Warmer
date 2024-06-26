package com.redplanet.warmer.navigation.home.route.home.viewmodel

import androidx.lifecycle.ViewModel
import com.compose.jetnav.navigate.base.viewmodel.Event
import com.redplanet.warmer.navigation.home.route.home.model.HomeEvent
import com.redplanet.warmer.navigation.home.route.home.model.HomeState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel(
) : ViewModel(), Event<HomeEvent> {
	private val _homeState = MutableStateFlow<HomeState>(HomeState.Default)
	val homeState: StateFlow<HomeState> = _homeState

	override fun send(event: HomeEvent) {
		when (val state = _homeState.value) {
			is HomeState.Default -> reduce(event, state)
		}	}

	private fun reduce(
		event: HomeEvent,
		state: HomeState.Default
	) {
		when (event) {
			HomeEvent.EnterHome -> {}
		}
	}
}