package com.example.nicfit.beranda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.ContactPhone
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Web
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material.icons.outlined.BackHand
import androidx.compose.material.icons.outlined.Backpack
import androidx.compose.material.icons.outlined.Web
import androidx.compose.material.icons.outlined.Whatsapp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
//import androidx.compose.material.icons.outlined.Instagram
//import androidx.compose.material.icons.outlined.WhatsApp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens

@Composable
fun ContactUs(navController: NavController) {
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
                text = "Hubungi Kami",
                modifier = Modifier.align(Alignment.CenterVertically),
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 16.sp,
                )
            )
        }
        Spacer(modifier = Modifier.height(38.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            ContactCard(
                icon = Icons.Default.Person,
                title = "Customer Service",
                onClick = { /* handle click */ }
            )

            Spacer(modifier = Modifier.height(16.dp))

            var isWhatsAppExpanded by remember { mutableStateOf(false) }
            ContactCard(
                icon = Icons.Outlined.Whatsapp,
                title = "WhatsApp",
                onClick = { isWhatsAppExpanded = !isWhatsAppExpanded }
            )
            if (isWhatsAppExpanded) {
                WhatsAppDetails()
            }

            Spacer(modifier = Modifier.height(16.dp))

            ContactCard(
                icon = Icons.Default.Web,
                title = "Website",
                onClick = { /* handle click */ }
            )

            Spacer(modifier = Modifier.height(16.dp))

            ContactCard(
                icon = Icons.Outlined.Whatsapp,
                title = "Instagram",
                onClick = { /* handle click */ }
            )
        }
    }
}

@Composable
fun ContactCard(
    icon: ImageVector,
    title: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(317.dp)
            .height(57.dp)
            .clickable(onClick = onClick),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Icon(
                icon,
                contentDescription = title,
                tint = Color(0xFF508CAE),
                modifier = Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                Icons.Default.ArrowForwardIos,
                contentDescription = "Arrow",
                tint = Color.Gray
            )
        }
    }
}

@Composable
fun WhatsAppDetails() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 8.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "(620) 555-1036",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}
