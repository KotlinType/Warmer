package com.redplanet.warmer.navigation.utils

import android.annotation.SuppressLint
import android.util.Log
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavOptions

// It is assumed that there can be only one item in the collection without copies
fun bufferNavigation(
	navController: NavController,
	destination: String,
) {
	removingDuplicatesFromBackstack(navController, destination)
}

@SuppressLint("RestrictedApi")
private fun removingDuplicatesFromBackstack(
	navController: NavController,
	destination: String,
) {
	val currentBackStack = navController.currentBackStack.value
	val tempBackStack: ArrayList<NavBackStackEntry> = arrayListOf()

	currentBackStack
		.find { it.destination.route == destination }
		?.let {
			currentBackStack.reversed().forEach {
				if (it.destination.route == destination) {
					navController.popBackStack()
					return@let
				}
				tempBackStack.add(it)
				navController.popBackStack()
			}
		}
	tempBackStack.reversed().forEach {
		navController.navigate(it.destination.route.toString())
	}

	navController.navigate(destination)
}
