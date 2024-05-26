package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun WelcomPaidModalSheet(
    modifier: Modifier,
){
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Selamat Datang!")
        Text(text = "Selamat akun anda sudah dalam versi pro")
        Image(painter = painterResource(id = R.drawable.welcome_modal), contentDescription = "", modifier = modifier.size(200.dp))
    }
}

@Preview
@Composable
fun PreviewWelcomPaidModalSheet(){
    WelcomPaidModalSheet(modifier = Modifier)
}