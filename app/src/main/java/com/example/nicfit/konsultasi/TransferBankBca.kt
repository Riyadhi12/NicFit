package com.example.nicfit.konsultasi

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.components.BankTransferAccountInfo
import com.example.nicfit.components.BankTransferCard
import com.example.nicfit.components.BankTransferInstruction
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun TransferBankBca(
    modifier: Modifier,
    navHostController: NavHostController,
    valueStr: String
){
    Column(modifier = modifier.padding(vertical = 8.dp, horizontal = 16.dp)) {
        BankTransferCard(modifier = modifier.clickable {
            navHostController.navigate("payment_status/$valueStr")
        })
        Text(text = "Informasi", style = TextStyle(fontSize = 24.sp), modifier = modifier.padding(8.dp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
        BankTransferAccountInfo(modifier = modifier)
        Text(text = "Instruksi", style = TextStyle(fontSize = 24.sp), modifier = modifier.padding(8.dp).padding(top=8.dp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
        BankTransferInstruction(modifier)
    }
}


@Preview
@Composable
fun TransferBankBcaPreview(){
    TransferBankBca(modifier = Modifier, navHostController = NavHostController(LocalContext.current), "true")
}