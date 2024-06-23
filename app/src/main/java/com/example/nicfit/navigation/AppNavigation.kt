package com.example.nicfit.navigation


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.nicfit.artikel.artikel
import com.example.nicfit.beranda.ContactUs
import com.example.nicfit.beranda.akunsaya
import com.example.nicfit.beranda.bantuan
import com.example.nicfit.beranda.beranda
import com.example.nicfit.beranda.editakun
import com.example.nicfit.beranda.kebijakanPrivasi
import com.example.nicfit.beranda.pengaturan
import com.example.nicfit.beranda.profile
import com.example.nicfit.daftar.RegisScreen
import com.example.nicfit.daftar.survei
import com.example.nicfit.konsultasi.BookingDetail
import com.example.nicfit.konsultasi.KonsulChat

import com.example.nicfit.lupasandi.cdVerifikasi
import com.example.nicfit.lupasandi.inputEmail
import com.example.nicfit.lupasandi.konfirmasiSandi
import com.example.nicfit.masuk.login
import com.example.nicfit.misi.misi
import com.example.nicfit.splash.PagerScreen
import com.example.nicfit.splash.splashScreen
import com.example.nicfit.konsultasi.KonsulDateTimeChoose
import com.example.nicfit.konsultasi.KonsulMethod
import com.example.nicfit.konsultasi.KonsultasiDetail
import com.example.nicfit.konsultasi.KonsultasiList
import com.example.nicfit.konsultasi.PaymentMethod
import com.example.nicfit.konsultasi.PaymentStatus
import com.example.nicfit.konsultasi.TransferBankBca
import com.example.nicfit.teman_sehat.TemanSehatChat
import com.example.nicfit_22_bios.views.screens.temanChatPages.TemanSehatList
//import artikel
import com.example.nicfit.artikel.artikelEmosional
import com.example.nicfit.artikel.artikelKecanduan
import com.example.nicfit.artikel.detailEmosional
import com.example.nicfit.artikel.detailKecanduan
import com.example.nicfit.beranda.notifikasi
import com.example.nicfit.misi.detailMisi
import com.example.nicfit.misi.progress

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier.fillMaxSize()
) {
    val navController: NavHostController = rememberNavController()
    val navBackStackEntry: NavBackStackEntry? by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
           AnimatedVisibility(visible = currentDestination.buttomBar()) {
               NavigationBar(
                   modifier = Modifier.height(80.dp),
                   containerColor = Color.White,
                   contentColor = Color.Black
               ) {
                   ListOfNavItems.forEach { Navitem ->
                       NavigationBarItem(
                           selected = currentDestination == Navitem.route,
                           onClick = {
                               navController.navigate(Navitem.route) {
                                   popUpTo(navController.graph.findStartDestination().id) {
                                       saveState = true
                                   }
                                   launchSingleTop = true
                                   restoreState = true
                               }
                           },
                           icon = {
                               Image(painterResource(Navitem.icon), contentDescription = null)
                           },
                           label = {
                               Text(text = Navitem.label)
                           },
                           alwaysShowLabel = true,
                           colors = NavigationBarItemDefaults.colors(
                               selectedIconColor = Color(0xFF508CAE),
                               selectedTextColor = Color(0xFF508CAE),
                               unselectedIconColor = Color.Gray,
                               unselectedTextColor = Color.Gray
                           )
                       )
                   }
               }
           }
        }
    ) { PaddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.splashScreen.name,
            modifier = modifier
                .padding(PaddingValues)
        ) {
            composable(route = Screens.splashScreen.name) {
                splashScreen(navController)
            }
            composable(route = Screens.PagerScreen.name) {
                PagerScreen(navController)
            }
            composable(route = Screens.beranda.name) {
                beranda(modifier = Modifier,navController = navController,keyword = "")
            }
            composable(route = Screens.konsultasi.name) {
                KonsultasiList(modifier = Modifier, navController)
            }
            composable(route = "${Screens.detail.name}/{value}") { backStackEntry ->
                val value = backStackEntry.arguments?.getString("value")
                KonsultasiDetail(
                    modifier = Modifier,
                    navHostController = navController,
                    valueStr = value!!
                )
            }
            composable(route = "${Screens.payment_bank.name}/{value}") { backStackEntry ->
                val value = backStackEntry.arguments?.getString("value")
                PaymentMethod(
                    modifier = Modifier,
                    navHostController = navController,
                    valueStr = value!!
                )
            }
            composable(route = "${Screens.payment_bca.name}/{value}") { backStackEntry ->
                val value = backStackEntry.arguments?.getString("value")
                TransferBankBca(
                    modifier = Modifier,
                    navHostController = navController,
                    valueStr = value!!
                )
            }
            composable(route = "${Screens.payment_status.name}/{value}") { backStackEntry ->
                val value = backStackEntry.arguments?.getString("value")
                PaymentStatus(
                    modifier = Modifier,
                    navHostController = navController,
                    isContactValue = value!!
                )
            }
            composable(route = Screens.chooseDateTime.name) {
                KonsulDateTimeChoose(modifier = Modifier, navController = navController)
            }
            composable(route = Screens.konsul_method.name) {
                KonsulMethod(modifier = Modifier, navHostController = navController)
            }
            composable(route = Screens.booking_detail.name) {
                BookingDetail(modifier = Modifier, navHostController = navController)
            }
            composable(route = Screens.konsul_chat.name) {
                KonsulChat(modifier = Modifier, navHostController = navController)
            }
            composable(route = Screens.misi.name) {
                misi(navController)
            }
            composable(route = Screens.artikel.name) {
                artikel(modifier = Modifier, navController = navController)
            }
            composable(route = Screens.temanSehat.name) {
                TemanSehatList(modifier = Modifier, navController)
            }
            composable(route = Screens.akunsaya.name) {
                akunsaya(navController)
            }
            composable(route = Screens.profile.name) {
                profile(navController)
            }
            composable(route = Screens.pengaturan.name) {
                pengaturan(navController)
            }
            composable(route = Screens.ContactUs.name) {
                ContactUs(navController)
            }
            composable(route = Screens.kebijakanPrivasi.name) {
                kebijakanPrivasi(navController)
            }

            composable(route = Screens.editakun.name) {
                editakun(navController)
            }
            composable(route = Screens.login.name) {
                login(navController)
            }
            composable(route = Screens.RegisScreen.name) {
                RegisScreen(navController)
            }
            composable(route = Screens.survei.name) {
                survei(navController)
            }
            composable(route = Screens.bantuan.name) {
                bantuan(navController)
            }
            composable(route = Screens.inputEmail.name) {
                inputEmail(navController)
            }
            composable(route = Screens.cdVerifikasi.name) {
                cdVerifikasi(navController)
            }
            composable(route = Screens.konfirmasiSandi.name) {
                konfirmasiSandi(navController)
            }
            composable(route = "${Screens.teman_sehat_chat.name}/{imageInt}/{title}/{membersCount}/{description}/{isPaid}"){backStackEntry ->
                val imageIntStr = backStackEntry.arguments?.getString("imageInt")
                val imageInt = imageIntStr?.toInt()
                val title = backStackEntry.arguments?.getString("title")
                val membersCount = backStackEntry.arguments?.getString("membersCount")
                val description = backStackEntry.arguments?.getString("description")
                val isPaidStr = backStackEntry.arguments?.getString("isPaid")
                val isPaid = isPaidStr?.toBoolean()
                TemanSehatChat(modifier = Modifier, navController = navController, title = title!!, isPaid = isPaid!!, imageInt = imageInt!!, membersCount = membersCount!!, description = description!!)
            }
            composable(route = Screens.artikelKecanduan.name) {
                artikelKecanduan(navController)
            }
            composable(route = Screens.artikelEmosional.name) {
                artikelEmosional(navController)
            }
            composable(
                route = Screens.detailKecanduan.name + "/{kecanduanId}", arguments = listOf(
                    navArgument("kecanduanId") {
                        type = NavType.IntType
                    })
            ) { navBackStackEntry ->
                detailKecanduan(
                    navController = navController,
                    kecanduanId = navBackStackEntry.arguments?.getInt("kecanduanId")
                )
            }
            composable(
                route = Screens.detailEmosional.name + "/{emosionalId}", arguments = listOf(
                    navArgument("emosionalId") {
                        type = NavType.IntType
                    })
            ) { navBackStackEntry ->
                detailEmosional(
                    navController = navController,
                    emosionalId = navBackStackEntry.arguments?.getInt("emosionalId")
                )
            }
            composable(route = Screens.notifikasi.name) {
                notifikasi(navController)
            }
            composable(
                route = Screens.detailMisi.name + "/{misiId}", arguments = listOf(
                    navArgument("misiId") {
                        type = NavType.IntType
                    })
            ) { navBackStackEntry ->
                detailMisi(
                    navController = navController,
                    misiId = navBackStackEntry.arguments?.getInt("misiId")
                )
            }
            composable(route = Screens.progress.name) {
                progress(navController)
            }
        }
    }
}


