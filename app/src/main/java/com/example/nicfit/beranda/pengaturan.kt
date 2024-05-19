package com.example.nicfit.beranda

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens

@Composable
fun pengaturan(navController: NavController) {
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
                modifier = Modifier.size(20.dp)
                .clickable { navController.navigate(Screens.profile.name) }
            )
            Spacer(modifier = Modifier.width(103.dp))
            Text(
                text = "Pengaturan",
                modifier = Modifier.align(Alignment.CenterVertically),
                style = TextStyle(fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 16.sp,
                )
            )
        }
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 63.dp)
        ) {
            notifItem(icon = Icons.Default.Notifications, text = "Notifikasi"){

            }
            pengaturanItem(icon = Icons.Default.Help, text = "Bantuan"){

            }
            pengaturanItem(icon = Icons.Default.Lock, text = "Kebijakan Privasi"){
                navController.navigate(Screens.kebijakanPrivasi.name)
            }
        }

    }
}

@Composable
fun pengaturanItem(icon: ImageVector, text: String, onItemClick: ()-> Unit) {
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
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Arrow",
            tint = Color.Gray,
            modifier = Modifier.
            clickable { onItemClick() }
        )
    }
}
@Composable
fun notifItem(icon: ImageVector, text: String, onItemClick: ()-> Unit) {
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
    }
}