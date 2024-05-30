package com.example.nicfit.data

import com.example.nicfit.R

data class Misi(
    val id : Int,
    val nama: String,
    val deskripsi: String,
    val img : Int = 0
)

val semuaMisi = listOf(
    Misi(1,
        "Berjalan Santai",
        "Meredakan stres",
        R.drawable.berjalan
    ),
    Misi(3,
        "Kapalbhati pranayama",
        "Detoksifikasi Diri",
        R.drawable.kapalbhati
    ),
    Misi(2,
        "Berjalan Cepat",
        "Tingkatkan sirkulasi darah",
        R.drawable.berjalan
    ),
    Misi(4,
        "Bhujangasana",
        "Tingkatkan Sirkulasi Darah",
        R.drawable.bhujangsana
    ),
    Misi(5,
        "Gaya Bebas",
        "Detoksifikasi Diri",
        R.drawable.gayabebas
    ),
    Misi(7,
        "Jarak Pendek",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek
    ),
    Misi(6,
        "Gaya Dada",
        "Tingkatkan Sirkulasi Tubuh",
        R.drawable.gayabebas
    ),

    Misi(8,
        "Jarak Menengah",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek
    ),
)

val misiBerjalan = listOf(
    Misi(1,
        "Berjalan Santai",
        "Meredakan stres",
        R.drawable.berjalan
    ),
    Misi(2,
        "Berjalan Cepat",
        "Tingkatkan sirkulasi darah",
        R.drawable.berjalan
    )
)

val misiYoga = listOf(
    Misi(3,
        "Kapalbhati pranayama",
        "Detoksifikasi Diri",
        R.drawable.kapalbhati
    ),
    Misi(4,
        "Bhujangasana",
        "Tingkatkan Sirkulasi Darah",
        R.drawable.bhujangsana
    ),
)

val misiBerenang = listOf(
    Misi(5,
        "Gaya Bebas",
        "Detoksifikasi Diri",
        R.drawable.gayabebas
    ),
    Misi(6,
        "Gaya Dada",
        "Tingkatkan Sirkulasi Tubuh",
        R.drawable.gayabebas
    )

)
val misiJogging = listOf(
    Misi(7,
        "Jarak Pendek",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek
    ),
    Misi(8,
        "Jarak Menengah",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek
    )
)