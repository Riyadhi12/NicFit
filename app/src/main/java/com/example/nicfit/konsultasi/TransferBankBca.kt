package com.example.nicfit.konsultasi

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.components.BankTransferAccountInfo
import com.example.nicfit.components.BankTransferCard
import com.example.nicfit.components.BankTransferInstruction


@Composable
fun TransferBankBca(
    modifier: Modifier,
    navHostController: NavHostController,
    valueStr: String
){
    val value = valueStr.toBoolean()
    Column(modifier = modifier.padding(8.dp)) {
        BankTransferCard(bankName = "bca", accountNumber = "1234 087 2100 2927", modifier = modifier.clickable {
            navHostController.navigate("payment_status/$valueStr")
        })
        Text(text = "Informasi", style = TextStyle(fontSize = 24.sp), modifier = modifier.padding(8.dp))
        BankTransferAccountInfo(modifier = modifier)
        Text(text = "Instruksi", style = TextStyle(fontSize = 24.sp), modifier = modifier.padding(8.dp))
        BankTransferInstruction(modifier)
    }
}


@Preview
@Composable
fun TransferBankBcaPreview(){
    TransferBankBca(modifier = Modifier, navHostController = NavHostController(LocalContext.current), "true")
}