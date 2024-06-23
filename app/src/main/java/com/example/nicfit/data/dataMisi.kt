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


object MisiRepository {
    val semuaMisi = listOf(
        Misi(
            id = 1,
            nama = "Berjalan Santai",
            deskripsi = "Meredakan stres",
            img = R.drawable.berjalan,
            petunjuk = "Berjalan santai adalah aktivitas yang dapat dilakukan dengan berdiri tegak, bahu rileks, dan kepala menghadap ke depan. Langkahkan kaki dengan langkah pendek dan rileks, menjaga kecepatan yang nyaman sekitar 3-4 km/jam. Bernapaslah dengan ritme alami dan dalam, lakukan kegiatan ini selama 30 menit hingga 1 jam.",
            manfaat = "Manfaat berjalan santai termasuk meningkatkan suasana hati, mengurangi stres, dan meningkatkan kesehatan jantung secara keseluruhan."
        ),
        Misi(
            id = 2,
            nama = "Berjalan Cepat",
            deskripsi = "Tingkatkan sirkulasi darah",
            img = R.drawable.berjalan,
            petunjuk = "Berjalan cepat membutuhkan postur tubuh yang tegak dengan bahu rileks, kepala menghadap ke depan, dan lengan sedikit ditekuk di sisi tubuh. Langkahkan kaki dengan langkah yang lebih panjang dan cepat, menjaga kecepatan sekitar 5-6 km/jam. Bernapaslah dengan ritme yang teratur, dan usahakan untuk mempertahankan kecepatan ini selama 20-30 menit.",
            manfaat = "Manfaat berjalan cepat meliputi peningkatan kebugaran kardiovaskular, pembakaran kalori yang lebih efektif, peningkatan kekuatan otot, dan peningkatan stamina secara keseluruhan."
        ),
        Misi(
            id = 3,
            nama = "Yoga Kapalbhati pranayama",
            deskripsi = "Detoksifikasi Diri",
            img = R.drawable.kapalbhati,
            petunjuk = "Duduk bersila dengan menegakkan tulang belakang. Kondisi telapak tangan terbuka dan letakkan di atas lutut. Tarik napas dalam-dalam. Saat mengeluarkan napas, tarik perut sedalam mungkin dan letakkan tangan kanan di perut untuk merasakan kontraksi otot-otot.",
            manfaat = "Pose ini membantu tubuh mendetoksifikasi diri dengan mengeluarkan racun seraya bernapas. Selain meningkatkan sirkulasi darah, bentuk yoga ini meremajakan sistem saraf dan sel-sel otak. Di sini peran yoga menenangkan pikiran dan membantu menahan keinginan untuk merokok."
        ),
        Misi(
            id = 4,
            nama = "Yoga Bhujangasana",
            deskripsi = "Tingkatkan Sirkulasi Darah",
            img = R.drawable.bhujangsana,
            petunjuk = "Bhujangasana, atau pose kobra, dimulai dengan berbaring tengkurap di atas matras dengan kaki lurus dan telapak tangan diletakkan di bawah bahu. Tekan telapak tangan ke matras, angkat kepala dan dada perlahan-lahan dengan menggunakan otot punggung bagian bawah, dan pertahankan tulang pinggul tetap menyentuh matras. Rentangkan tubuh dari kepala hingga ujung kaki dan buka dada sambil menarik napas dalam-dalam. Tahan posisi ini selama 15-30 detik, lalu kembali ke posisi awal dengan menghembuskan napas.",
            manfaat = "Manfaat Bhujangasana termasuk memperkuat otot punggung dan tulang belakang, meningkatkan fleksibilitas tulang belakang, serta membuka dada dan bahu. Pose ini juga membantu meredakan stres dan kelelahan, meningkatkan sirkulasi darah, dan merangsang organ perut untuk meningkatkan pencernaan."
        ),
        Misi(
            id = 5,
            nama = "Gaya Bebas",
            deskripsi = "Detoksifikasi Diri",
            img = R.drawable.gayabebas,
            petunjuk = "Berbaring telentang, gerakkan tangan bergantian untuk mendorong air dari depan ke belakang. Gerakkan kaki seperti berenang dengan sirip. Pastikan tubuh tetap sejajar dengan permukaan air dan bernapas secara teratur.",
            manfaat = "Renang gaya bebas memberikan latihan kardiovaskular yang efektif, meningkatkan kapasitas paru-paru, serta merangsang pelepasan endorfin. Dengan gerakan tangan yang teratur dan pernapasan yang dalam, gaya ini membantu perokok mengurangi keinginan untuk merokok sambil memperbaiki sirkulasi darah dan memperkuat sistem pernapasan."
        ),
        Misi(
            id = 6,
            nama = "Gaya Dada",
            deskripsi = "Tingkatkan Sirkulasi Tubuh",
            img = R.drawable.gayabebas,
            petunjuk = "Renang gaya dada dimulai dengan posisi tubuh mendatar dan wajah menghadap ke air, sejajar dengan permukaan air. Gerakan tangan dimulai dengan merentangkan tangan ke depan, kemudian menariknya ke samping dalam bentuk lingkaran hingga kembali ke posisi awal. Gerakan kaki melibatkan menarik kaki ke arah bokong dan kemudian mendorongnya kembali dengan kuat untuk memberikan dorongan. Pernafasan dilakukan dengan mengangkat kepala setiap kali tangan bergerak ke samping, mengambil nafas, lalu mengembalikan wajah ke air saat tangan kembali ke depan.",
            manfaat = "Manfaat renang gaya dada termasuk meningkatkan kebugaran kardiovaskular, memperkuat otot-otot utama seperti punggung, dada, dan kaki, serta meningkatkan fleksibilitas tubuh."
        ),
        Misi(
            id = 7,
            nama = "Jarak Pendek",
            deskripsi = "Detoksifikasi Diri",
            img = R.drawable.jarakpendek,
            petunjuk = "Mulai dengan pemanasan dinamis seperti jogging ringan dan peregangan untuk mengurangi risiko cedera. Gunakan posisi start jongkok, dorong kuat dari blok start, dan jaga tubuh condong ke depan selama fase akselerasi, dengan ayunan lengan yang kuat dan ritmis serta langkah pendek dan cepat dengan lutut terangkat tinggi, lalu terus dorong hingga melewati garis finish tanpa melambat",
            manfaat = "Manfaat dari lari jarak pendek termasuk peningkatan kecepatan dan daya tahan otot, kapasitas anaerobik, serta refleks dan koordinasi, sedangkan lari jarak menengah meningkatkan kesehatan jantung, kapasitas paru-paru, stamina, dan ketahanan"

        ),
        Misi(
            id = 8,
            nama = "Jarak Menengah",
            deskripsi = "Detoksifikasi Diri",
            img = R.drawable.jarakpendek,
            petunjuk = "Mulai dengan pemanasan menyeluruh dan menggunakan posisi start berdiri atau jongkok yang lebih santai, dimulai dengan kecepatan yang nyaman dan stabil, menjaga postur tubuh tegak sedikit condong ke depan, dan mengatur pernapasan sesuai ritme langkah, dengan peningkatan kecepatan secara bertahap di bagian akhir lomba, serta mempertahankan kecepatan maksimal hingga melewati garis finish.",
            manfaat = "Manfaat dari lari jarak pendek termasuk peningkatan kecepatan dan daya tahan otot, kapasitas anaerobik, serta refleks dan koordinasi, sedangkan lari jarak menengah meningkatkan kesehatan jantung, kapasitas paru-paru, stamina, dan ketahanan"
        )
    )

    val misiBerjalan = semuaMisi.filter { it.nama.contains("Berjalan") }
    val misiYoga = semuaMisi.filter { it.nama.contains("Yoga") }
    val misiBerenang = semuaMisi.filter { it.nama.contains("Gaya") }
    val misiJogging = semuaMisi.filter { it.nama.contains("Jarak") }

}

