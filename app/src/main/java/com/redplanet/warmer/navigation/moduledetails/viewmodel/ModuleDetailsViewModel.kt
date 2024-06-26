package com.redplanet.warmer.navigation.moduledetails.viewmodel

import androidx.lifecycle.ViewModel
import com.compose.jetnav.navigate.base.viewmodel.Event
import com.redplanet.warmer.navigation.moduledetails.module.ModuleDetailsEvent
import com.redplanet.warmer.navigation.moduledetails.module.ModuleDetailsState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ModuleDetailsViewModel(
) : ViewModel(), Event<ModuleDetailsEvent> {
	private val _moduleDetailsState =
		MutableStateFlow<ModuleDetailsState>(ModuleDetailsState.Default)
	val moduleDetailsState: StateFlow<ModuleDetailsState> = _moduleDetailsState
	override fun send(event: ModuleDetailsEvent) {
		when (val state = _moduleDetailsState.value) {
			is ModuleDetailsState.Default -> reduce(event, state)
		}
	}


	private fun reduce(
		event: ModuleDetailsEvent,
		state: ModuleDetailsState.Default
	) {
		when (event) {
			ModuleDetailsEvent.EnterModuleDetails -> {}
		}
	}
}