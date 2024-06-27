package com.redplanet.warmer.navigation.home.route.home.viewmodel

import androidx.lifecycle.ViewModel
import com.compose.jetnav.navigate.base.viewmodel.Event
import com.redplanet.warmer.navigation.home.route.home.model.HomeEvent
import com.redplanet.warmer.navigation.home.route.home.model.HomeState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel(
) : ViewModel(), Event<HomeEvent> {
	private val _cards = arrayListOf("Пользователь 1")
	private var _currentCardId = 0

	private val _homeState =
		MutableStateFlow<HomeState>(HomeState.Default(_cards, _currentCardId))
	val homeState: StateFlow<HomeState> = _homeState

	override fun send(event: HomeEvent) {
		when (val state = _homeState.value) {
			is HomeState.Default -> reduce(event, state)
			is HomeState.AddDialog -> reduce(event, state)
		}
	}

	private fun reduce(
		event: HomeEvent,
		state: HomeState.Default
	) {
		when (event) {
			HomeEvent.EnterHome -> {}
			HomeEvent.OpenAddDialog -> {
				_homeState.value = HomeState.AddDialog
			}
			is HomeEvent.SwapNextCard -> {
				_currentCardId = event.idCard
				_homeState.value = HomeState.Default(_cards, _currentCardId)
			}
			else -> {}
		}
	}

	private fun reduce(
		event: HomeEvent,
		state: HomeState.AddDialog
	) {
		when (event) {
			HomeEvent.EnterHome -> {}
			is HomeEvent.AddNewCard -> {
				_cards.add(event.name)
				_homeState.value = HomeState.Default(_cards, _currentCardId)
			}
			HomeEvent.CloseAddDialog -> {
				_homeState.value = HomeState.Default(_cards, _currentCardId)
			}
			else -> {}
		}
	}
}