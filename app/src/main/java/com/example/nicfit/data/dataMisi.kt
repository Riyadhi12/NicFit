package com.example.nicfit.data

import com.example.nicfit.R

data class Misi(
    val id : Int,
    val nama: String,
    val deskripsi: String,
    val img : Int = 0,
    val petunjuk : String,
    val manfaat : String,
)


val semuaMisi = listOf(
    Misi(1,
        "Berjalan Santai",
        "Meredakan stres",
        R.drawable.berjalan,
        "",
        ""
    ),
    Misi(3,
        "Kapalbhati pranayama",
        "Detoksifikasi Diri",
        R.drawable.kapalbhati,
        "Duduk bersila dengan menegakkan tulang belakang. Kondisi telapak tangan terbuka dan letakkan di atas lutut. Tarik napas dalam-dalam. Saat mengeluarkan napas, tarik perut sedalam mungkin dan letakkan tangan kanan di perut untuk merasakan kontraksi otot-otot.",
        "Pose ini membantu tubuh mendetoksifikasi diri dengan mengeluarkan racun seraya bernapas. Selain meningkatkan sirkulasi darah, bentuk yoga ini meremajakan sistem saraf dan sel-sel otak. Di sini peran yoga menenangkan pikiran dan membantu menahan keinginan untuk merokok.."
    ),
    Misi(2,
        "Berjalan Cepat",
        "Tingkatkan sirkulasi darah",
        R.drawable.berjalan,
        "",
        ""
    ),
    Misi(4,
        "Bhujangasana",
        "Tingkatkan Sirkulasi Darah",
        R.drawable.bhujangsana,
        "",
        ""
    ),
    Misi(5,
        "Gaya Bebas",
        "Detoksifikasi Diri",
        R.drawable.gayabebas,
        "Berbaring telentang, gerakkan tangan bergantian untuk mendorong air dari depan ke belakang. Gerakkan kaki seperti berenang dengan sirip. Pastikan tubuh tetap sejajar dengan permukaan air dan bernapas secara teratur.",
        "Renang gaya bebas memberikan latihan kardiovaskular yang efektif, meningkatkan kapasitas paru-paru, serta merangsang pelepasan endorfin. Dengan gerakan tangan yang teratur dan pernapasan yang dalam, gaya ini membantu perokok mengurangi keinginan untuk merokok sambil memperbaiki sirkulasi darah dan memperkuat sistem pernapasan."
    ),
    Misi(7,
        "Jarak Pendek",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek,
        "",
        ""
    ),
    Misi(6,
        "Gaya Dada",
        "Tingkatkan Sirkulasi Tubuh",
        R.drawable.gayabebas,
        "",
        ""
    ),

    Misi(8,
        "Jarak Menengah",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek,
        "",
        ""
    ),
)

val misiBerjalan = listOf(
    Misi(1,
        "Berjalan Santai",
        "Meredakan stres",
        R.drawable.berjalan,
        "",
        ""
    ),
    Misi(2,
        "Berjalan Cepat",
        "Tingkatkan sirkulasi darah",
        R.drawable.berjalan,
        "",
        ""
    )
)

val misiYoga = listOf(
    Misi(3,
        "Kapalbhati pranayama",
        "Detoksifikasi Diri",
        R.drawable.kapalbhati,
        "",
        ""
    ),
    Misi(4,
        "Bhujangasana",
        "Tingkatkan Sirkulasi Darah",
        R.drawable.bhujangsana,
        "",
        ""
    ),
)

val misiBerenang = listOf(
    Misi(5,
        "Gaya Bebas",
        "Detoksifikasi Diri",
        R.drawable.gayabebas,
        "",
        ""
    ),
    Misi(6,
        "Gaya Dada",
        "Tingkatkan Sirkulasi Tubuh",
        R.drawable.gayabebas,
        "",
        ""
    )

)
val misiJogging = listOf(
    Misi(7,
        "Jarak Pendek",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek,
        "",
        ""
    ),
    Misi(8,
        "Jarak Menengah",
        "Detoksifikasi Diri",
        R.drawable.jarakpendek,
        "",
        ""
    )
)