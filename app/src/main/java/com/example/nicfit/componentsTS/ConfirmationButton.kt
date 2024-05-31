package com.example.nicfit.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun ConfirmationButton(
    text: String,
    toConfirm:Boolean,
    onClickButton:()->Unit,
    modifier: Modifier
){
    val backgroundColorToConfirm = when(toConfirm){
        true -> colorResource(id = R.color.blue_nicfit)
        false -> colorResource(id = R.color.white)
    }
    val textColorToConfirm = when(toConfirm){
        true -> colorResource(id = R.color.white)
        false -> colorResource(id = R.color.blue_nicfit)
    }
    Button(
        modifier = modifier.height(54.dp).border(color = colorResource(id = R.color.blue_nicfit), width = 1.dp, shape = RoundedCornerShape(20)),
        onClick = onClickButton,
        shape = RoundedCornerShape(20),
        colors = ButtonDefaults.buttonColors(backgroundColorToConfirm)
        ) {
        Text(text = text, color = textColorToConfirm, fontWeight = FontWeight.Normal, fontFamily = poppinFamily)
    }
}
