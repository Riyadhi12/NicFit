package com.example.nicfit.konsultasi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.components.DatePickCard
import com.example.nicfit.components.TimePickCard


@Composable
fun KonsulDateTimeChoose(
    modifier: Modifier,
    navController:NavHostController
){
    Column (modifier = modifier.fillMaxWidth()){
        Text(text = "Pilih Tanggal", modifier = modifier.padding(top = 12.dp, start = 12.dp, bottom = 12.dp))
        DatePickCard(modifier = modifier)
        TimePickCard(modifier = modifier)
        ConfirmationButton(text = "Tetapkan Waktu", toConfirm = true, onClickButton = {
            navController.navigate("konsul_method")
        }, modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .padding(top = 36.dp))
    }
}

@Preview
@Composable
fun PreviewKonsulDateTimeChoose(){
    KonsulDateTimeChoose(modifier = Modifier, navController = NavHostController(LocalContext.current))
}