package xyz.seksky333.myownpropertyinspection.view.inspection

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InspectionScreen() {
}

data class Property(
    val id: String,
    val address: String,

)

@Composable
@Preview
fun InspectionScreenPreview() {
    InspectionScreen()
}
