package com.example.nicfit.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun AvatarText(
    modifier: Modifier,
    avatarText:String
){
    val colorBackground: Color = colorResource(id = R.color.avatar_text_background)
    Text(
        modifier = modifier
            .padding(16.dp)
            .drawBehind {
                drawCircle(
                    color = colorBackground,
                    radius = this.size.maxDimension
                )
            },
        text = avatarText,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = poppinFamily,
        color = colorResource(id = R.color.avatar_text)
    )
}