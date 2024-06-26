package com.example.nicfit.teman_sehat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.ui.theme.Blue

@Composable
fun temanSehat() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Blue)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 40.dp)
        ) {
            Text(text = "Teman Sehat",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Temukan teman dan cara mengatasi kesepian\n"+
                        "                      dan kesendirian mu",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 12.sp,
                    //fontWeight = FontWeight.Bold
                )
            )
        }
        Box( //Box Bawah
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.70f)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
                )
        )
    }
}