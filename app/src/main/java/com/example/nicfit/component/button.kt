package com.example.nicfit.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun button(
    text : String
) {
    Button( onClick = { }, modifier = Modifier
        .width(292.dp)
        .height(48.dp),
        shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE)))
    {
        Text(text = text)
    }
}
