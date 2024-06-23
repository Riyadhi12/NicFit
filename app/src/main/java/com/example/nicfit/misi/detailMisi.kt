package com.example.nicfit.misi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.Emosional
import com.example.nicfit.data.Misi
import com.example.nicfit.data.MisiRepository
import com.example.nicfit.data.MisiRepository.misiBerjalan
import com.example.nicfit.data.dataEmosional
import com.example.nicfit.navigation.Screens

@Composable
fun detailMisi(
    modifier : Modifier = Modifier,
    navController: NavController,
    misiId : Int?
) {
    val newMisiList = MisiRepository.semuaMisi.filter { misi ->
        misi.id == misiId
    }
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
                text = "Misi",
                modifier = Modifier.padding(start = 30.dp),
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 16.sp,
                )
            )
        }
        Column(
            modifier
                .fillMaxSize()
                .padding(25.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ){
            detailMisiContent(newMisiList = newMisiList,navController = navController)
        }
    }
}

@Composable
fun detailMisiContent(
    newMisiList: List<Misi>,
    navController: NavController,
    modifier : Modifier = Modifier,
) {
    if (newMisiList.isNotEmpty()) {
        Column{
            newMisiList.forEach { misi ->
                Box(
                    modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = misi.img),
                        contentDescription = null,
                        modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .fillMaxWidth()
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .padding(bottom = 36.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = misi.nama,
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            fontSize = 16.sp,
                        )
                    )
                }
                Text(
                    text = "Petunjuk",
                    modifier = Modifier.padding(bottom = 7.dp)
                )
                Text(
                    text = misi.petunjuk,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    text = "Manfaat",
                    modifier = Modifier.padding(bottom = 7.dp)
                )
                Text(text = misi.manfaat, fontSize = 12.sp)
            }
            Box(
                modifier = Modifier
                    .padding(start = 65.dp, top = 50.dp)
                    .width(208.dp)
                    .height(66.dp)
                    .shadow(4.dp, shape = RoundedCornerShape(10.dp)) // Tambahkan shadow di sini
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                ,contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 15.dp)) {
                        Text(text = "Durasi", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                        Text(text = "20 Menit", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Divider(
                        color = Color.Gray,
                        modifier = Modifier
                            .height(30.dp)
                            .width(1.dp)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 15.dp)) {
                        Text(text = "POIN", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "10", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(4.dp))
                            Box(
                                modifier = Modifier
                                    .size(18.dp)
                                    .background(color = Color(0xFFFFD700), shape = RoundedCornerShape(50))
                            )
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize(),  // Memastikan Box mengisi seluruh layar
                contentAlignment = Alignment.Center  // Menempatkan konten di tengah Box
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .width(301.dp)
                        .height(44.39.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE))
                ) {
                    Text(
                        text = "Mulai",
                        style = TextStyle(
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            fontSize = 16.sp,
                        )
                    )
                }
            }
        }
    }
}