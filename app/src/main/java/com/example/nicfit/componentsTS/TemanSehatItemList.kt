package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nicfit.R
import com.example.nicfit_22_bios.views.screens.temanChatPages.TemanSehatChat

@Composable
fun  TemanSehatItemList(
    modifier: Modifier,
    title: String,
    number: String,
    joinedStatus:Boolean,
    navController: NavHostController
){
            Card (
                modifier = modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.elevatedCardElevation(5.dp)
            ){
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column {
                        Text(text = title)
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.ic_people),
                                contentDescription = "")
                            Text(text = number + "orang tergabung")
                        }
                    }

                    ConfirmationButton(text = when(joinedStatus){
                        true -> "Chat"
                        false -> "Gabung"
                    }, toConfirm = true,
                        onClickButton = {
                            navController.navigate("chat")
                        },
                        modifier = modifier
                    )
                }
            }
    }