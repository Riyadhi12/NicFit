package com.example.nicfit.konsultasi

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.components.CustomizedBackground
import com.example.nicfit.components.CustomizedSearchBar
import com.example.nicfit.components.KonsultasiTabViewPage
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun KonsultasiList(
    modifier:Modifier,
    navHostController: NavHostController
){
    Box(modifier = modifier){
        CustomizedBackground()
        Column {
            Text(text = "Konsultasi",
                fontSize = 22.sp, fontFamily = poppinFamily, fontWeight = FontWeight.Bold,
                color = Color.White, textAlign = TextAlign.Center, modifier = modifier
                    .fillMaxWidth()
                    .padding(20.dp))
            Text(text = "Temukan dokter yang tepat dengan masalah yang ingin kamu atasi", color = Color.White,
                textAlign = TextAlign.Center, fontFamily = poppinFamily, fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp))
            CustomizedSearchBar(keyword = "Cari", modifier = modifier.padding(top = 16.dp))
            KonsultasiTabViewPage(modifier = modifier, isForDetail = false, navHostController  = navHostController, false)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun KonsultasiListPreview(){
//    KonsultasiList(modifier = Modifier, navHostController = NavHostController(LocalContext.current))
//}