package com.redplanet.warmer.navigation.home.route.modules.model

sealed class ModulesEvent {
	data object EnterModules : ModulesEvent()
}
