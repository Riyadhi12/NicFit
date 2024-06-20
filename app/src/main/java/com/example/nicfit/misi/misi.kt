package com.example.nicfit.misi

import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.SmokingRooms
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.component.searchBar
import com.example.nicfit.componentsTS.poppinFamily
import com.example.nicfit.ui.theme.Blue

@Composable
fun misi() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Blue)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 33.dp, start = 31.dp)
        ) {
            Column {
                Text(
                    text = "Hari Ini",
                    modifier = Modifier,
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = poppinFamily
                    )
                )
                Text(
                    text = "Rabu,05 Juni 2024",
                    modifier = Modifier,
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = poppinFamily
                    )
                )

            }
            Column(
                modifier = Modifier.padding(start = 178.dp)
            ) {
                Text(
                    text = "POIN",
                    modifier = Modifier,
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    text = "10",
                    modifier = Modifier,
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            //Spacer(modifier = Modifier.height(16.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 90.dp)
        ) {
            CalendarView()
        }

        Box( //Box Bawah
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.71f)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
                )
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 165.dp) // Adjust padding to position the Column
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
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
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Hemat Uang",
                )
                Text(
                    text = "Rp.50,000",
                )
            }
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .height(40.dp)
                    .width(1.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Box {
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
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Tidak Merokok",
                )
                Text(
                    text = "20",
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(134.dp)
                .padding(vertical = 7.dp, horizontal = 24.dp)
                .background(
                    color = Blue.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            Row {
                Image(painter = painterResource(id = R.drawable.docman),
                    contentDescription = "",
                    modifier = Modifier.padding(start = 12.dp)
                )
                Text (text = "Lihat Progress bulan ini\nyuk!!",
                    modifier = Modifier.padding(start = 20.dp, top = 18.dp),
                    //fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = { }, modifier = Modifier
                    .padding(top = 70.dp, start = 150.dp)
                    .width(100.dp)
                    .height(30.dp),
                shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE)))
            {
                Text(text = "Lihat Detail",
                    fontSize = 10.sp)
            }
        }
        Column(
            modifier = Modifier.padding(start = 28.dp, top = 18.dp, bottom = 12.dp)
        ) {
            Text(
                text = "Misi",
                modifier = Modifier,
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Column(

        ) {
            TabbedInterface()
        }

    }
}
