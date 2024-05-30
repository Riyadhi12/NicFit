package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily

@Composable
fun MessageServiceItemList(
    logo:Int,
    logoBackground:Int,
    title:String,
    price:String,
    subtitle:String,
    selected:Boolean,
    modifier: Modifier
){
    Card (
        modifier = modifier
            .fillMaxWidth()
            .height(86.dp)
            .padding(vertical = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.white)
        ),
        elevation = CardDefaults.cardElevation(
            12.dp
        ),
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.fillMaxWidth().padding(top = 8.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = modifier.padding(horizontal = 12.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(painter = painterResource(id = logo), contentDescription = "", modifier = modifier.size(36.dp))
                    Image(painter = painterResource(id = logoBackground), contentDescription = "", modifier = modifier.size(48.dp))
                }
                Column {
                    Text(text = title, fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp)
                    Text(text = subtitle, fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 10.sp, color = Color.Gray)
                }
            }
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = price)
                RadioButton(selected = selected, onClick = {}, colors = RadioButtonDefaults.colors(colorResource(id = R.color.blue_nicfit)))
            }
        }
    }
}
