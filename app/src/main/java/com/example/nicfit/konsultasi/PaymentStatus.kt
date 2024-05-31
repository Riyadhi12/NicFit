package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.componentsTS.poppinFamily
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
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 12.dp)
                    .padding(top = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = modifier.padding(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(8.dp)
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
                        Text(text = "Transaksi telah sukses!", style = TextStyle(fontSize = 18.sp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                        Text(text = "20 Mei 2024 20:00 gmt+7", modifier = modifier.padding(8.dp),style = TextStyle(fontSize = 12.sp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = Color.Gray)
                        Text(text = "Rp27.000",modifier = modifier.padding(16.dp), style = TextStyle(fontSize = 36.sp), fontFamily = poppinFamily, fontWeight = FontWeight.Bold,)
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Pengirim", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                            Text(text = "Yoga Agatha", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Bank Tujuan", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                            Text(text = "BCA", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Nomor Kirim", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                            Text(text = "8930462013", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "ID Transaksi", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                            Text(text = "2435GASFD7523", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        }
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Catatan", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
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
                                        .size(96.dp))
                            }
                            Button(onClick = {
                            },
                                colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                                Image(painter = painterResource(id = R.drawable.share_button), contentDescription = "",
                                    modifier = modifier
                                        .size(86.dp))
                            }
                        }

                    }
                }
                Column (
                    modifier = modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    ConfirmationButton(text = "Kembali", toConfirm = false, onClickButton = {
                        navHostController.navigate("konsultasiList") },
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 36.dp))
                    ConfirmationButton(text = "Chat Konsultan", toConfirm = true, onClickButton = {
                        navHostController.navigate(Screens.konsul_chat.name) },
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 36.dp))
                }
            }

        }
        false->{
            Card(
                modifier = modifier.padding(horizontal = 12.dp, vertical = 36.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(8.dp),
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
                    Text(text = "Transaksi telah sukses!", style = TextStyle(fontSize = 18.sp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                    Text(text = "20 Mei 2024 20:00 gmt+7", modifier = modifier.padding(8.dp),style = TextStyle(fontSize = 12.sp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = Color.Gray)
                    Text(text = "Rp50.000", modifier = modifier.padding(8.dp), style = TextStyle(fontSize = 36.sp), fontFamily = poppinFamily, fontWeight = FontWeight.Bold,)
                    Spacer(modifier = modifier.padding(8.dp))
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Pengirim", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        Text(text = "Yoga Agatha", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Bank Tujuan", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        Text(text = "BCA", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Nomor Kirim", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        Text(text = "8930462013", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "ID Transaksi", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                        Text(text = "2435GASFD7523", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 4.dp)
                            .padding(bottom = 24.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Catatan", fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
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
                                    .size(96.dp))
                        }
                        Button(onClick = {
                        },
                            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
                            Image(painter = painterResource(id = R.drawable.share_button), contentDescription = "",
                                modifier = modifier
                                    .size(86.dp))
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