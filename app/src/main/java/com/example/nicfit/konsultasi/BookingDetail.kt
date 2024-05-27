package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.components.CustomizedBackground


@Composable
fun BookingDetail(
    modifier: Modifier,
    navHostController: NavHostController
) {
    Box(modifier = modifier){
        CustomizedBackground()
        Column {
            Image(painter = painterResource(id = R.drawable.doctor), contentDescription = null,
                modifier
                    .size(280.dp)
                    .fillMaxWidth()
                    .align(
                        Alignment.CenterHorizontally
                    ))
            Text(text = stringResource(id = R.string.doctor_name))
            Text(text = stringResource(id = R.string.doctor_spec))
            Row (
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Tanggal")
                TextButton(onClick = {}) {
                    Text(text = "Ubah")
                }
            }
            Row {
                Image(painter = painterResource(id = R.drawable.calendar_icon), contentDescription = "", modifier = modifier.size(16.dp))
                Text(text = "Rabu, Maret 23, 2024 | 02:00 PM")
            }
            Row {
                Box(modifier = modifier){
                    Image(painter = painterResource(id =R.drawable.chat_backgruond), contentDescription = "", modifier = modifier.size(16.dp))
                    Image(painter = painterResource(id = R.drawable.call), contentDescription = "", modifier = modifier.size(16.dp))
                }
            }
            Text(text = "Pembayaran")
            Row (
                modifier = modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Panggilan Suara")
                Text(text = "Rp30.000")
            }
            Row (
                modifier = modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Biaya Admin")
                Text(text = "Rp2000")
            }
            Row (
                modifier = modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Diskon")
                Text(text = "-")
            }
            Row (
                modifier = modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Total")
                Text(text = "Rp32.000")
            }
            ConfirmationButton(text = "Pesan", toConfirm = true, onClickButton = {
                navHostController.navigate("payment_bank/true")
            }, modifier = modifier.fillMaxWidth().padding(horizontal = 8.dp))
        }
    }
}