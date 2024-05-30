package com.example.nicfit.splash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerScreen(navController: NavController) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = { 3 }
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            when (page) {
                0 -> OnboardingPage(
                    image = R.drawable.first,
                    title = "Selamat datang di Nicfit",
                    description = "     Nicfit merupakan aplikasi yang akan \n" +
                                  "membantu mengatasi masalah mu dalam \n" +
                                  "                     berhenti merokok"
                )
                1 -> OnboardingPage(
                    image =  R.drawable.second,
                    title = "Selesaikan Misi dan Wujudkan Impian",
                    description = "     Nicfit merupakan aplikasi yang akan \n" +
                                  "membantu mengatasi masalah mu dalam \n" +
                                  "                     berhenti merokok"
                )
                2 -> OnboardingPage(
                    image =  R.drawable.third,
                    title = "Berkenalan Dengan Teman Sehat",
                    description = "     Nicfit merupakan aplikasi yang akan \n" +
                                  "membantu mengatasi masalah mu dalam \n" +
                                  "                     berhenti merokok"
                )
            }
        }
        PagerIndicator(currentPage = pagerState.currentPage, navController = navController)
    }
}

@Composable
fun PagerIndicator(currentPage: Int, navController: NavController) {
    val indicatorWidths = remember { mutableStateListOf(27.dp, 27.dp, 27.dp) }
    val maxIndicatorWidth = 45.dp
    LaunchedEffect(currentPage) {
        indicatorWidths[currentPage] = maxIndicatorWidth
        indicatorWidths.forEachIndexed { index, _ ->
            if (index != currentPage) {
                indicatorWidths[index] = 20.dp
            }
        }
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Box(
            modifier = Modifier
                .padding(start = 33.dp, end = 55.dp)
                .size(40.dp)
                .clip(CircleShape)
                .background(Color(0x00000000))
                .border(width = 2.dp, color = Color(0xFF508CAE), shape = CircleShape),
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Previous",
                tint = Color(0xFF508CAE),
                modifier = Modifier
                    .clickable {
                        if (currentPage > 0) {
                            navController.navigateUp()
                        }
                    }
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            repeat(3) { index ->
                val color = if (index == currentPage) Color(0xFF508CAE) else Color.Gray
                Box(
                    modifier = Modifier
                        .width(indicatorWidths[index])
                        .height(15.dp)
                        .background(color, shape = CircleShape)
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 55.dp)
                .size(40.dp)
                .background(Color(0xFF508CAE), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Next",
                tint = Color.White,
                modifier = Modifier
                .clickable {
                if (currentPage < 3) {
                    navController.navigate(Screens.login.name)
                }
            }
            )
        }
    }
}
@Composable
fun OnboardingPage(image: Int, title: String, description: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(137.dp))
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(286.dp)
                .height(286.dp)
        )
        Spacer(modifier = Modifier.height(21.dp))
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = description,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}