package com.example.nicfit.navigation

fun String?.buttomBar():Boolean{
    return this in setOf(
        Screens.beranda.name,
        Screens.konsultasi.name,
        Screens.artikel.name,
        Screens.misi.name,
        Screens.temanSehat.name
    )
}