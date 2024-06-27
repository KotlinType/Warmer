package com.redplanet.warmer.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
)

private val LightColors = lightColorScheme(
	primary = light_primary,
	onPrimary = light_onPrimary,
	primaryContainer = light_primaryContainer,
	onPrimaryContainer = light_onPrimaryContainer,
	secondary = light_secondary,
	onSecondary = light_onSecondary,
	secondaryContainer = light_secondaryContainer,
	onSecondaryContainer = light_onSecondaryContainer,
	tertiary = light_tertiary,
	onTertiary = light_onTertiary,
	tertiaryContainer = light_tertiaryContainer,
	onTertiaryContainer = light_onTertiaryContainer,
	error = light_error,
	onError = light_onError,
	errorContainer = light_errorContainer,
	onErrorContainer = light_onErrorContainer,
	background = light_background,
	onBackground = light_onBackground,
	surface = light_surface,
	onSurface = light_onSurface,
	surfaceVariant = light_surfaceVariant,
	onSurfaceVariant = light_onSurfaceVariant,
	outline = light_outline,
	inverseSurface = light_inverseSurface,
	inverseOnSurface = light_inverseOnSurface,
	inversePrimary = light_inversePrimary,
	surfaceTint = light_surfaceTint,
)

@Composable
fun WarmerTheme(
	useDarkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val colors = if (!useDarkTheme) LightColors else LightColors

	MaterialTheme(
		colorScheme = colors,
		typography = Typography,
		content = content
	)
}