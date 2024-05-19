package com.example.nicfit.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.component.button
import com.example.nicfit.navigation.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun akunsaya(navController: NavController) {
    var namaLengkap by remember {
        mutableStateOf("")
    }
    var namaPengguna by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var nomortlpn by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
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
                    text = "Akun Saya",
                    modifier = Modifier.align(Alignment.CenterVertically),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        fontSize = 16.sp,
                    )
                )
            }
            Spacer(modifier = Modifier.height(27.dp))
            Text(
                text = "Nama Lengkap",
                modifier = Modifier
                    .padding(start = 50.dp, top = 7.dp)
                    .align(Alignment.Start),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(9.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(292.dp),
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
                value = namaLengkap, onValueChange = {namaLengkap = it
                }, placeholder = {
                    Text(
                        text = "Nama Lengkap",
                        modifier = Modifier,
                        fontSize = 13.sp
                    )

                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Nama Pengguna",
                modifier = Modifier
                    .padding(start = 50.dp, top = 7.dp)
                    .align(Alignment.Start),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(9.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(292.dp),
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
                value = namaPengguna, onValueChange = {namaPengguna = it
                }, placeholder = {
                    Text(
                        text = "Nama Pengguna",
                        modifier = Modifier,
                        fontSize = 13.sp
                    )

                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Email",
                modifier = Modifier
                    .padding(start = 50.dp, top = 7.dp)
                    .align(Alignment.Start),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(9.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(292.dp),
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
                value = email, onValueChange = {email = it
                }, placeholder = {
                    Text(
                        text = "Email",
                        modifier = Modifier,
                        fontSize = 13.sp
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Nomor Telepon",
                modifier = Modifier
                    .padding(start = 50.dp, top = 7.dp)
                    .align(Alignment.Start),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(9.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(292.dp),
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
                value = nomortlpn, onValueChange = {nomortlpn = it
                }, placeholder = {
                    Text(
                        text = "No Telepon",
                        modifier = Modifier,
                        fontSize = 13.sp
                    )

                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Password",
                modifier = Modifier
                    .padding(start = 50.dp, top = 7.dp)
                    .align(Alignment.Start),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(9.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(292.dp),
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
                value = password, onValueChange = {password = it
                }, placeholder = {
                    Text(
                        text = "Password",
                        modifier = Modifier,
                        fontSize = 13.sp
                    )

                }, visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF508CAE),
                    focusedLabelColor = Color.Gray
                )
            )
            Spacer(modifier = Modifier.height(100.dp))
            button(text = "Edit")
        }
}