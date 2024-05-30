package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily

@Composable
fun BankTransferCard(
    modifier: Modifier
    //bankname dipake nanti kalo misalnya mau dinamis
) {
    Card(
        modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        elevation = 12.dp,
        shape = RoundedCornerShape(25.dp)
        ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .clickable {

                }
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween    ,
                modifier = modifier.fillMaxWidth()
            ){
                Text(text = "Pilih Bank",
                    modifier
                        .padding(start = 16.dp)
                        .padding(top = 14.dp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                TextButton(onClick = {}) {
                    Text(text = "Ganti >", color = Color.DarkGray, fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
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
                    .padding(horizontal = 50.dp), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 22.sp,
            )
            OutlinedCard(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 70.dp, vertical = 8.dp)
                    .height(40.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = Color.White
                )
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier.padding(top = 4.dp)
                ){
                    Text(text = "1234 087 2100 2927", modifier.padding(start = 12.dp), color = colorResource(
                        id = R.color.blue_nicfit
                    ), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp)
                    Column (
                        modifier = modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(painter = painterResource(id = R.drawable.copy), contentDescription = "",
                            modifier = modifier.size(14.dp))
                        Text(text = "COPY", color = Color.Gray, fontFamily = poppinFamily, fontWeight = FontWeight.Normal,)
                    }

                }
            }
            Spacer(modifier = modifier.padding(bottom = 12.dp))
        }
    }
}

@Preview
@Composable
fun BankTransferCardPreview() {
    BankTransferCard(modifier = Modifier)
}