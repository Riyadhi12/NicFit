package com.example.nicfit.lupasandi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.component.button

@Composable
fun inputEmail(){
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Lupa Kata Sandi",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 24.dp, top = 166.dp)
                .align(Alignment.Start)

        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Silakan masukkan email Anda untuk mengatur ulang kata sandi",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .width(350.dp)
                .align(Alignment.Start),
            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
            value = email, onValueChange = {email = it }, label = {
                Text (text = "Masukkan Email Anda",
                    modifier = Modifier,
                    fontSize = 13.sp)
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF508CAE),
                focusedLabelColor = Color.Gray,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button( onClick = { }, modifier = Modifier
            .padding(start = 24.dp, top = 1.dp)
            .width(350.dp)
            .height(48.dp),
            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE)))
        {
            Text(text = "Selanjutnya")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun inputPreview(){
    inputEmail()
}