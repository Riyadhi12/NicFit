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
import com.example.nicfit.beranda.beranda
import com.example.nicfit.konsultasi.konsultasi
import com.example.nicfit.misi.misi
import com.example.nicfit.teman_sehat.temanSehat

@Composable
fun AppNavigation() {
    val navController : NavHostController = rememberNavController()
    
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                contentColor = Color.Black
            ) {
                val navBackStackEntry : NavBackStackEntry? by navController.currentBackStackEntryAsState()
                val currentDestination : NavDestination? = navBackStackEntry?.destination

                ListOfNavItems.forEach{ Navitem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{it.route == Navitem.route} == true,
                        onClick = {
                            navController.navigate(Navitem.route){
                                popUpTo(navController.graph.findStartDestination().id){
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Image(painterResource(Navitem.icon), contentDescription = null )
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
            }
        }
    ) {
        PaddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.beranda.name,
            modifier = Modifier
                .padding(PaddingValues)
        ){
            composable(route = Screens.beranda.name){
                beranda()
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
        }
    }
}