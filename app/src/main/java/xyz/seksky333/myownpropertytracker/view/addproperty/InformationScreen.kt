package xyz.seksky333.myownpropertytracker.view.addproperty

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import xyz.seksky333.myownpropertytracker.ui.theme.AppTheme

@Composable
fun InformationScreen(viewModel: AddPropertyViewModel) {
    val context = LocalContext.current
    InformationScreenContent(openDatePicker = {
        viewModel.openDatePicker(context)
    })
}

@Composable
fun InformationScreenContent(openDatePicker: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            PriceType()

            if (true) {
                fixedPrice()
            } else {
                priceRange()
            }
            openDatePicker()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PriceType() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        SuggestionChip(
            onClick = { /*TODO*/ },
            label = {
                Text(
                    text = "Cash    ",
                    fontSize = 14.sp,
                )
            }
        )
        SuggestionChip(
            onClick = { /*TODO*/ },
            label = {
                Text(
                    text = "Credit Card",
                    fontSize = 14.sp,
                )
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun fixedPrice() {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = "100",
        onValueChange = { },
        label = { Text("Label text") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Composable
fun priceRange() {

}


@Composable
@Preview
fun InformationScreenPreview() {
    AppTheme {
        InformationScreenContent(
            openDatePicker = {}
        )
    }
}