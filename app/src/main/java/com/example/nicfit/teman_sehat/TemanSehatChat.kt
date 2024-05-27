package com.example.nicfit_22_bios.views.screens.temanChatPages

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.nicfit.components.MessageList


@Composable
fun TemanSehatChat(
    modifier: Modifier,
    navController: NavHostController
){
    MessageList(modifier = modifier, navHostController = navController, false)
}

