package com.coderzf1.themeexperiment2.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

data class CustomComposeTheme(
    val darkTheme:Boolean = false,
    val primaryColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).primary,
    val secondaryColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).secondary,
    val tertiaryColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).tertiary,
    val backgroundColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).background,
    val surfaceColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).surface,
    val onPrimaryColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onPrimary,
    val onSecondaryColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onSecondary,
    val onTertiaryColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onTertiary,
    val onBackgroundColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onBackground,
    val onSurfaceColor:Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onSurface,
    val statusBarColor:Color = primaryColor,
    val navigationBarColor:Color = Color.Black,
    val primaryContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).primaryContainer,
    val onPrimaryContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onPrimaryContainer,
    val inversePrimaryColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).inversePrimary,
    val secondaryContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).secondaryContainer,
    val onSecondaryContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onSecondaryContainer,
    val tertiaryContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).tertiaryContainer,
    val onTertiaryContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onTertiaryContainer,
    val surfaceVariantColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).surfaceVariant,
    val onSurfaceVariantColor: Color  = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onSurfaceVariant,
    val surfaceTintColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).surfaceTint,
    val inverseSurfaceColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).inverseSurface,
    val inverseOnSurfaceColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).inverseOnSurface,
    val errorColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).error,
    val onErrorColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onError,
    val errorContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).errorContainer,
    val onErrorContainerColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).onErrorContainer,
    val outlineColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).outline,
    val outlineVariantColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).outlineVariant,
    val scrimColor: Color = (when(darkTheme){true->darkColorScheme() false->lightColorScheme()}).scrim
){
    fun asColorScheme(): ColorScheme {
        return lightColorScheme(
            primary = primaryColor,
            secondary = secondaryColor,
            tertiary = tertiaryColor,
            background = backgroundColor,
            surface = surfaceColor,
            onPrimary = onPrimaryColor,
            onSecondary = onSecondaryColor,
            onTertiary = onTertiaryColor,
            onBackground = onBackgroundColor,
            onSurface = onSurfaceColor,
            primaryContainer = primaryContainerColor,
            onPrimaryContainer = onPrimaryContainerColor,
            inversePrimary = inversePrimaryColor,
            secondaryContainer = secondaryContainerColor,
            onSecondaryContainer = onSecondaryContainerColor,
            tertiaryContainer = tertiaryContainerColor,
            onTertiaryContainer = onTertiaryContainerColor,
            surfaceVariant = surfaceVariantColor,
            onSurfaceVariant  = onSurfaceVariantColor,
            surfaceTint = surfaceTintColor,
            inverseSurface = inverseSurfaceColor,
            inverseOnSurface = inverseOnSurfaceColor,
            error = errorColor,
            onError = onErrorColor,
            errorContainer = errorContainerColor,
            onErrorContainer = onErrorContainerColor,
            outline = outlineColor,
            outlineVariant = outlineVariantColor,
            scrim = scrimColor
        )
    }
}