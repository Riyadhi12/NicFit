package com.example.nicfit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nicfit.R

@Composable
fun ProModalSheet(
    modifier: Modifier,
    navHostController: NavHostController,
    onClickButton: ()->Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Versi Pro")
        Text(text = "Rp. 50.000")
        Row {
            IconWithText(R.drawable.tick, "Konsultasi setiap hari")
        }
        Row {
            IconWithText(R.drawable.tick, "Join Teman Sehat Tanpa Batas")
        }
        Row {
            IconWithText(R.drawable.tick, "Prioritas Customer Service")
        }
        ConfirmationButton(text = "Tingkatkan Sekarang", toConfirm = true, onClickButton = onClickButton, modifier = modifier)
    }
}


@Composable
fun IconWithText(
    icon: Int,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }
}