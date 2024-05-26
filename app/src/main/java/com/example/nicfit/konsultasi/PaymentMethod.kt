package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nicfit.R


@Composable
fun PaymentMethod(
    modifier: Modifier,
    navHostController: NavHostController
) {
    Column{
        Text(text = "Pilih Bank", modifier = modifier.padding(16.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                elevation = CardDefaults.cardElevation(12.dp),
                shape = CardDefaults.elevatedShape,
                modifier = modifier.size(70.dp)
            ) {
                Column(
                    modifier = modifier.fillMaxSize()
                        .clickable {
                            navHostController.navigate("payment_bca")
                        },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bca),
                        contentDescription = "bca",
                        modifier = modifier.size(30.dp)
                    )
                    Text(text = "BCA")
                }
            }
            Card (
                elevation = CardDefaults.cardElevation(12.dp),
                shape = CardDefaults.elevatedShape,
                modifier = modifier.size(70.dp)
            ){
                Column(
                    modifier = modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bni),
                        contentDescription = "bni",
                        modifier = modifier.size(30.dp)
                    )
                    Text(text = "BNI")
                }
            }
            Card (
                elevation = CardDefaults.cardElevation(12.dp),
                shape = CardDefaults.elevatedShape,
                modifier = modifier.size(70.dp)
            ){
                Column(
                    modifier = modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bri),
                        contentDescription = "bri",
                        modifier = modifier.size(30.dp)
                    )
                    Text(text = "BRI")
                }
            }
        }
    }
}

@Preview
@Composable
fun PaymentMethodPreview() {
    PaymentMethod(modifier = Modifier, navHostController = NavHostController(LocalContext.current))
}