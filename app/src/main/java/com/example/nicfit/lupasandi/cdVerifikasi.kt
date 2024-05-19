package com.example.nicfit.lupasandi

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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
//import com.example.nicfit.ui.theme.poppinsFontFamily

@Composable
fun cdVerifikasi() {
    var code1 by remember { mutableStateOf("") }
    var code2 by remember { mutableStateOf("") }
    var code3 by remember { mutableStateOf("") }
    var code4 by remember { mutableStateOf("") }
    var code5 by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Periksa email Anda",
            fontSize = 20.sp,
            ///fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(start = 24.dp, top = 166.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Kami mengirimkan link reset ke email anda\nmasukkan 5 digit kode yang disebutkan dalam email",
            fontSize = 12.sp,
            //fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Normal,

            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
        ) {
            OutlinedTextField(
                value = code1,
                onValueChange = { code1 = it },
                singleLine = true,
                modifier = Modifier
                    .size(50.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = code2,
                onValueChange = { code2 = it },
                singleLine = true,
                modifier = Modifier.size(50.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = code3,
                onValueChange = { code3 = it },
                singleLine = true,
                modifier = Modifier.size(50.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = code4,
                onValueChange = { code4 = it },
                singleLine = true,
                modifier = Modifier.size(50.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = code5,
                onValueChange = { code5 = it },
                singleLine = true,
                modifier = Modifier.size(50.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { }, modifier = Modifier
                .padding(start = 24.dp, top = 1.dp)
                .width(340.dp)
                .height(48.dp),
            shape = RoundedCornerShape(
                topStart = 10.dp,
                topEnd = 10.dp,
                bottomStart = 10.dp,
                bottomEnd = 10.dp
            ),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE))
        )
        {
            Text(text = "Verifikasi Kode")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
            Text(text = "Belum dapat kode? ")
            Text(
                text = "Kirim Ulang kode",
                modifier = Modifier
                    .clickable {}, color = Color(0xFF508CAE), fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun verifPreview(){
    cdVerifikasi()
}