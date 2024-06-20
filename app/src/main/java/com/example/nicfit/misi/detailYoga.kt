//package com.example.nicfit.misi
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.example.nicfit.R
//import com.example.nicfit.data.Emosional
//import com.example.nicfit.data.dataEmosional
//import com.example.nicfit.navigation.Screens
//
//@Composable
//fun detailEmosional(
//    modifier : Modifier = Modifier,
//    navController: NavController,
//    yogaId : Int?
//) {
//    val newYogaList = dataEmosional.emosionalList.filter { emosional ->
//        emosional.id == emosionalId
//    }
//    Column(
//        modifier = Modifier.fillMaxSize()
//            .padding(top = 38.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Spacer(modifier = Modifier.height(38.dp))
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(start = 25.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.back3),
//                contentDescription = null,
//                modifier = Modifier.size(20.dp)
//                    .clickable { navController.navigate(Screens.artikel.name) }
//            )
//            Spacer(modifier = Modifier.width(103.dp))
//            Text(
//                text = "Emosional",
//                modifier = Modifier.align(Alignment.CenterVertically),
//                style = TextStyle(
//                    fontWeight = FontWeight.SemiBold,
//                    color = Color.Black,
//                    fontSize = 16.sp,
//                )
//            )
//        }
//        Column(
//            modifier
//                .fillMaxSize()
//                .padding(25.dp),
//            verticalArrangement = Arrangement.spacedBy(20.dp)
//        ){
//            detailEmosionalContent(newEmosiList = newEmosiList,navController = navController)
//        }
//    }
//}
//
//@Composable
//fun detailEmosionalContent(
//    newEmosiList: List<Emosional>,
//    navController: NavController,
//    modifier : Modifier = Modifier,
//) {
//    if (newEmosiList.isNotEmpty()) {
//        Column{
//            newEmosiList.forEach { emosional ->
//                Box(
//                    modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Image(
//                        painter = painterResource(id = emosional.imageId),
//                        contentDescription = null,
//                        modifier
//                            .size(200.dp)
//                            .clip(RoundedCornerShape(16.dp))
//                            .fillMaxWidth()
//                    )
//                }
//                Text(
//                    text = emosional.names,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold
//                )
//                Text(text = emosional.penerbit, fontSize = 12.sp)
//                Text(text = emosional.deskripsi, fontSize = 18.sp)
//            }
//        }
//    }
//}