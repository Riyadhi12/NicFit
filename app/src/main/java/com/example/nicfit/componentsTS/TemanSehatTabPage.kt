package com.example.nicfit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.nicfit_22_bios.views.tabview.TemanSehatTabView


@Composable
fun TemanSehatTabPage(
    modifier: Modifier,
    navController: NavHostController
){
    val tabIndex = remember { mutableIntStateOf(0) }
    val tabs = listOf("Teman Sehat", "Teman Saya")

    Column(modifier = modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex.intValue) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = tabIndex.intValue == index,
                    onClick = { tabIndex.intValue = index }
                )
            }
        }

        when (tabIndex.intValue) {
            0 -> TemanSehatTabView(modifier = modifier, isTemanSehat = true, navController = navController)
            1 -> TemanSehatTabView(modifier = modifier, isTemanSehat = false, navController = navController)
        }
    }
}

