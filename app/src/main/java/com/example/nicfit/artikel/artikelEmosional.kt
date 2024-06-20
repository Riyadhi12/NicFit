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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.data.dataEmosional.emosional
import com.example.nicfit.navigation.Screens
import androidx.compose.foundation.lazy.items
import com.example.nicfit.data.Emosional
import com.example.nicfit.data.dataEmosional
import com.example.nicfit.data.dataKecanduan

@Composable
fun artikelEmosional(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val emosionals = remember { dataEmosional.emosionalList}

    var textState by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(top = 38.dp),
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
                text = "Emosional",
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
        LazyColumn(contentPadding = PaddingValues(16.dp)) {
            items(
                items = emosionals,
                key = { it.id }
            ) { emosional ->
                ItemEmosional(
                    modifier = Modifier,
                    emosional = emosional,
                    navController = navController
                )
            }
        }
    }
}

@Composable
fun ItemEmosional(
    modifier: Modifier,
    emosional: Emosional,
    navController: NavController
) {
    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                navController.navigate(route = "detailEmosional/${emosional.id}")
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
                painter = painterResource(id = emosional.imageId),
                contentDescription = null,
                modifier
                    .size(145.dp)
            )
            Column(modifier.padding(12.dp)) {
                Text(text = emosional.names, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                Text(text = emosional.penerbit, fontSize = 12.sp, fontWeight = FontWeight.Normal, style = TextStyle(color = Color.Blue))
                Text(text = emosional.dates, fontSize = 12.sp, fontWeight = FontWeight.Normal)

            }
        }
    }
}
