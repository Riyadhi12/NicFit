package com.example.nicfit.misi

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nicfit.data.MisiRepository
import com.example.nicfit.ui.theme.Blue

@Composable
fun TabbedInterface(
    navController: NavController
) {
    var tabTerpilih by remember {mutableStateOf("Semua")}
    val tabs = listOf("Semua", "Berjalan", "Yoga", "Berenang", "Jogging")

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            tabs.forEach { tab ->
                ExerciseItem(
                    exercise = tab,
                    isSelected = tabTerpilih == tab,
                    onClick = { tabTerpilih = tab }
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        when (tabTerpilih) {
            "Semua" -> DaftarMisi(misis = MisiRepository.semuaMisi,navController)
            "Berjalan" -> DaftarMisi(misis = MisiRepository.misiBerjalan,navController)
            "Yoga" -> DaftarMisi(misis = MisiRepository.misiYoga,navController)
            "Berenang" -> DaftarMisi(misis = MisiRepository.misiBerenang,navController)
            "Jogging" -> DaftarMisi(misis = MisiRepository.misiJogging,navController)
        }
    }
}

@Composable
fun ExerciseItem(
    exercise: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(top = 13.dp,start = 28.dp, bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .clickable(onClick = onClick),
            text = exercise,
            color = if (isSelected) Color(0xFF508CAE) else Color.Unspecified,
            style = TextStyle(
                fontSize = 12.sp,
            )
        )
        if (isSelected) {
            Spacer(modifier = Modifier.height(4.dp))
            Box(
                modifier = Modifier
                    .size(40.dp, 4.dp)
                    .background(color = Color(0xFF508CAE))
            )
        }
    }
}


