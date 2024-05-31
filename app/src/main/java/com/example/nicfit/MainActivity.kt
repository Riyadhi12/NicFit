package com.example.nicfit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.navArgs
import com.example.nicfit.beranda.ContactUs
import com.example.nicfit.beranda.akunsaya
import com.example.nicfit.beranda.bantuan
import com.example.nicfit.beranda.beranda
import com.example.nicfit.beranda.kebijakanPrivasi
import com.example.nicfit.beranda.pengaturan
import com.example.nicfit.beranda.profile
import com.example.nicfit.component.MyApp
import com.example.nicfit.daftar.RegisScreen
import com.example.nicfit.daftar.survei
import com.example.nicfit.lupasandi.inputEmail
import com.example.nicfit.splash.splashScreen
import com.example.nicfit.masuk.login
import com.example.nicfit.misi.CalendarView
import com.example.nicfit.misi.misi
import com.example.nicfit.navigation.AppNavigation
import com.example.nicfit.navigation.Screens
import com.example.nicfit.splash.PagerScreen
import com.example.nicfit.ui.theme.NicFitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
            //MyApp()
            //misi()
        }
    }
}
