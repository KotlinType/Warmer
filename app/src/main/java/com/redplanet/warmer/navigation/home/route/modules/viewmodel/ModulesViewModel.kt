package com.redplanet.warmer.navigation.home.route.modules.viewmodel

import androidx.lifecycle.ViewModel
import com.compose.jetnav.navigate.base.viewmodel.Event
import com.redplanet.warmer.navigation.home.route.modules.model.ModulesEvent
import com.redplanet.warmer.navigation.home.route.modules.model.ModulesState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ModulesViewModel(
) : ViewModel(), Event<ModulesEvent> {
	private val _modulesState = MutableStateFlow<ModulesState>(ModulesState.Default)
	val modulesState: StateFlow<ModulesState> = _modulesState
	override fun send(event: ModulesEvent) {
		when (val state = _modulesState.value) {
			is ModulesState.Default -> reduce(event, state)
		}
	}

	private fun reduce(
		event: ModulesEvent,
		state: ModulesState.Default
	) {
		when (event) {
			ModulesEvent.EnterModules -> {}
		}
	}
}