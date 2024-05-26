package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun BankTransferCard(
    modifier: Modifier,
    bankName: String,
    //bankname dipake nanti kalo misalnya mau dinamis
    accountNumber: String
) {
    Card(modifier.fillMaxWidth()) {
        Column(
            modifier = modifier.fillMaxWidth().clickable {
                
            }
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween    ,
                modifier = modifier.fillMaxWidth()
            ){
                Text(text = "Pilih Bank",
                    modifier
                        .padding(start = 16.dp)
                        .padding(top = 14.dp))
                TextButton(onClick = {}) {
                    Text(text = "Ganti >", color = Color.DarkGray)
                }
            }
            Image(painter = painterResource(id = R.drawable.bca_logo), contentDescription = "",
                modifier
                    .height(100.dp)
                    .width(200.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .clip(
                        RectangleShape
                    ))
            Text(text = "Virtual Account Billing",
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 125.dp))
            OutlinedCard(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 100.dp, vertical = 8.dp)
                    .height(40.dp)
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier.padding(top = 4.dp)
                ){
                    Text(text = "1234 087 2100 2927", modifier.padding(start = 12.dp), color = colorResource(
                        id = R.color.blue_nicfit
                    ))
                    Column (
                        modifier = modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(painter = painterResource(id = R.drawable.copy), contentDescription = "",
                            modifier = modifier.size(14.dp))
                        Text(text = "COPY", color = Color.Gray)
                    }

                }
            }
        }
    }
}

@Preview
@Composable
fun BankTransferCardPreview() {
    BankTransferCard(bankName = "BCA", accountNumber = "1234567890", modifier = Modifier)
}