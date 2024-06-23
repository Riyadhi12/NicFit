package com.example.nicfit.misi

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.MisiRepository
import com.example.nicfit.navigation.Screens

@Composable
fun progress(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 38.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(38.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back3),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .clickable { navController.navigate(Screens.misi.name) }
            )
            Spacer(modifier = Modifier.width(103.dp))
            Text(
                text = "Progress",
                modifier = Modifier.padding(start = 20.dp),
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 16.sp,
                )
            )
        }
        Text(
            text = "Belum Bisa Menampilkan Progress {*_*}",
            modifier = Modifier.padding(start = 30.dp, top = 150.dp),
            style = TextStyle(
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                fontSize = 16.sp,
            )
        )
    }
}
