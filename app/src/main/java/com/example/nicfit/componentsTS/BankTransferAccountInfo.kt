package com.example.nicfit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BankTransferAccountInfo(
    modifier: Modifier
) {
    Card {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {
            Row (
                modifier = modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Nama Akun")
                Text(text = "Yoga Agatha")
            }
            Divider()
            Row (
                modifier = modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Total Pembayaran")
                Text(text = "Rp. 50.000")
            }
            Divider()
            Row (
                modifier = modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Bayar Dalam")
                Text(text = "23 jam 59 menit 59 detik", color = Color.Red)
            }
        }
    }
}

@Preview
@Composable
fun BankTransferPreview(){
    BankTransferAccountInfo(modifier = Modifier)
}