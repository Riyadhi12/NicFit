package com.example.nicfit_22_bios.views.tabview

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.nicfit.components.TemanSehatItemList
import com.example.nicfit_22_bios.model.TemanSehatItem

@Composable
fun TemanSehatTabView(
    modifier: Modifier,
    isTemanSehat:Boolean,
    navController: NavHostController
){
    val temanSehatLists = listOf(
        TemanSehatItem(title = "Pasukan Berhenti Merokok", number = "100", false),
        TemanSehatItem(title = "Forum Anti Rokok", number = "50", false),
        TemanSehatItem(title = "Pasukan Berhenti Merokok", number = "100", false),
        TemanSehatItem(title = "Forum Anti Rokok", number = "50", false),
        TemanSehatItem(title = "Pasukan Berhenti Merokok", number = "100", false),
        TemanSehatItem(title = "Forum Anti Rokok", number = "50", false)
    )
    val temanSayaLists = listOf(
        TemanSehatItem(title = "Pasukan Berhenti Merokok", number = "100", true),
        TemanSehatItem(title = "Forum Anti Rokok", number = "50", true)
    )
    LazyColumn (
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp, horizontal = 12.dp)
    ){
        items(if (isTemanSehat) temanSehatLists.size else temanSayaLists.size) {
            if (isTemanSehat) {
                TemanSehatItemList(
                    modifier = modifier.fillMaxWidth().padding(vertical = 12.dp),
                    title = temanSehatLists[it].title,
                    number = temanSehatLists[it].number,
                    joinedStatus = temanSehatLists[it].isJoined,
                    navController = navController
                )
            } else {
                TemanSehatItemList(
                    modifier = modifier.fillMaxWidth().padding(vertical = 12.dp),
                    title = temanSayaLists[it].title,
                    number = temanSayaLists[it].number,
                    joinedStatus = temanSayaLists[it].isJoined,
                    navController = navController)
            }
        }
    }
}

