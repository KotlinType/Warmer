package com.redplanet.warmer.navigation.home.route.account.viewmodel

import com.compose.jetnav.navigate.base.viewmodel.Event
import com.redplanet.warmer.navigation.home.route.account.model.AccountState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

import androidx.lifecycle.ViewModel
import com.redplanet.warmer.navigation.home.route.account.model.AccountEvent

class AccountViewModel(
) : ViewModel(), Event<AccountEvent> {
	private val _accountState = MutableStateFlow<AccountState>(AccountState.Default)
	val accountState: StateFlow<AccountState> = _accountState
	override fun send(event: AccountEvent) {
		when (val state = _accountState.value) {
			is AccountState.Default -> reduce(event, state)
		}
	}

	private fun reduce(
		event: AccountEvent,
		state: AccountState.Default
	) {
		when (event) {
			AccountEvent.EnterAccount -> {}
		}
	}
}