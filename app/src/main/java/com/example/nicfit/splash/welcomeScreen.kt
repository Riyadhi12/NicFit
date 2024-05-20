package com.example.nicfit.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.onBoardingStep
import com.example.nicfit.navigation.Screens

@Composable
fun NavigationButton(
    onClick: () -> Unit,
    isNext: Boolean,
    enabled: Boolean
){
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier.size(48.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        )
    ) {
        Icon(
            imageVector = if (isNext) Icons.AutoMirrored.Filled.ArrowForward else Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = if (isNext) "Lanjut" else "Kembali"
        )
    }
}



@Composable
fun PagerScreen(navController: NavController) {
    val screens = listOf(
        onBoardingStep(
            image = R.drawable.first,
            title = "Selamat datang di Nicfit",
            description = "Nicfit merupakan aplikasi yang akan membantumu mengatasi masalahmu dalam berhenti merokok"
        ),
        onBoardingStep(
            image = R.drawable.second,
            title = "Selesaikan Misi dan Wujudkan Impian",
            description = "Nicfit merupakan aplikasi yang akan membantumu mengatasi masalahmu dalam berhenti merokok"
        ),
        onBoardingStep(
            image = R.drawable.third,
            title = "Berkenalan Dengan Teman Sehat",
            description = "Nicfit merupakan aplikasi yang akan membantumu mengatasi masalahmu dalam berhenti merokok"
        )
    )

    var currentStep by remember { mutableIntStateOf(0) }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(48.dp))
            Image(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.7f),
                painter = painterResource(id = screens[currentStep].image),
                contentDescription = "Pager Image"
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = screens[currentStep].title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
                    .padding(top = 10.dp),
                text = screens[currentStep].description,
                fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (currentStep > 0) {
                    TextButton(onClick = { currentStep-- }) {
                        Text("Sebelumnya")
                    }
                }
            }
            Row {
                repeat(screens.size) { index ->
                    val color =
                        if (index == currentStep) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface.copy(
                            alpha = 0.3f
                        )
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .padding(2.dp)
                            .background(color = color, shape = CircleShape)
                    )
                }
                NavigationButton(
                    onClick = { if (currentStep < screens.size - 1) currentStep++ },
                    isNext = true,
                    enabled = currentStep < screens.size - 1
                )
            }

            if (currentStep < screens.size - 1) {
                TextButton(onClick = { currentStep++ }) {
                    Text("Next")
                }
            } else {
                TextButton(onClick = { navController.navigate(Screens.login.name) }) {
                    Text("Finish")
                }
            }
        }
        TextButton(
            onClick = { navController.navigate(Screens.login.name) },
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopEnd)//untuk meletakkan tulisan di atas kanan halaman
            ) {
            Text("Lewati", fontSize = 14.sp, fontWeight = FontWeight.Normal)
        }
    }
}

