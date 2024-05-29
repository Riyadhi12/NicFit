package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily
import com.example.nicfit.navigation.Screens

@Composable
fun  TemanSehatItemList(
    modifier: Modifier,
    title: String,
    number: String,
    joinedStatus:Boolean,
    image:Int,
    navController: NavHostController
){
            Card (
                modifier = modifier.fillMaxWidth(),
                backgroundColor = Color.White,
                elevation = 5.dp
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier.padding(horizontal = 16.dp)
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = image), contentDescription = "",
                            modifier = Modifier
                                .size(60.dp)
                                .padding(end = 8.dp)
                        )
                        Column {
                            Text(text = title, fontSize = 11.sp, fontFamily = poppinFamily, fontWeight = FontWeight.Bold)
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_people),
                                    contentDescription = "",
                                    modifier = Modifier.size(18.dp).
                                    padding(end = 4.dp)
                                )
                                Text(text = "$number orang tergabung",fontSize = 12.sp, fontFamily = poppinFamily, color = Color.Gray)
                            }
                        }
                    }
                    ConfirmationButton(
                        text = when (joinedStatus) {
                            true -> "Chat"
                            false -> "Gabung"
                        }, toConfirm = true,
                        onClickButton = {
                            navController.navigate(Screens.teman_sehat_chat.name)
                        },
                        modifier = Modifier.width(112.dp).size(DpSize.Unspecified)
                    )
                }
            }

    }


@Preview
@Composable
fun TemanSehatItemPreview(){
TemanSehatItemList(modifier = Modifier, title = "Pasukan rokok", number = "1000", joinedStatus = false, R.drawable.cintai_hidupmu,navController = NavHostController(LocalContext.current))
}