package com.example.nicfit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.componentsTS.poppinFamily

@Composable
fun BankTransferAccountInfo(
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(8.dp)) {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {
            RowItemList(modifier = modifier, leadingText = "Nama Akun", endingText = "Yoga Agatha", color = Color.Black)
            Divider()
            RowItemList(modifier = modifier, leadingText = "Total Pembayaran", endingText = "Rp50.000", color = Color.Black)
            Divider()
            RowItemList(modifier = modifier, leadingText = "Bayar Dalam", endingText = "23 jam 59 menit 59 detik", color = Color.Red)
        }
    }
}

@Composable
fun RowItemList(
    modifier: Modifier,
    leadingText:String,
    endingText:String,
    color: Color
){
    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(text = leadingText, fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
        Text(text = endingText, fontFamily = poppinFamily, fontWeight = FontWeight.Normal, color = color)
    }
}

@Preview
@Composable
fun BankTransferPreview(){
    BankTransferAccountInfo(modifier = Modifier)
}