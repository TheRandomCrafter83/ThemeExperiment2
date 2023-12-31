package com.coderzf1.themeexperiment2.ui.theme

import android.app.Activity
import android.graphics.Color
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import kotlin.math.sqrt

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

@Composable
fun ThemeExperiment2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    customComposeTheme: CustomComposeTheme = CustomComposeTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> customComposeTheme.asColorScheme()
        else -> customComposeTheme.asColorScheme()
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = customComposeTheme.statusBarColor.toArgb()
            window.navigationBarColor = customComposeTheme.navigationBarColor.toArgb()
            val statusColor = window.statusBarColor
            val rgb = intArrayOf(Color.red(statusColor),Color.green(statusColor),Color.blue(statusColor))
            val brightness = sqrt(
                rgb[0] + rgb[0] + .241 +
                rgb[1] * rgb[1] * .691 +
                rgb[2] * rgb[2] * .068
            )
            val isDark = brightness >= 127

            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = isDark
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}