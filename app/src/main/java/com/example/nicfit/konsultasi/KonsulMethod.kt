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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.components.MessageServiceItemList


@Composable
fun KonsulMethod(
    modifier: Modifier,
    navHostController: NavHostController
){
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
    ){
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(text = "Pilih Layanan")
            MessageServiceItemList(logo = R.drawable.chat, logoBackground = R.drawable.chat_backgruond, title = "Chat", price = "Gratis", selected = false, modifier = modifier)
            MessageServiceItemList(logo = R.drawable.call, logoBackground = R.drawable.call_background, title = "Panggilan Suara", price = "Rp30.000", selected = true, modifier = modifier)
            MessageServiceItemList(logo = R.drawable.vidcall, logoBackground = R.drawable.vidcall_background, title = "Panggilan Video", price = "Rp30.000", selected = false, modifier = modifier)
        }
        ConfirmationButton(text = "Lanjutkan", toConfirm = true, onClickButton = {
            navHostController.navigate("booking_detail")
        }, modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp))
    }
}

@Preview
@Composable
fun KonsulMethodPreview(){
    KonsulMethod(modifier = Modifier, navHostController = NavHostController(LocalContext.current))
}