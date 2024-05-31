package com.example.nicfit.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.SmokingRooms
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.example.nicfit.R
import com.example.nicfit.misi.misi
import com.example.nicfit.navigation.Screens
import com.example.nicfit.ui.theme.Blue


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun beranda(navController: NavController) {
   Box(
      modifier = Modifier
         .fillMaxSize()
         .background(color = Blue)
   ) {
      Column(
         modifier = Modifier
      ) {
         Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
               .padding(top = 21.dp, start = 20.dp)
         ) {
            Card(
               shape = CircleShape,
               modifier = Modifier
                  .size(56.dp)
                  .clickable {
                     navController.navigate(Screens.profile.name)
                  }
            ) {
               Image(
                  painter = painterResource(id = R.drawable.yoga),
                  contentDescription = null,
                  contentScale = ContentScale.Crop,
                  modifier = Modifier.size(56.dp)

               )
            }
            Column(
               modifier = Modifier.padding(start = 5.dp)
            ) {
               Text(
                  text = "Hallo,",
                  color = Color.White
               )
               Text(
                  text = "Yoga Agatha",
                  fontWeight = FontWeight.Bold,
                  color = Color.White
               )
            }
            Image(
               painterResource(id = R.drawable.inotif)
               , contentDescription = "",
               modifier = Modifier
                  .padding(start = 178.dp)
                  .size(24.dp)
            )

         }
         Text(text = "Semangat,Kamu telah berhenti merokok selama 10 hari atau 120 batang",
            modifier = Modifier.padding(top = 30.dp, start = 55.dp, end = 55.dp),
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            color = Color.White
         )
      }
      Box( //Box Bawah
         modifier = Modifier
            //.padding(start = 6.dp, end = 6.dp)
            .align(Alignment.BottomCenter)
            .fillMaxWidth()
            .fillMaxHeight(0.70f)
            .background(
               color = Color.White,
               shape = RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
            )
      )
   }
   Column(
      modifier = Modifier
         .fillMaxWidth()
         .padding(top = 170.dp) // Adjust padding to position the Column
   ) {
      Row(
         modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 24.dp)
            .shadow(3.dp, shape = RoundedCornerShape(20.dp))
            .background(
               color = Color.White,
               shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp),
         verticalAlignment = Alignment.CenterVertically
      ) {
         Box {
            Icon(
               imageVector = Icons.Default.AttachMoney,
               contentDescription = "Hemat Uang",
               tint = Color(0xFF4CAF50),
               modifier = Modifier
                  .size(40.dp)
                  .clip(CircleShape)
                  .background(Color(0xFFE8F5E9))
                  .padding(8.dp)
            )
         }
         Column(
            modifier = Modifier
               .padding(start = 16.dp)
               .weight(1f)
         ) {
            Text(
               text = "Hemat Uang",
            )
            Text(
               text = "Rp.50,000",
            )
         }
         Divider(
            color = Color.Gray,
            modifier = Modifier
               .height(40.dp)
               .width(1.dp)
         )
         Spacer(modifier = Modifier.width(10.dp))

         Box {
            Icon(
               imageVector = Icons.Default.SmokingRooms,
               contentDescription = "Tidak Merokok",
               tint = Color(0xFFF44336),
               modifier = Modifier
                  .size(40.dp)
                  .clip(CircleShape)
                  .background(Color(0xFFFFEBEE))
                  .padding(8.dp)
            )
         }
         Column(
            modifier = Modifier
               .padding(start = 16.dp)
               .weight(1f)
         ) {
            Text(
               text = "Tidak Merokok",
            )
            Text(
               text = "20",
               modifier = Modifier.padding(end = 8.dp)
            )
         }
      }
      Box(
         modifier = Modifier
            .fillMaxWidth()
            .height(134.dp)
            .padding(vertical = 10.dp, horizontal = 24.dp)
            .background(
               color = Blue.copy(alpha = 0.2f),
               shape = RoundedCornerShape(16.dp)
            )
      ) {
        Row {
           Image(painter = painterResource(id = R.drawable.budoc),
              contentDescription = "",
              modifier = Modifier.padding(start = 22.dp)
           )
           Text (text = "Terhubung Dengan Konsultan Dan Dapatkan saran",
              modifier = Modifier.padding(start = 25.dp, top = 12.dp),
              fontWeight = FontWeight.SemiBold,
              color = Color.Black,
              fontSize = 14.sp
           )
        }
            Button(
               onClick = { }, modifier = Modifier
                  .padding(top = 70.dp, start = 126.dp)
                  .width(100.dp)
                  .height(30.dp),
               shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
               colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF508CAE)))
            {
               Text(text = "Lihat Detail",
                       fontSize = 10.sp)
            }
      }
   }
}

