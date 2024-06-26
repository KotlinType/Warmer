package com.redplanet.warmer.navigation.moduledetails.module

import com.redplanet.warmer.navigation.home.route.account.model.AccountState

sealed class ModuleDetailsState {
	data object Default : ModuleDetailsState()
}
