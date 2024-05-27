package com.example.nicfit.artikel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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

@Composable
fun artikelEmosional(
    imageRes: Array<Int>,
    judul: Array<String>,
    tanggal: Array<String>,
    pencipta: Array<String>,
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp)
    ){
        Text(
            text = "Kecanduan",
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
    }

    //Search Bar
    var textState by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 120.dp) // Adjust padding to position the Column
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
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        val itemCount = imageRes.size

        items(itemCount) {
            ItemEmosional(
                modifier,
                painter = imageRes,
                judul = judul,
                tanggal = tanggal,
                pencipta = pencipta,
                itemIndex = it,
                navController = navController
            )
        }
    }
}

@Composable
fun ItemEmosional(
    modifier: Modifier,
    painter: Array<Int>,
    judul: Array<String>,
    tanggal: Array<String>,
    pencipta: Array<String>,
    itemIndex: Int,
    navController: NavController
) {
    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                //navController.navigate()
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
                painter = painterResource(id = painter[itemIndex]),
                contentDescription = judul[itemIndex],
                modifier.size(140.dp)
            )
            Column(modifier.padding(12.dp)) {
                Text(text = judul[itemIndex], fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(text = pencipta[itemIndex], fontSize = 12.sp, fontWeight = FontWeight.Normal, style = TextStyle(color = Color.Blue))
                Text(text = tanggal[itemIndex], fontSize = 12.sp, fontWeight = FontWeight.Normal)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EmosionalPrev(){

}