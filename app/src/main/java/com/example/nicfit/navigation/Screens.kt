package com.example.nicfit.navigation

enum class Screens {
    beranda,
    artikel,
    misi,
    konsultasi,
    temanSehat,
    akunsaya,
    profile,
    pengaturan,
    ContactUs,
    kebijakanPrivasi,


sealed class Screen(val route : String){
    data object Splash : Screen("splash")
    data object Welcome : Screen("onBoarding")
    data object Login : Screen("login")
    data object Daftar : Screen("daftar")

    editakun,
    login,
    RegisScreen,
    survei,
    bantuan

}