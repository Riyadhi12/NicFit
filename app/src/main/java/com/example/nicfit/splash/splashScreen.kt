package com.example.nicfit.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nicfit.R
import com.example.nicfit.navigation.Screens
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun splashScreen(navController: NavController){
    val context = LocalContext.current

    val scope = rememberCoroutineScope()
    LaunchedEffect(key1 = true) {
        scope.launch {

            delay(3000) // Delay for 3 seconds
            navController.navigate(Screens.PagerScreen.name) {
                popUpTo(Screens.splashScreen.name) { inclusive = true }
            }

           

        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logonicift),
            contentDescription = "Splash Image",
            modifier = Modifier
                .size(200.dp)
                .alpha(1f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {

}