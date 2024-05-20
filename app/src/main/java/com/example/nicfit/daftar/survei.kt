package com.example.nicfit.daftar


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.navigation.Screens

@Composable
fun survei(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF5F5F5)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            UserInputForm(navController)
        }
    }
}

@Composable
fun UserInputForm(navController: NavController) {
    var dailyCigarettes by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var cigarettesPerPack by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var packPrice by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Box(
        modifier = Modifier
            .padding(16.dp)
            .height(335.dp)
            .width(279.dp)
            .shadow(8.dp, RoundedCornerShape(16.dp))
            .background(Color.White, RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Dalam sehari kamu biasanya habis berapa batang rokok?",
                modifier = Modifier.padding(start = 12.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                ),
            )
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(230.dp)
                    .height(42.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(8.dp),
                value = dailyCigarettes,
                onValueChange = { dailyCigarettes = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Berapa batang rokok dalam satu bungkus?",
                modifier = Modifier.padding(start = 12.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                ),
            )
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(230.dp)
                    .height(42.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(8.dp),
                value = cigarettesPerPack,
                onValueChange = { cigarettesPerPack = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Berapa harga satu bungkus rokok kamu?",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.height(6.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(230.dp)
                    .height(42.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(8.dp),
                value = packPrice,
                onValueChange = { packPrice = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {
                    navController.navigate(Screens.login.name)
                          },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF508CAE)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .width(230.dp)
                    .height(42.dp)
            ) {
                Text(
                    text = "Simpan",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }
}