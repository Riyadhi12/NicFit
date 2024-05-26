package com.example.nicfit.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.nicfit.R


@Composable
fun AvatarText(
    modifier: Modifier,
    avatarText:String
){
    val colorBackground: Color = colorResource(id = R.color.blue_nicfit)
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
    )
}