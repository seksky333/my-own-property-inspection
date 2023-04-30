package xyz.seksky333.myownpropertytracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with

private val titleCommon
    get() = TextStyle(fontWeight = FontWeight.Bold)
private val bodyCommon
    get() = TextStyle(fontWeight = FontWeight.Normal)
private val labelCommon
    get() = TextStyle(fontWeight = FontWeight.SemiBold)

private val displayCommon
    get() = TextStyle(fontWeight = FontWeight.Normal)
private val headlineCommon
    get() = TextStyle(fontWeight = FontWeight.Normal)


val Typography = Typography(
    headlineLarge = headlineCommon.copy(fontSize = 32.sp),
    headlineMedium = headlineCommon.copy(fontSize = 28.sp),
    headlineSmall = headlineCommon.copy(fontSize = 24.sp),
    displayLarge = displayCommon.copy(fontSize = 57.sp),
    displayMedium = displayCommon.copy(fontSize = 45.sp),
    displaySmall = displayCommon.copy(fontSize = 36.sp),
    bodyLarge = bodyCommon.copy(fontSize = 16.sp),
    bodyMedium = bodyCommon.copy(fontSize = 14.sp),
    bodySmall = bodyCommon.copy(fontSize = 12.sp),
    labelLarge = labelCommon.copy(fontSize = 18.sp),
    labelMedium = labelCommon.copy(fontSize = 16.sp),
    labelSmall = labelCommon.copy(fontSize = 12.sp),
    titleLarge = titleCommon.copy(fontSize = 22.sp),
    titleMedium = titleCommon.copy(fontSize = 16.sp),
    titleSmall = titleCommon.copy(fontSize = 14.sp),
)