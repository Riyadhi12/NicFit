package com.example.nicfit.teman_sehat

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.components.MessageList
import com.example.nicfit.componentsTS.TemanSehatModalSheet


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TemanSehatChat(
    modifier: Modifier,
    navController: NavHostController
){
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    val showBottomSheet = remember { mutableStateOf(true) }
    Box {
        Image(painterResource(id = R.drawable.bg_chat), contentDescription = "",
             modifier = modifier
                 .fillMaxSize()
                 .scale(1.1f))
        MessageList(modifier = modifier, navHostController = navController, false)
        if (showBottomSheet.value) {
            ModalBottomSheet(
                containerColor = Color.White,
                onDismissRequest = {
                    showBottomSheet.value = false
                },
                sheetState = sheetState) {
                TemanSehatModalSheet(
                    modifier = modifier,
                    imageInt = R.drawable.pasukan_berhenti_merokok,
                    title = "Pasukan Berhenti Merokok",
                    membersCount = "4,412",
                    description = "Berbincang santuy tips and trik untuk berhenti merokok",
                    onDismiss = {
                        showBottomSheet.value = false
                    },
                    navHostController = navController
                )
            }
        }
    }
}