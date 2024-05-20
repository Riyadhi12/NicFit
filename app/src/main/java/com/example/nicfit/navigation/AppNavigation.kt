package com.example.nicfit.navigation

import androidx.compose.foundation.Image
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
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
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

import com.example.nicfit.konsultasi.konsultasi
import com.example.nicfit.masuk.login
import com.example.nicfit.misi.misi
import com.example.nicfit.splash.PagerScreen
import com.example.nicfit.splash.splashScreen
import com.example.nicfit.teman_sehat.temanSehat

@Composable
fun AppNavigation() {
    val navController : NavHostController = rememberNavController()
    val navBackStackEntry : NavBackStackEntry? by navController.currentBackStackEntryAsState()
    val currentDestination : NavDestination? = navBackStackEntry?.destination
    Scaffold(
        bottomBar = {
            if (currentDestination?.route != Screens.akunsaya.name &&
                currentDestination?.route != Screens.profile.name &&
                currentDestination?.route != Screens.pengaturan.name &&
                currentDestination?.route != Screens.ContactUs.name &&
                currentDestination?.route != Screens.kebijakanPrivasi.name &&


                currentDestination?.route != Screens.editakun.name &&
                currentDestination?.route != Screens.login.name &&
                currentDestination?.route != Screens.RegisScreen.name &&
                currentDestination?.route != Screens.survei.name &&
                currentDestination?.route != Screens.bantuan.name
            ){

            NavigationBar(
                containerColor = Color.White,
                contentColor = Color.Black
            ) {
                ListOfNavItems.forEach { Navitem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == Navitem.route } == true,
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
                            selectedIconColor = Color.Red,
                            selectedTextColor = Color.Blue,
                            unselectedIconColor = Color.Gray,
                            unselectedTextColor = Color.Gray
                        )
                    )
                }
            } }
        }
    ) {
        PaddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.splashScreen.name,

            modifier = Modifier
                .padding(PaddingValues)
        ){
            composable(route = Screens.splashScreen.name){
                splashScreen(navController)
            }
            composable(route = Screens.PagerScreen.name){
                PagerScreen(navController)
            }
            composable(route = Screens.beranda.name){
                beranda(navController)
            }
            composable(route = Screens.konsultasi.name) {
                konsultasi()
            }
            composable(route = Screens.misi.name) {
                misi()
            }
            composable(route = Screens.artikel.name) {
                artikel()
            }
            composable(route = Screens.temanSehat.name) {
                temanSehat()
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
        }
    }
}