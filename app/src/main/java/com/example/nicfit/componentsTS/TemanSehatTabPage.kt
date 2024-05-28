package com.example.nicfit.components

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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit_22_bios.views.tabview.Deskripsi
import com.example.nicfit_22_bios.views.tabview.TemanSehatTabView
import com.example.nicfit_22_bios.views.tabview.Ulasan

@Composable
fun TemanSehatTabPage(
    modifier: Modifier,
    navController: NavHostController
){
    val tabIndex = remember { mutableIntStateOf(0) }
    val tabs = listOf("Teman Sehat", "Teman Saya")

    Column(modifier = modifier.fillMaxWidth()) {
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
            0 -> TemanSehatTabView(modifier = modifier, isTemanSehat = true, navController = navController)
            1 -> TemanSehatTabView(modifier = modifier, isTemanSehat = false, navController = navController)
        }
    }
}

