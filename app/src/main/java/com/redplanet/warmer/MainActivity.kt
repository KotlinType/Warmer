package com.redplanet.warmer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.redplanet.warmer.navigation.MainNavHost
import com.redplanet.warmer.ui.theme.WarmerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			WarmerTheme {
				MainNavHost()
			}
		}
	}
}
