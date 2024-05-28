package com.example.nicfit.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.TabRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit_22_bios.views.tabview.Deskripsi
import com.example.nicfit_22_bios.views.tabview.Ulasan

@Composable
fun KonsultasiTabViewPage(
    modifier: Modifier,
    isForDetail:Boolean,
    navHostController: NavHostController,
    isPaid : Boolean
) {
    val tabIndex = remember { mutableIntStateOf(0) }
    val tabs = when(isForDetail){
        true-> listOf("Deskripsi", "Ulasan")
        false -> listOf("List Konsultan", "Konsultan Saya")
    }

    Column(modifier = modifier.fillMaxWidth()) {
        Log.d("Logging Screen","Di tabview")
        TabRow(selectedTabIndex = tabIndex.intValue,
            backgroundColor = Color.White,
            contentColor = colorResource(id = R.color.blue_nicfit),

            ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = tabIndex.intValue == index,
                    onClick = { tabIndex.intValue = index },
                    selectedContentColor = colorResource(id = R.color.blue_nicfit),
                    unselectedContentColor = Color.Black,
                )
            }
        }

        when (tabIndex.intValue) {
            0 -> when(isForDetail){
                true -> Deskripsi(
                    modifier,
                    navHostController,
                    isPaid
                )
                false ->{
                    Column {
                        KonsulListItem(modifier = modifier)
                        KonsulListItem(modifier = modifier)
                        KonsulListItem(modifier = modifier)
                        KonsulListItem(modifier = modifier)
                        KonsulListItem(modifier = modifier)
                    }
                }
            }
            1 -> when(isForDetail){
                true -> Ulasan(
                    modifier
                )
                false ->{
                    KonsulSayaListItem(modifier = modifier, navHostController = navHostController)
                    KonsulSayaListItem(modifier = modifier, navHostController = navHostController)
                    KonsulSayaListItem(modifier = modifier, navHostController = navHostController)
                }
            }
        }
    }
}

@Preview
@Composable
fun KonsultasiTabViewPagePreview() {
    KonsultasiTabViewPage(
        modifier = Modifier,
        isForDetail = false,
        navHostController = NavHostController(LocalContext.current),
        true
    )
}
