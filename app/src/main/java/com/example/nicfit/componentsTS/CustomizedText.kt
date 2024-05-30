package com.example.nicfit.componentsTS

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.nicfit.R

val poppinFamily = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_bold, FontWeight.Bold),
)

@Composable
fun CustomizedTitleText(
    text: String
){
    Text(text = text, fontFamily = poppinFamily, fontWeight = FontWeight.Bold, fontSize = 16.sp)
}

@Composable
fun CustomizedSubtitleText(
    text: String
){
    Text(text = text, fontFamily = poppinFamily, fontWeight = FontWeight.Bold, fontSize = 12.sp)
}

@Composable
fun CustomizedBodyText(
    text: String
){
    Text(text = text, fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 10.sp)
}

@Preview
@Composable
fun CustomizedTitleTextPreview() {
    CustomizedTitleText(text = "Hello")
    CustomizedSubtitleText(text = "Temukan temanmu disini")
    CustomizedBodyText(text = "Pasukan berhenti merokok")
}