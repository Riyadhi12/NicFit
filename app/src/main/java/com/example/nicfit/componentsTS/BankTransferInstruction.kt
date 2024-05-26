package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Card {
        Column {
            Row(
                modifier = modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "ATM")
                Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = "", modifier = modifier.size(16.dp))
            }
            Divider()
            Row(
                modifier = modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Mobile Banking")
                Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = "", modifier = modifier.size(16.dp))
            }
            Divider()
            Row(
                modifier = modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Internet Banking")
                Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = "", modifier = modifier.size(16.dp))
            }
        }
    }
}

@Preview
@Composable
fun BankInstrucitonPreview(){
    BankTransferInstruction(modifier = Modifier)
}