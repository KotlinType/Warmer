package com.redplanet.warmer.navigation.home.route.account.model

sealed class AccountState {
	data object Default : AccountState()
}
