package com.example.nicfit.lupasandi

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun konfirmasiSandi(navController: NavController) {
    var password by remember { mutableStateOf("") }
    var konfirpassword by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, top = 38.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.back3),
            contentDescription = null,
            modifier = Modifier
                .size(20.dp)

                .clickable { navController.navigate(Screens.cdVerifikasi.name) }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Tetapkan Kata Sandi Baru",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 24.dp, top = 129.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Buat kata sandi baru. Pastikan itu berbeda dari\n" +
                    "yang sebelumnya untuk keamanan",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(38.dp))
        Text(
            text = "Kata Sandi",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(start = 24.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .width(350.dp)
                .align(Alignment.Start),
            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
            value = password, onValueChange = {password = it },
            placeholder = {
                Text (text = "Masukkan Kata Sandi Baru Anda",
                    modifier = Modifier,
                    fontSize = 13.sp)
            }, visualTransformation = PasswordVisualTransformation(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray,
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Konfirmasi Kata Sandi",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(start = 24.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .width(350.dp)
                .align(Alignment.Start),
            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
            value = konfirpassword, onValueChange = {konfirpassword = it },
            placeholder = {
                Text (text = "Masukkan Kata Sandi Baru Anda",
                    modifier = Modifier,
                    fontSize = 13.sp)
            }, visualTransformation = PasswordVisualTransformation(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray,
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button( onClick = {
            navController.navigate(Screens.login.name)
        }, modifier = Modifier
            .padding(start = 24.dp, top = 1.dp)
            .width(350.dp)
            .height(48.dp),
            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE)))
        {
            Text(text = "Verifikasi Kode")
        }
    }
}

