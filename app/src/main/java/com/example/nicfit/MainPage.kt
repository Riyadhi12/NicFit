package com.example.nicfit_22_bios

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.nicfit.konsultasi.KonsulDateTimeChoose
import com.example.nicfit.konsultasi.KonsulMethod
import com.example.nicfit.konsultasi.KonsultasiDetail
import com.example.nicfit.konsultasi.KonsultasiList
import com.example.nicfit.konsultasi.PaymentMethod
import com.example.nicfit.konsultasi.PaymentStatus
import com.example.nicfit.konsultasi.TransferBankBca

@Composable
fun MainPage(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController(),
){
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold{innerPadding->
        NavHost(navController = navHostController, startDestination = "konsultasiList") {
            //UNTUK TEMAN SEHAT
//            composable(route = "list") {
//                TemanSehatList(modifier = Modifier.padding(innerPadding), navHostController)
//                Log.d("NavHost", "List")
//            }
//            composable(route = "chat") {
//                TemanSehatChat(modifier = Modifier.padding(innerPadding), navController = navHostController)
//                Log.d("NavHost", "Chat")
//            }
            //UNTUK KONSULTASI
            composable(route = "konsultasiList") {
                KonsultasiList(modifier = modifier.padding(innerPadding), navHostController)
            }
            composable(route = "detail/{value}", arguments = listOf(
                navArgument("value"){
                    type = NavType.BoolType
                    defaultValue = false
                }
            )) {backStackEntry ->
                val value = requireNotNull(backStackEntry.arguments).getBoolean("value")
                KonsultasiDetail(modifier = modifier, navHostController = navHostController, value = value)
            }
            composable(route = "payment_bank") {
                PaymentMethod(modifier = modifier, navHostController = navHostController)
            }
            composable(route = "payment_bca"){
                TransferBankBca(modifier = modifier, navHostController = navHostController)
            }
            composable(route = "payment_status"){
                PaymentStatus(modifier = modifier, navHostController = navHostController)
            }
            composable(route = "chooseDateTime"){
                KonsulDateTimeChoose(modifier = modifier, navController = navHostController)
            }
            composable(route = "konsul_method"){
                KonsulMethod(modifier = modifier, navHostController = navHostController)
            }
            composable(route = "booking_detail"){
                KonsulDateTimeChoose(modifier = modifier, navController = navHostController)
            }
        }
    }
}