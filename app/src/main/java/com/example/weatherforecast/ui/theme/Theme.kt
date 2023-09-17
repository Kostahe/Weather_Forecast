package com.example.weatherforecast.ui.theme


import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


private val colors = ColorScheme(
    primary = md_theme_primary,
    onPrimary = md_theme_onPrimary,
    primaryContainer = md_theme_primaryContainer,
    onPrimaryContainer = md_theme_onPrimaryContainer,
    secondary = md_theme_secondary,
    onSecondary = md_theme_onSecondary,
    secondaryContainer = md_theme_secondaryContainer,
    onSecondaryContainer = md_theme_onSecondaryContainer,
    tertiary = md_theme_tertiary,
    onTertiary = md_theme_onTertiary,
    tertiaryContainer = md_theme_tertiaryContainer,
    onTertiaryContainer = md_theme_onTertiaryContainer,
    error = md_theme_error,
    errorContainer = md_theme_errorContainer,
    onError = md_theme_onError,
    onErrorContainer = md_theme_onErrorContainer,
    background = md_theme_background,
    onBackground = md_theme_onBackground,
    surface = md_theme_surface,
    onSurface = md_theme_onSurface,
    surfaceVariant = md_theme_surfaceVariant,
    onSurfaceVariant = md_theme_onSurfaceVariant,
    outline = md_theme_outline,
    inverseOnSurface = md_theme_inverseOnSurface,
    inverseSurface = md_theme_inverseSurface,
    inversePrimary = md_theme_inversePrimary,
    surfaceTint = md_theme_surfaceTint,
    outlineVariant = md_theme_outlineVariant,
    scrim = md_theme_scrim,
)

@Composable
fun WeatherForecastTheme(
    content: @Composable () -> Unit
) {
    val colors = colors

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}