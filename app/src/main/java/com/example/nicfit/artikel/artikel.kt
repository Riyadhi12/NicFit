package com.example.nicfit.artikel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun artikel() {
   Box(
       modifier = Modifier
           .fillMaxSize()
           .background(color = Blue)
   ) {
       Column(
           modifier = Modifier.fillMaxWidth()
               .padding(top = 40.dp)
       ) {
            Text(text = "Artikel",
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
           Spacer(modifier = Modifier.height(16.dp))
           Text(text = "Temukan Panduang Yang bisa Membuat Mu\n"+
                       "           Semangat Untuk Berhenti Merokok",
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
               //.padding(start = 6.dp, end = 6.dp)
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