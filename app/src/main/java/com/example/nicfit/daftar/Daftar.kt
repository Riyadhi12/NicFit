@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.nicfit.daftar

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.component.button
import com.example.nicfit.navigation.Screens

@Composable
fun RegisScreen(navController: NavController){
    var namaPengguna by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("") }

    var konfirmasi by remember {
        mutableStateOf("")
    }
    var passwordVisibility by remember { mutableStateOf(false) }

    val icon = if (passwordVisibility)
        painterResource(id = R.drawable.sh)
    else
        painterResource(id = R.drawable.hide)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.daftar), contentDescription = "Sign image",
            modifier = Modifier
                .width(204.dp)
                .height(197.dp))

        Text(text = "Daftar", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier
            .padding(start = 50.dp, top = 1.dp)
            .align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Silahkan daftar untuk masuk", fontSize = 14.sp, fontWeight = FontWeight.Medium, modifier = Modifier
            .padding(start = 50.dp, top = 1.dp)
            .align(Alignment.Start))

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier
                .width(292.dp),
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
            value = namaPengguna, onValueChange = {namaPengguna = it
            }, label = {
                Text(text = "Buat Nama Pengguna",
                    modifier = Modifier,
                    fontSize = 13.sp)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier
                .width(292.dp),
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
            value = email, onValueChange = {email = it
            }, label = {
                Text(text = "Buat Alamat Email",
                    modifier = Modifier,
                    fontSize = 13.sp)
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(292.dp),
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text(
                    text = "Buat Kata Sandi",
                    modifier = Modifier,
                    fontSize = 13.sp,
                )
            },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibilty Icon",
                        modifier = Modifier.size(width = 25.dp, height = 25.dp)
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(292.dp),
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
            value = konfirmasi,
            onValueChange = {
                konfirmasi = it
            },
            label = {
                Text(
                    text = "Konfirmasi Kata Sandi",
                    modifier = Modifier,
                    fontSize = 13.sp,
                )
            },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibilty Icon",
                        modifier = Modifier.size(width = 25.dp, height = 25.dp)
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        button(text = "Daftar",  onItemClick = {
            navController.navigate(Screens.survei.name)
        })

        Spacer(modifier = Modifier.height(32.dp))
        Row {
            Text(text = "Sudah punya akun? ")
            Text(text = "Masuk",
                modifier = Modifier.clickable {  },
                color = Color(0xFF508CAE),
                fontWeight = FontWeight.SemiBold
            )
        }
    }

}
