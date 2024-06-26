package com.example.nicfit.masuk


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.offset
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.component.button
import com.example.nicfit.firebase.FirebaseViewModel
import com.example.nicfit.navigation.Screens
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun login(navController: NavController, viewModel: FirebaseViewModel = hiltViewModel()){
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    val state by viewModel.state.collectAsState(initial=null)

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var passwordVisibility by remember {
        mutableStateOf(false)
    }
    val icon = if (passwordVisibility) {
        painterResource(id = R.drawable.sh)
    } else
        painterResource(id = R.drawable.hide)

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.login),
            contentDescription = "Login Image",
            modifier = Modifier.size(width = 252.dp, height = 267.dp))

        Spacer(modifier = Modifier.height(19.dp))

        Text(
            text = "Masuk",
            modifier = Modifier
                .padding(start = 50.dp, top = 7.dp)
                .align(Alignment.Start),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Silahkan masuk untuk melanjutkan",
            modifier = Modifier
                .padding(start = 50.dp, top = 1.dp) // Atur jarak dari sisi kiri dan atas
                .align(Alignment.Start), // Pindahkan ke sudut kiri atas
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(19.dp))

        OutlinedTextField(
            modifier = Modifier
                .width(292.dp),
            shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
            value = email, onValueChange = {email = it
            }, label = {
                Text(text = "Masukkan Email Anda",
                    modifier = Modifier,
                    fontSize = 13.sp)
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray,
            )
        )

        Spacer(modifier = Modifier.height(19.dp))

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
                    text = "Masukkan Kata Sandi Anda",
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
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray,
            )
        )
        Spacer(modifier = Modifier.height(7.dp))

        Text(
            text = "Lupa Kata Sandi?",
            style = TextStyle(
                fontSize = 12.sp,
                color = Color(0xFF508CAE)
            ),
            modifier = Modifier
                .offset(x = 100.dp, y = 7.dp)
                .clickable { navController.navigate(Screens.inputEmail.name) },
        )

        Spacer(modifier = Modifier.height(31.dp))

        button(text = "Masuk",  onItemClick = {
            coroutineScope.launch {
                if (email.isBlank() || password.isBlank()) {
                    Toast.makeText(context, "Email dan password harus diisi", Toast.LENGTH_SHORT).show()
                } else {
                    viewModel.loginUser(email, password) { success ->
                        if (success) {
                            navController.navigate(Screens.beranda.name)
                        } else {
                            Toast.makeText(context, "Email atau password salah", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        })

        Spacer(modifier = Modifier.height(13.dp))
        Row {
            Text(text = "Belum punya akun? ")
            Text(text = "Daftar",
                modifier = Modifier
                    .clickable {
                        navController.navigate(Screens.RegisScreen.name)
                    }
                ,color = Color(0xFF508CAE)
                ,fontWeight = FontWeight.Bold
            )
        }

    }
}