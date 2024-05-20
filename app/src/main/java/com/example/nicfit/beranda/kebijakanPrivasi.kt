package com.example.nicfit.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens

@Composable
fun kebijakanPrivasi(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 38.dp),
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(38.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back3),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .clickable { navController.navigate(Screens.pengaturan.name) }
            )
            Spacer(modifier = Modifier.width(103.dp))
            Text(
                text = "Kebijakan Privasi",
                modifier = Modifier.align(Alignment.CenterVertically),
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 16.sp,
                )
            )
        }
        Spacer(modifier = Modifier.height(38.dp))
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = "Kebijakan Privasi",
                modifier = Modifier,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 14.sp,
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "Terakhir diperbarui: [17/05/2024]",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 12.sp,
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Kami di Nicfit sangat menghargai privasi pengunjung kami. Dokumen Kebijakan Privasi ini menjelaskan bagaimana informasi pribadi Anda dikumpulkan, digunakan, dan diungkapkan saat Anda mengunjungi [https://www.Nicfit.com]",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 12.sp,
                )
            )
            Spacer(modifier = Modifier.height(13.dp))
            Text(text = "Pengumpulan Informasi dan Penggunaan",
                modifier = Modifier,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 14.sp,
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "Kami tidak secara aktif mengumpulkan informasi pribadi dari Anda ketika Anda hanya mengunjungi Situs kami. Namun, seperti banyak situs web lainnya, kami menerima dan menyimpan informasi tertentu secara otomatis melalui penggunaan cookie dan alat pelacakan yang umum digunakan. Informasi yang dikumpulkan dapat mencakup alamat protokol internet (IP), jenis peramban, sistem operasi, tanggal dan waktu kunjungan, serta alamat situs web tempat Anda berasal.",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 12.sp,
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "Informasi ini digunakan untuk menganalisis kebiasaan pengguna, mengelola Situs, melacak pergerakan pengguna di sekitar Situs, dan mengumpulkan informasi demografis. Data demografis yang dikumpulkan mungkin digunakan dalam penargetan iklan yang sesuai dengan kepentingan pengguna.",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 12.sp,
                )
            )
            Spacer(modifier = Modifier.height(13.dp))
            Text(text = "Pengungkapan kepada Pihak Ketiga",
                modifier = Modifier,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 14.sp,
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "Kami tidak akan menjual, menyewakan, atau memberikan informasi pribadi Anda kepada pihak ketiga kecuali dengan izin Anda atau jika diwajibkan oleh hukum.",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 12.sp,
                )
            )
        }
    }

}