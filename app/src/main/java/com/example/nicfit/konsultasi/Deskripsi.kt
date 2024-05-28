package com.example.nicfit_22_bios.views.tabview

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.components.ConfirmationButton
import com.example.nicfit.components.ProModalSheet
import com.example.nicfit.components.WelcomPaidModalSheet
import com.example.nicfit.componentsTS.poppinFamily
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Deskripsi(
    modifier: Modifier,
    navHostController: NavHostController,
    isPaid : Boolean
) {
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    val showBottomSheet = remember { mutableStateOf(false) }
    Column(
        modifier = modifier.padding(12.dp)
    ) {
        Text(text = "Tentang", fontWeight = FontWeight.Bold, fontFamily = poppinFamily, fontSize = 20.sp)
        Text(text = "Dr. Farhan Satria adalah seorang dokter spesialis paru yang berdedikasi untuk menyediakan perawatan terbaik kepada pasien dengan berbagai kondisi paru-paru. Dengan pengalaman yang luas di bidang penyakit paru, Dr. Farhan telah mengelola berbagai kasus mulai dari penyakit paru kronis hingga penyakit paru akut.", fontWeight = FontWeight.Normal, fontFamily = poppinFamily, fontSize = 14.sp)
        ConfirmationButton(
            onClickButton = {
                when(isPaid){
                    true -> {
                        navHostController.navigate("chooseDateTime")
                    }
                    false ->{
                        scope.launch { sheetState.hide() }.invokeOnCompletion {
                            if (!sheetState.isVisible) {
                                showBottomSheet.value = true
                            }
                        }
                    }
                }
            },
            modifier = modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),
            text = "Jadwalkan Konsultasi",
            toConfirm = true,
        )
    }
    if (showBottomSheet.value) {
        ModalBottomSheet(
            onDismissRequest = {
                showBottomSheet.value = false
            },
            sheetState = sheetState
        ) {
            when(isPaid){
                true -> {
                    WelcomPaidModalSheet(modifier = modifier)
                }
                false -> {
                    ProModalSheet(
                        modifier = modifier,
                        navHostController = navHostController,
                        onClickButton = {
                            scope.launch { sheetState.hide() }.invokeOnCompletion {
                                if (!sheetState.isVisible) {
                                    showBottomSheet.value = false
                                }
                            }
                            navHostController.navigate("payment_bank/false")
                        })}
            }
        }
    }
}

@Preview
@Composable
fun DeskripsiPreview() {
    Deskripsi(modifier = Modifier, navHostController = NavHostController(LocalContext.current), true)
}