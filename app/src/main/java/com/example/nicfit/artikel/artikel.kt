

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.dataEmosional
import com.example.nicfit.data.dataKecanduan
import com.example.nicfit.navigation.Screens
import com.example.nicfit.ui.theme.Blue


@Composable
fun artikel(
    navController : NavController,
    modifier: Modifier
) {
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
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Temukan Panduang Yang bisa Membuat Mu\n" +
                        "           Semangat Untuk Berhenti Merokok",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
                style = TextStyle(
                    fontSize = 12.sp,
                )
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
        Box( //Box Bawah
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.75f)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
                )
                .padding(30.dp)
        ) {
            //lazyrow kecanduan
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Kecanduan", fontSize = 24.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 10.dp, start = 16.dp)
                    )
                    Text(
                        text = "Lihat Semua",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF508CAE),
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .clickable { navController.navigate(Screens.artikelKecanduan.name) }
                    )
                }
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(top = 5.dp)
                ) {
                    val itemCount = dataKecanduan.imageId.size

                    items(itemCount) {
                        rowItemKecanduan(
                            modifier,
                            painter = dataKecanduan.imageId,
                            title = dataKecanduan.names,
                            dates = dataKecanduan.dates,
                            itemIndex = it,
                            navController = navController
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))
                //lazyrow Emosional

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Emosional", fontSize = 24.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 10.dp, start = 16.dp)
                    )
                    Text(
                        text = "Lihat Semua",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF508CAE),
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .clickable { navController.navigate(Screens.artikelEmosional.name) }
                    )
                }
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(top = 5.dp)
                ) {
                    val itemCount = dataEmosional.imageRes.size

                    items(itemCount) {
                        rowItemEmosional(
                            modifier,
                            painter = dataEmosional.imageRes,
                            judul = dataEmosional.judul,
                            tanggal = dataEmosional.tanggal,
                            itemIndex = it,
                            navController = navController
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))
                //lazyrow Lingkungan

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Lingkungan", fontSize = 24.sp, fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(top = 10.dp, start = 16.dp))
                        Text(
                            text = "Lihat Semua", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color(0xFF508CAE),
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .clickable { navController.navigate(Screens.artikelKecanduan.name) }
                        )
                    }
                    LazyRow (modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(top = 5.dp)
                    ){
                        val itemCount = dataKecanduan.imageId.size

                        items(itemCount) {
                            rowItemKecanduan(
                                modifier,
                                painter = dataKecanduan.imageId,
                                title = dataKecanduan.names,
                                dates = dataKecanduan.dates,
                                itemIndex = it,
                                navController = navController
                            )
                        }
                    }
                }
            }
        }

    //Search Bar
    var textState by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 160.dp) // Adjust padding to position the Column
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
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                if (textState.text.isEmpty()) {
                    Text(
                        text = "Cari Artikel",
                        style = TextStyle(fontFamily = FontFamily.SansSerif),
                        color = Color.Gray
                    )
                }
            }
        }
    }
}



@Composable
fun rowItemKecanduan(
    modifier: Modifier,
    painter: Array<Int>,
    title: Array<String>,
    dates: Array<String>,
    itemIndex: Int,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .size(width = 165.dp, 220.dp)
            .padding(horizontal = 5.dp)
            .clickable {
                navController.navigate(route = "detailKecanduan/$itemIndex")
            },
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(6.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = painter[itemIndex]),
                contentDescription = title[itemIndex],
                modifier.fillMaxWidth()
            )
            Column(modifier.padding(12.dp)) {
                Text(text = title[itemIndex], fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                Text(text = dates[itemIndex], fontSize = 12.sp, fontWeight = FontWeight.Normal)
            }
        }
    }
}

@Composable
fun rowItemEmosional(
    modifier: Modifier,
    painter: Array<Int>,
    judul: Array<String>,
    tanggal: Array<String>,
    itemIndex: Int,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .size(width = 165.dp, 220.dp)
            .padding(horizontal = 5.dp)
            .clickable {
                navController.navigate(route = "detailEmosional/$itemIndex")
            },
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(6.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = painter[itemIndex]),
                contentDescription = judul[itemIndex],
                modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Column(modifier.padding(12.dp)) {
                Text(text = judul[itemIndex], fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                Text(text = tanggal[itemIndex], fontSize = 12.sp, fontWeight = FontWeight.Normal)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ArtikelPrev(){

}