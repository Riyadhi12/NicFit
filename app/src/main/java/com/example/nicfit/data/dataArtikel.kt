package com.example.nicfit.data

import com.example.nicfit.R

data class Kecanduan(
    val id : Int,
    val imageId : Int = 0 ,
    val names : String,
    val dates : String,
    val penerbit : String,
    val deskripsi : String
)
data class Emosional(
    val id : Int,
    val imageId : Int = 0 ,
    val names : String,
    val dates : String,
    val penerbit : String,
    val deskripsi : String
)

object dataKecanduan {
    val kecanduan =
        Kecanduan(
            id = 1,
            imageId =  R.drawable.p1 ,
            names = "Panduan Holistik untuk Mengatasi Ketergantungan",
            dates = "05 Mei 2024",
            penerbit ="investpedia.com" ,
            deskripsi ="Investasi mirip dengan menabung, namun bisa menghasilkan keuntungan yang mengalahkan inflasi. Investasi bisa jadi pilihan untuk mempersiapkan kebutuhan hidup di masa yang akan datang seperti mempersiapkan dana pendidikan, biaya pernikahan, atau bahkan danapensiun. Jadi suatu saat Anda tidak perlu terus bekerja dan memutuskan untuk pensiun dini, karena sudah rutin mendapat penghasilan dari instrumen investasi yang Anda miliki. Selain itu bisa juga dijadikan cadangan harta, bilamana Anda memiliki kebutuhan mendadak." ,
        )
    val kecanduanList = listOf(
        kecanduan,
        Kecanduan(
            id = 2,
            imageId =  R.drawable.p2 ,
            names = "Mengakhiri Kebiasaan Merokok",
            dates = "21 Februari 2024",
            penerbit ="investpedia.com" ,
            deskripsi ="Tomato sos and cheese",
        ),
        Kecanduan(
            id = 3,
            imageId =  R.drawable.p3 ,
            names = "Solusi untuk Generasi Penerus yang Sehat",
            dates = "16 April 2024",
            penerbit ="investpedia.com" ,
            deskripsi ="Tomato sos, oregano, mozzarella, goda, parmesan, cheddar"
        )
    )

}

object dataEmosional {
    val emosional =
        Emosional(
            id = 1,
            imageId =  R.drawable.p4 ,
            names = "Panduan Holistik untuk Mengatasi Ketergantungan",
            dates = "05 Mei 2024",
            penerbit ="investpedia.com" ,
            deskripsi ="Investasi mirip dengan menabung, namun bisa menghasilkan keuntungan yang mengalahkan inflasi. Investasi bisa jadi pilihan untuk mempersiapkan kebutuhan hidup di masa yang akan datang seperti mempersiapkan dana pendidikan, biaya pernikahan, atau bahkan danapensiun. Jadi suatu saat Anda tidak perlu terus bekerja dan memutuskan untuk pensiun dini, karena sudah rutin mendapat penghasilan dari instrumen investasi yang Anda miliki. Selain itu bisa juga dijadikan cadangan harta, bilamana Anda memiliki kebutuhan mendadak." ,
        )
    val emosionalList = listOf(
        emosional,
        Emosional(
            id = 2,
            imageId =  R.drawable.p5 ,
            names = "Mengakhiri Kebiasaan Merokok",
            dates = "21 Februari 2024",
            penerbit ="investpedia.com" ,
            deskripsi ="Tomato sos and cheese",
        ),
        Emosional(
            id = 3,
            imageId =  R.drawable.p6 ,
            names = "Solusi untuk Generasi Penerus yang Sehat",
            dates = "16 April 2024",
            penerbit ="investpedia.com" ,
            deskripsi ="Tomato sos, oregano, mozzarella, goda, parmesan, cheddar"
        )
    )

}




