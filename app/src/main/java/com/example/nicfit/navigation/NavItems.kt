package com.example.nicfit.navigation

import com.example.nicfit.R

data class NavItems(
    val label : String,
    val icon : Int,
    val route : String
)

val ListOfNavItems : List<NavItems> = listOf(
    NavItems(
        label = "Beranda",
        icon = R.drawable.beranda,
        route = Screens.beranda.name
    ),
    NavItems(
        label = "Konsultasi",
        icon = R.drawable.konsul,
        route = Screens.konsultasi.name
    ),
    NavItems(
        label = "Misi",
        icon = R.drawable.misi2,
        route = Screens.misi.name
    ),
    NavItems(
        label = "Artikel",
        icon = R.drawable.artikel,
        route = Screens.artikel.name
    ),
    NavItems(
        label = "Healty",
        icon = R.drawable.ts1,
        route = Screens.temanSehat.name
    ),
)