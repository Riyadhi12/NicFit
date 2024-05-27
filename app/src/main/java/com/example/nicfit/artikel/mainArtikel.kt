package com.example.nicfit.artikel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.ui.theme.Blue

@Composable
fun Artikel() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Blue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
        ) {
            Text(
                text = "Artikel",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Temukan Panduan Yang bisa Membuat Mu\n" + "       Semangat Untuk Berhenti Merokok",
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
                .fillMaxHeight(0.75f)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
                )
        )
    }

    //Search Bar
    var textState by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 160.dp) // Adjust padding to position the Column
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(15.dp))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(13.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search Bar",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            BasicTextField(
                value = textState,
                onValueChange = { textState = it },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                if (textState.text.isEmpty()) {
                    Text(
                        text = "Cari Artikel",
                        color = Color.Gray
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}

@Preview(showBackground = true)
@Composable
fun ArtikelPrev(){
    Artikel()
}