package com.example.nicfit.konsultasi

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.CustomizedBackground
import com.example.nicfit.components.DetailDescriptionHeader
import com.example.nicfit.components.KonsultasiTabViewPage
import com.example.nicfit.componentsTS.CustomizedWhiteBackground


@Composable
fun KonsultasiDetail(
    modifier: Modifier,
    navHostController: NavHostController,
    valueStr : String
){
    val value = valueStr.toBoolean()
    Box {
        Log.d("Logging Screen","Di konsultasi detail")
        CustomizedWhiteBackground()
        Column {
            Image(painter = painterResource(id = R.drawable.doctor_nobg), contentDescription = null,
                modifier
                    .size(215.dp)
                    .fillMaxWidth()
                    .align(
                        Alignment.CenterHorizontally
                    ))
            DetailDescriptionHeader(modifier = modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp))
            KonsultasiTabViewPage(modifier = modifier, isForDetail = true, navHostController = navHostController, isPaid = value)
        }
    }
}

@Preview
@Composable
fun KonsultasiDetailPreview(){
    KonsultasiDetail(modifier = Modifier, navHostController = NavHostController(LocalContext.current), "true")
}