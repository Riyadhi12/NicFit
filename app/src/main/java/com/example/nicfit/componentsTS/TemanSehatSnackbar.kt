package com.example.nicfit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TemanSehatSnackbar(
    modifier: Modifier
){
    Column {
        Column(
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Pasukan Berhenti Merokok")
            Text(text = "4,412 members")
        }
        Text(text = "Berbincang santuy tips and trik untuk berhenti merokok")
        ConfirmationButton(text = "Gabung Komunitas", toConfirm = true, onClickButton = {}, modifier)
    }
}