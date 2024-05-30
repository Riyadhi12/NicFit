package com.example.nicfit.konsultasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.MessageList

@Composable
fun KonsulChat(
    modifier: Modifier,
    navHostController: NavHostController
){
    Box {
        Image(
            painterResource(id = R.drawable.bg_chat), contentDescription = "",
            modifier = modifier.fillMaxSize().scale(1.1f))
        MessageList(modifier = modifier, navHostController = navHostController,isKonsultasi = true)
    }
}