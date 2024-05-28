package com.example.nicfit_22_bios.views.screens.temanChatPages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.MessageList


@Composable
fun TemanSehatChat(
    modifier: Modifier,
    navController: NavHostController
){
    Box {
        Image(painterResource(id = R.drawable.bg_chat), contentDescription = "",
             modifier = modifier.fillMaxSize())
        MessageList(modifier = modifier, navHostController = navController, false)
    }
}