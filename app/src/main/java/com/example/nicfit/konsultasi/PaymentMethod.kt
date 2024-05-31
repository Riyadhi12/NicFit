package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun PaymentMethod(
    modifier: Modifier,
    navHostController: NavHostController,
    valueStr: String
) {
    Column{
        Text(text = "Pilih Bank", modifier = modifier.padding(16.dp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 24.sp)
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            BankCardPayment(modifier = modifier, navHostController = navHostController, valueStr = valueStr, bankName = "bca", imageId = R.drawable.bca)
            BankCardPayment(modifier = modifier, navHostController = navHostController, valueStr = valueStr, bankName = "bni", imageId = R.drawable.bni)
            BankCardPayment(modifier = modifier, navHostController = navHostController, valueStr = valueStr, bankName = "bri", imageId = R.drawable.bri)
        }
    }
}

@Composable
fun BankCardPayment(
    modifier:Modifier,
    navHostController: NavHostController,
    valueStr: String,
    bankName:String,
    imageId:Int
){
    Card(
        elevation = 12.dp,
        modifier = modifier.size(100.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(25.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .clickable {
                    navHostController.navigate("payment_bca/$valueStr")
                }.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = bankName,
                modifier = modifier.size(40.dp)
            )
            Spacer(modifier = modifier.padding(bottom=8.dp))
            Text(text = bankName.uppercase(), fontFamily = poppinFamily, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview
@Composable
fun PaymentMethodPreview() {
    PaymentMethod(modifier = Modifier, navHostController = NavHostController(LocalContext.current), "true")
}