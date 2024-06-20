package com.example.nicfit.artikel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.Kecanduan
import com.example.nicfit.data.dataEmosional
import com.example.nicfit.data.dataKecanduan
import com.example.nicfit.data.dataKecanduan.kecanduan
import com.example.nicfit.navigation.Screens
import com.example.nicfit.ui.theme.Blue
import androidx.compose.foundation.lazy.items
import com.example.nicfit.componentsTS.poppinFamily
import com.example.nicfit.data.Emosional

@Composable
fun artikel(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val kecanduans = remember { dataKecanduan.kecanduanList }
    val emosionals = remember { dataEmosional.emosionalList }
    var textState by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Blue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
        ) {
            Text(
                text = "Artikel",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinFamily
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Temukan Panduang Yang bisa Membuat Mu\n" +
                        "           Semangat Untuk Berhenti Merokok",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = poppinFamily
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box( // Box Bawah
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.71f)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
                )
                .padding(30.dp)
        )
    }

    Column( // SEARCH BAR
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 165.dp) // Adjust padding to position the Column
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(15.dp))
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(13.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "Search Bar",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            BasicTextField(
                value = textState,
                onValueChange = { textState = it },
                modifier = Modifier.fillMaxWidth()
            ) {
                if (textState.text.isEmpty()) {
                    Text(
                        text = "Cari Artikel",
                        style = TextStyle(fontFamily = FontFamily.SansSerif),
                        color = Color.Gray
                    )
                } else {
                    it()
                }
            }
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(start = 20.dp)
        ) {
            item {
                Row(
                    modifier = Modifier
                        .padding(top = 7.dp, bottom = 7.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Kecanduan", fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 10.dp, start = 16.dp)
                    )
                    Text(
                        text = "Lihat Semua",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF508CAE),
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .clickable { navController.navigate(Screens.artikelKecanduan.name) }
                    )
                }
                LazyRow(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    items(
                        items = kecanduans,
                        key = { it.id },
                        itemContent = {
                            rowItemKecanduan(kecanduan = it) { kecanduanId ->
                                navController.navigate(Screens.detailKecanduan.name + "/${kecanduanId}")
                            }
                        }
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp, start = 16.dp, bottom = 7.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Emosional", fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                    )
                    Text(
                        text = "Lihat Semua",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF508CAE),
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .clickable { navController.navigate(Screens.artikelEmosional.name) }
                    )
                }
                LazyRow(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    items(
                        items = emosionals,
                        key = { it.id },
                        itemContent = {
                            rowItemEmosional(emosional = it) { emosionalId ->
                                navController.navigate(Screens.detailEmosional.name + "/${emosionalId}")
                            }
                        }
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp, start = 16.dp, bottom = 7.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Lingkungan", fontSize = 16.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                    )
                    Text(
                        text = "Lihat Semua",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF508CAE),
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .clickable { navController.navigate(Screens.artikelKecanduan.name) }
                    )
                }
                LazyRow(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    items(
                        items = emosionals,
                        key = { it.id },
                        itemContent = {
                            rowItemEmosional(emosional = it) { emosionalId ->
                                navController.navigate(Screens.detailEmosional.name + "/${emosionalId}")
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun rowItemKecanduan(
    kecanduan: Kecanduan,
    onClick: (Int) -> Unit
) {
    Card(
        modifier = Modifier
            .clickable { onClick(kecanduan.id) }
            .size(width = 165.dp, height = 220.dp)
            .padding(horizontal = 5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(6.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = kecanduan.imageId),
                contentDescription = kecanduan.names,
                modifier = Modifier.fillMaxWidth()
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(text = kecanduan.names, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                Text(text = kecanduan.dates, fontSize = 12.sp, fontWeight = FontWeight.Normal)
            }
        }
    }
}

@Composable
fun rowItemEmosional(
    emosional: Emosional,
    onClick: (Int) -> Unit
) {
    Card(
        modifier = Modifier
            .clickable { onClick(emosional.id) }
            .size(width = 165.dp, height = 220.dp)
            .padding(horizontal = 5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(6.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = emosional.imageId),
                contentDescription = emosional.names,
                modifier = Modifier.fillMaxWidth()
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(text = emosional.names, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                Text(text = emosional.dates, fontSize = 12.sp, fontWeight = FontWeight.Normal)
            }
        }
    }
}
