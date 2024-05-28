package com.example.nicfit.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun searchBar() {
    var textState by remember {
        mutableStateOf(TextFieldValue("")
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 160.dp) // Adjust padding to position the Column
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(15.dp))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(13.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search Bar",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            BasicTextField(
                value = textState,
                onValueChange = { textState = it },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                if (textState.text.isEmpty()) {
                    Text(
                        text = "Cari Artikel",
                        color = Color.Gray
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}
