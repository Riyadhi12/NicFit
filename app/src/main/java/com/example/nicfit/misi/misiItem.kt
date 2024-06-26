package com.example.nicfit.misi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.data.Misi
import com.example.nicfit.data.MisiRepository
import com.example.nicfit.navigation.Screens

@Composable
fun DaftarMisi(
    misis: List<Misi>,
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items = misis,key = {it.id},
            itemContent = {
                MisiItem(misi = it){ misiId ->
                    navController.navigate(Screens.detailMisi.name + "/${misiId}")
                }
            }
        )
    }
}

@Composable
fun MisiItem(
    misi: Misi,
    modifier : Modifier = Modifier,
    onClick: (Int) -> Unit
) {
        Row(
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
                .background(
                    color = Color.Gray.copy(alpha = 0.1f),
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(16.dp)
                .clickable { onClick(misi.id) }
        ) {
            // Column for text content
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp) // Add some padding between text and image
            ) {
                Text(text = misi.nama, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = misi.deskripsi, fontSize = 12.sp)
            }

            // Image on the right
            Image(
                painter = painterResource(id = misi.img),
                contentDescription = misi.nama,
                modifier = Modifier
                    .size(100.dp) // Set the size of the image
                    .clip(RoundedCornerShape(8.dp)) // Clip the image with rounded corners
            )
        }
}




