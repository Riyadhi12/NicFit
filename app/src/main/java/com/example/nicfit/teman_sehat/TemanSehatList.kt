package com.example.nicfit_22_bios.views.screens.temanChatPages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.nicfit.components.CustomizedBackground
import com.example.nicfit.components.CustomizedSearchBar
import com.example.nicfit.components.TemanSehatTabPage
import com.example.nicfit.componentsTS.poppinFamily


@Composable
fun TemanSehatList(
    modifier: Modifier,
    navController: NavHostController
){

    Box(modifier = modifier.fillMaxWidth()){
        CustomizedBackground()

        Column {
            Text(text = "Teman Sehat",
                fontSize = 22.sp, fontFamily = poppinFamily, fontWeight = FontWeight.Bold,
                color = Color.White, textAlign = TextAlign.Center, modifier = modifier.fillMaxWidth().padding(20.dp))
            Text(text = "Temukan teman dan cara mengatasi kesepian dan kesendirian mu", color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 16.sp, fontFamily = poppinFamily,
                modifier = modifier.fillMaxWidth().padding(horizontal = 12.dp))
            CustomizedSearchBar(keyword = "Cari", modifier = modifier.padding(top = 16.dp))
            TemanSehatTabPage(modifier = modifier, navController = navController)
        }
    }
}

//@Preview
//@Composable
//fun TemanSehatPreview(){
//    TemanSehatList(modifier = Modifier)
//}