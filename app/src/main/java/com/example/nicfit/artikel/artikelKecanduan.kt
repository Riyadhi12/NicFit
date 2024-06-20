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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.dataKecanduan.kecanduan
import com.example.nicfit.navigation.Screens
import androidx.compose.foundation.lazy.items
import com.example.nicfit.data.Kecanduan
import com.example.nicfit.data.dataKecanduan

@Composable
fun artikelKecanduan(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val kecanduans = remember { dataKecanduan.kecanduanList}

    //Search Bar
    var textState by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(top = 38.dp),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
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
                modifier = Modifier.size(20.dp)
                    .clickable { navController.navigate(Screens.artikel.name) }
            )
            Spacer(modifier = Modifier.width(103.dp))
            Text(
                text = "Kecanduan",
                modifier = Modifier.align(Alignment.CenterVertically),
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 16.sp,
                )
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp) // Adjust padding to position the Column
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
                            color = Color.Gray
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            LazyColumn(contentPadding = PaddingValues(16.dp)) {
                items(
                    items = kecanduans,
                    key = { it.id }
                ) { kecanduan ->
                    ColumnItem(
                        modifier = Modifier,
                        kecanduan = kecanduan,
                        navController = navController
                    )
                }
            }
        }
    }
}
@Composable
fun ColumnItem(
    modifier: Modifier,
    kecanduan: Kecanduan,
    navController: NavController
) {
    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                navController.navigate(route = "detailKecanduan/${kecanduan.id}")
            },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = kecanduan.imageId),
                contentDescription = null,
                modifier
                    .size(145.dp)
            )
            Column(modifier.padding(12.dp)) {
                Text(text = kecanduan.names, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Text(text = kecanduan.penerbit, fontSize = 12.sp, fontWeight = FontWeight.Normal, style = TextStyle(color = Color.Blue))
                Text(text = kecanduan.dates, fontSize = 12.sp, fontWeight = FontWeight.Normal)

            }
        }
    }
}



