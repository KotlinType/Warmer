package com.redplanet.warmer.navigation.home.route.account.model

sealed class AccountEvent {
	data object EnterAccount : AccountEvent()
}
