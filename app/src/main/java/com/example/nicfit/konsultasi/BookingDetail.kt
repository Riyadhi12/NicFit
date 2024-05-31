package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.components.CustomizedBackground
import com.example.nicfit.componentsTS.CustomizedWhiteBackground
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun BookingDetail(
    modifier: Modifier,
    navHostController: NavHostController
) {
    Box(modifier = modifier){
        CustomizedWhiteBackground()
        Column {
            Image(painter = painterResource(id = R.drawable.doctor_nobg), contentDescription = null,
                modifier
                    .size(215.dp)
                    .fillMaxWidth()
                    .align(
                        Alignment.CenterHorizontally
                    ))
            Column (
                modifier = modifier.padding(horizontal = 30.dp, vertical = 12.dp)
            ) {
                Text(text = stringResource(id = R.string.doctor_name), fontFamily = poppinFamily, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = modifier.padding(top = 16.dp))
                Text(text = stringResource(id = R.string.doctor_spec), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 12.sp, color = Color.Gray)
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Tanggal", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    TextButton(onClick = {},
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = colorResource(id = R.color.blue_nicfit)
                        )) {
                        Text(text = "Ubah", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = colorResource(
                            id = R.color.blue_nicfit
                        ))
                    }
                }
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(painter = painterResource(id = R.drawable.calendar_icon), contentDescription = "", modifier = modifier.size(36.dp))
                    Text(text = "Rabu, Maret 23, 2024 | 02:00 PM", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, modifier = modifier.padding(start = 8.dp))
                }
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Layanan", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 18.sp)
                    TextButton(onClick = {},
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = colorResource(id = R.color.blue_nicfit)
                        )) {
                        Text(text = "Ubah", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = colorResource(
                            id = R.color.blue_nicfit
                        ))
                    }
                }
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(painter = painterResource(id = R.drawable.call_icon), contentDescription = "", modifier = modifier.size(36.dp))
                    Text(text = "Chat", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, modifier = modifier.padding(start = 8.dp))
                }
                Text(text = "Pembayaran", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 18.sp, modifier = modifier
                    .padding(top = 14.dp))
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Panggilan Suara", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = Color.Gray)
                    Text(text = "Rp30.000", fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                }
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Biaya Admin", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = Color.Gray)
                    Text(text = "Rp2000", fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                }
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Diskon", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = Color.Gray)
                    Text(text = "Rp5000", fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                }
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Total", fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                    Text(text = "Rp27.000", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = colorResource(id = R.color.blue_nicfit))
                }
                ConfirmationButton(text = "Pesan", toConfirm = true, onClickButton = {
                    navHostController.navigate("payment_bank/true")
                }, modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                )
            }
        }
    }
}