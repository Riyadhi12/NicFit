package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun MessageServiceItemList(
    logo:Int,
    logoBackground:Int,
    title:String,
    price:String,
    selected:Boolean,
    modifier: Modifier
){
    Card (
        modifier = modifier.fillMaxWidth().padding(vertical = 12.dp)
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxWidth()
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = modifier.padding(horizontal = 12.dp)
                ) {
                    Image(painter = painterResource(id = logo), contentDescription = "", modifier = modifier.size(24.dp))
                    Image(painter = painterResource(id = logoBackground), contentDescription = "", modifier = modifier.size(24.dp))
                }
                Column {
                    Text(text = title)
                    Text(text = "1 Jam")
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
