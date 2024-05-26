package com.example.nicfit.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.nicfit.R


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
        modifier = modifier,
        onClick = onClickButton,
        colors = ButtonDefaults.buttonColors(backgroundColorToConfirm)
        ) {
        Text(text = text, color = textColorToConfirm)
    }
}
