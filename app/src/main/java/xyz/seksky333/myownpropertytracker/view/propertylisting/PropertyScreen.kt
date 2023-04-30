package xyz.seksky333.myownpropertytracker.view.propertylisting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.seksky333.myownpropertytracker.R
import xyz.seksky333.myownpropertytracker.ui.theme.AppTheme
import java.time.LocalDate

@Composable
fun PropertyListingScreen() {
    val propertyList = listOf(
        getStubPropertyOnSaleObject(1),
        getStubPropertyOnSaleObject(2),
        getStubPropertyOnSaleObject(3)
    )
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn {
            items(propertyList.size) { index ->
                PropertyListing(propertyList[index])
            }
        }
    }
}

@Composable
fun PropertyListing(propertyOnSale: PropertyOnSale) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(Color.Green),
    ) {
        Image(
            modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxWidth()
                .height(140.dp),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null
        )
        propertyOnSale.listedPrices.forEach {
            val displayPrice = it.price ?: "${it.minPriceRange} - ${it.maxPriceRange}"
            Column {
                Text(
                    style = MaterialTheme.typography.bodyMedium,
                    text = displayPrice.toString()
                )
                Text(
                    style = MaterialTheme.typography.bodySmall,
                    text = "${it.date.dayOfMonth}-${it.date.month}-${it.date.year}"
                )
            }
        }
//        Text(propertyOnSale.)
    }
}

interface Property {
    val id: Int
    val address: String
}

data class PropertyOnSale(
    override val id: Int,
    override val address: String,
    val listedPrices: List<ListedPrice>
) : Property

data class ListedPrice(
    val propertyId: Int,
    val price: Int?,
    val minPriceRange: Int?,
    val maxPriceRange: Int?,
    val date: LocalDate
)


@Composable
@Preview
fun InspectionScreenPreview() {
    AppTheme {
        PropertyListingScreen()
    }
}

fun getStubPropertyOnSaleObject(propertyId: Int = 1): PropertyOnSale {
    return PropertyOnSale(
        id = propertyId,
        address = "123 A Street, Oak Park",
        listOf(
            ListedPrice(
                propertyId = propertyId,
                price = null,
                minPriceRange = 600000,
                maxPriceRange = 650000,
                date = LocalDate.now().minusDays(7)
            ),
            ListedPrice(
                propertyId = propertyId,
                price = 625000,
                minPriceRange = null,
                maxPriceRange = null,
                date = LocalDate.now()
            )
        )
    )
}
