package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun BankTransferInstruction(
    modifier: Modifier
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column {
            RowItemListBankInstruction(modifier = modifier, leadingText = "ATM")
            Divider()
            RowItemListBankInstruction(modifier = modifier, leadingText = "Mobile Banking")
            Divider()
            RowItemListBankInstruction(modifier = modifier, leadingText = "Internet Banking"    )
        }
    }
}

@Composable
fun RowItemListBankInstruction(
    modifier:Modifier,
    leadingText:String,
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(text = leadingText)
        Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = "", modifier = modifier.size(16.dp))
    }
}


@Preview
@Composable
fun BankInstrucitonPreview(){
    BankTransferInstruction(modifier = Modifier)
}