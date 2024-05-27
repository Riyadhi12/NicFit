package com.example.nicfit.konsultasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.nicfit.components.MessageList

@Composable
fun KonsulChat(
    modifier: Modifier,
    navHostController: NavHostController
){
    MessageList(modifier = modifier, navHostController = navHostController,isKonsultasi = true)
}