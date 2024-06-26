package com.redplanet.warmer.navigation.moduledetails.module

sealed class ModuleDetailsEvent {
	data object EnterModuleDetails : ModuleDetailsEvent()
}
