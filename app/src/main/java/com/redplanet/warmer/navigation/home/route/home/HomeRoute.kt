package com.redplanet.warmer.navigation.home.route.home

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.redplanet.warmer.navigation.home.route.home.model.HomeEvent
import com.redplanet.warmer.navigation.home.route.home.model.HomeState
import com.redplanet.warmer.navigation.home.route.home.viewmodel.HomeViewModel
import com.redplanet.warmer.screen.home.home.HomeScreen
import com.redplanet.warmer.screen.home.home.view.AddDialog

@Composable
fun HomeRoute(
	onModuleDetails: (ip: String) -> Unit,
) {
	val homeViewModel = hiltViewModel<HomeViewModel>()
	val state = homeViewModel.homeState.collectAsState().value

	var cards by remember { mutableStateOf(listOf<String>()) }
	var currentCardId by remember { mutableIntStateOf(0) }

	when (state) {
		is HomeState.Default -> {
			cards = state.cards
			currentCardId = state.currentCardId
		}
		HomeState.AddDialog -> {
			AddDialog(
				onClose = {
					homeViewModel.send(HomeEvent.CloseAddDialog)
				},
				onAdd = {
					homeViewModel.send(HomeEvent.AddNewCard(it))
				}
			)
		}
	}

	HomeScreen(
		cards = cards,
		currentCardId = currentCardId,
		onModuleDetails = onModuleDetails,
		onSwapNextCard = {
			homeViewModel.send(HomeEvent.SwapNextCard(it))
		},
		onAddNewCard = {
			homeViewModel.send(HomeEvent.OpenAddDialog)
		},
		modifier = Modifier.statusBarsPadding().navigationBarsPadding()
	)
}
