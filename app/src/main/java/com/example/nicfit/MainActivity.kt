package com.example.nicfit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nicfit.beranda.beranda
import com.example.nicfit.daftar.RegisScreen
import com.example.nicfit.masuk.login
import com.example.nicfit.navigation.AppNavigation
import com.example.nicfit.navigation.Screens
import com.example.nicfit.ui.theme.NicFitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //login()
            //RegisScreen()
            //AppNavigation()
            beranda()
        }
    }
}
