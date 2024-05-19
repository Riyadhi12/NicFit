package com.example.nicfit.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens

@Composable
fun profile(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(38.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back3),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .clickable { navController.navigate(Screens.beranda.name) }
            )
            Spacer(modifier = Modifier.width(124.dp)) // Memberikan spasi antara gambar dan teks
            Text(
                text = "Akun",
                modifier = Modifier.align(Alignment.CenterVertically),
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp,
                    //fontWeight = FontWeight.SemiBold
                )
            )
        }

        Spacer(modifier = Modifier.height(12.dp))
        Card(shape = CircleShape,
            modifier = Modifier.size(128.dp)) {
            Image(
                painter = painterResource(id = R.drawable.yoga),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(128.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Yoga",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(22.dp))
        ProfileMenuItem(icon = Icons.Default.AccountCircle, text = "Akun Saya",){
            navController.navigate(Screens.akunsaya.name)
        }
        ProfileMenuItem(icon = Icons.Default.Phone, text = "Hubungi Kami"){
            navController.navigate(Screens.ContactUs.name)
        }
        ProfileMenuItem(icon = Icons.Default.Settings, text = "Pengaturan"){
            navController.navigate(Screens.pengaturan.name)
        }
        ProfileMenuBack(icon = Icons.Default.ExitToApp, text = "Keluar"){

        }
    }
}
@Composable
fun ProfileMenuItem(icon: ImageVector, text: String,onItemClick: ()-> Unit) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color(0xFF508CAE), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 16.sp,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Default.ArrowForwardIos,
            contentDescription = "Arrow",
            tint = Color.Gray,
            modifier = Modifier.
            clickable { onItemClick() }
        )
    }
}
@Composable
fun ProfileMenuBack(icon: ImageVector, text: String,onItemClick: ()-> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .clickable { onItemClick() }
                .size(40.dp)
                .background(Color(0xFF508CAE), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            fontSize = 16.sp,
            modifier = Modifier.weight(1f)
        )
    }
}