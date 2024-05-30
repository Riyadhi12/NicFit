package com.example.nicfit.konsultasi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.components.MessageServiceItemList
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun KonsulMethod(
    modifier: Modifier,
    navHostController: NavHostController
){
    Column (
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
    ){
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(text = "Pilih Layanan", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp)
            MessageServiceItemList(logo = R.drawable.chat, logoBackground = R.drawable.chat_backgruond, title = "Chat", price = "Rp30.000", subtitle = "1 Jam", selected = true, modifier = modifier)
            MessageServiceItemList(logo = R.drawable.call, logoBackground = R.drawable.call_background, title = "Panggilan Suara", price = "Rp50.000", subtitle = "Layanan belum tersedia", selected = false, modifier = modifier)
            MessageServiceItemList(logo = R.drawable.vidcall, logoBackground = R.drawable.vidcall_background, title = "Panggilan Video", price = "Rp75.000", subtitle = "Layanan belum tersedia", selected = false, modifier = modifier)
            Text(text = "Pilih Voucher", fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp, modifier = modifier.padding(top = 16.dp))
            MessageServiceItemList(
                logo = R.drawable.doctor_2,
                logoBackground = R.drawable.chat_backgruond,
                title = "Diskon Rp5RB",
                price = "Klaim",
                subtitle = "Berlaku Sampai 08 Mei 2024",
                selected = true,
                modifier = modifier
            )
            MessageServiceItemList(
                logo = R.drawable.doctor_nobg,
                logoBackground = R.drawable.chat_backgruond,
                title = "Diskon Rp5RB",
                price = "Klaim",
                subtitle = "Berlaku Sampai 08 Mei 2024",
                selected = false,
                modifier = modifier
            )
        }

        ConfirmationButton(text = "Lanjutkan", toConfirm = true, onClickButton = {
            navHostController.navigate("booking_detail")
        }, modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp))
    }
}

@Preview
@Composable
fun KonsulMethodPreview(){
    KonsulMethod(modifier = Modifier, navHostController = NavHostController(LocalContext.current))
}