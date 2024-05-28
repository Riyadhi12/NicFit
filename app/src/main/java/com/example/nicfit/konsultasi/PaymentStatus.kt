package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.navigation.Screens


@Composable
fun PaymentStatus(
    modifier: Modifier,
    navHostController: NavHostController,
    isContactValue: String
){
    val value = isContactValue.toBoolean()
    when(value){
        true ->{
            Column(
                modifier = modifier.fillMaxWidth().padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Card(
                    modifier = modifier.padding(8.dp)
                ) {
                    Column(
                        modifier = modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painter = painterResource(id = R.drawable.bca_logo), contentDescription = "", modifier = modifier
                            .height(100.dp)
                            .width(200.dp)
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                            .clip(
                                RectangleShape
                            )
                            .padding(12.dp)
                        )
                        Text(text = "Transaksi telah sukses!", style = TextStyle(fontSize = 18.sp))
                        Text(text = "20 Mei 2024 20:00 gmt+7", style = TextStyle(fontSize = 12.sp))
                        Text(text = "Rp50.000", modifier = modifier.padding(12.dp), style = TextStyle(fontSize = 24.sp))
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Pengirim")
                            Text(text = "Yoga Agatha")
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Bank Tujuan")
                            Text(text = "BCA")
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Nomor Kirim")
                            Text(text = "8930462013")
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "ID Transaksi")
                            Text(text = "2435GASFD7523")
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp)
                                .padding(bottom = 64.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Catatan")
                            Text(text = "")
                        }
                        Row(
                            modifier = modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Button(onClick = {
                            },
                                colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                                Image(painter = painterResource(id = R.drawable.download_button), contentDescription = "",
                                    modifier = modifier
                                        .height(40.dp)
                                        .width(80.dp))
                            }
                            Button(onClick = {
                            },
                                colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                                Image(painter = painterResource(id = R.drawable.share_button), contentDescription = "",
                                    modifier = modifier
                                        .height(40.dp)
                                        .width(60.dp))
                            }
                        }

                    }
                }
                ConfirmationButton(text = "Kembali", toConfirm = false, onClickButton = {
                    navHostController.navigate("konsultasiList") },
                    modifier = modifier.fillMaxWidth().padding(horizontal = 24.dp))
                ConfirmationButton(text = "Chat Konsultan", toConfirm = true, onClickButton = {
                    navHostController.navigate(Screens.konsul_chat.name) },
                    modifier = modifier.fillMaxWidth().padding(horizontal = 24.dp))
            }

        }
        false->{
            Card(
                modifier = modifier.padding(8.dp)
            ) {
                Column(
                    modifier = modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.bca_logo), contentDescription = "", modifier = modifier
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .clip(
                            RectangleShape
                        )
                        .padding(12.dp)
                    )
                    Text(text = "Transaksi telah sukses!", style = TextStyle(fontSize = 18.sp))
                    Text(text = "20 Mei 2024 20:00 gmt+7", style = TextStyle(fontSize = 12.sp))
                    Text(text = "Rp50.000", modifier = modifier.padding(12.dp), style = TextStyle(fontSize = 24.sp))
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Pengirim")
                        Text(text = "Yoga Agatha")
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Bank Tujuan")
                        Text(text = "BCA")
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Nomor Kirim")
                        Text(text = "8930462013")
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "ID Transaksi")
                        Text(text = "2435GASFD7523")
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp)
                            .padding(bottom = 64.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Catatan")
                        Text(text = "")
                    }
                    Row(
                        modifier = modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Button(onClick = {
                        },
                            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                            Image(painter = painterResource(id = R.drawable.download_button), contentDescription = "",
                                modifier = modifier
                                    .height(40.dp)
                                    .width(80.dp))
                        }
                        Button(onClick = {
                        },
                            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                            Image(painter = painterResource(id = R.drawable.share_button), contentDescription = "",
                                modifier = modifier
                                    .height(40.dp)
                                    .width(60.dp))
                        }
                    }
                    ConfirmationButton(text = "Kembali", toConfirm = true, onClickButton = {
                        val value = true
                        navHostController.navigate("detail/$value") }, modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun PaymentStatusPreview(){
    PaymentStatus(modifier = Modifier, navHostController = NavHostController(LocalContext.current), "true")
}