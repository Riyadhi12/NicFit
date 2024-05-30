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
    editakun,
    login,
    RegisScreen,
    survei,
    bantuan,
    splashScreen,
    PagerScreen,
    inputEmail,
    cdVerifikasi,
    konfirmasiSandi,
    detail,
    payment_bank,
    payment_bca,
    payment_status,
    chooseDateTime,
    konsul_method,
    booking_detail,
    konsul_chat,
    teman_sehat_chat
}


sealed class Screen(val route : String) {
    data object Splash : Screen("splash")
    data object Welcome : Screen("onBoarding")
    data object Login : Screen("login")
    data object Daftar : Screen("daftar")
}
