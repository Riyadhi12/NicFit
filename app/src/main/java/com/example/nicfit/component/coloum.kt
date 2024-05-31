package com.example.nicfit.component

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.SmokingRooms
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFE1F5FE)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.White)
                .clip(MaterialTheme.shapes.medium)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                //horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Default.AttachMoney,
                    contentDescription = "Hemat Uang",
                    tint = Color(0xFF4CAF50),
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFE8F5E9))
                        .padding(8.dp)
                )
                Text(
                    text = "Hemat Uang",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Rp.50,000",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .height(40.dp)
                    .width(1.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Default.SmokingRooms,
                    contentDescription = "Tidak Merokok",
                    tint = Color(0xFFF44336),
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFFFEBEE))
                        .padding(8.dp)
                )
                Text(
                    text = "Tidak Merokok",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Text(
                    text = "20",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
