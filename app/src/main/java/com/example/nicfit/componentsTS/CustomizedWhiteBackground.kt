package com.example.nicfit.componentsTS

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun CustomizedWhiteBackground(
){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Blue background
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.blue_nicfit).copy(alpha = 0.1f))
                .alpha(10f)
        )

        // White shape
        Spacer(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(550.dp)
                .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .background(Color.White)
        )
    }
}