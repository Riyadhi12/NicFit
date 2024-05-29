package com.example.nicfit.components

import android.icu.text.UnicodeSet.SpanCondition
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily

@Composable
fun DatePickCard(
    modifier: Modifier
) {
   Card(
       modifier = modifier
           .fillMaxWidth()
           .padding(horizontal = 16.dp),
       colors = CardDefaults.cardColors(Color.White),
       elevation = CardDefaults.cardElevation(12.dp)
   ) {
       Column {
           Row(
               modifier = modifier
                   .fillMaxWidth()
                   .padding(horizontal = 16.dp, vertical = 16.dp),
               horizontalArrangement = Arrangement.SpaceBetween
           ) {
               Text(text = "Maret 2024", fontFamily = poppinFamily, fontWeight = FontWeight.Bold)
               Row {
                   Image(
                       painter = painterResource(id = R.drawable.disabled_left_arrow),
                       contentDescription = "",
                       modifier = modifier.size(16.dp)
                   )
                   Image(
                       painter = painterResource(id = R.drawable.right_arrow),
                       contentDescription = "",
                       modifier = modifier.size(16.dp)
                   )
               }
           }
           Row(
               modifier = modifier.fillMaxWidth()
           ){
               SmallDateCard(modifier = modifier, day = "Sen", date = "21", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Sel", date = "22", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Rab", date = "23", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Kam", date = "24", enabledStatus = true, chosenStatus = true)
           }
           Spacer(modifier = modifier.padding(8.dp))
           Row(
               modifier = modifier.fillMaxWidth()
           ){
               SmallDateCard(modifier = modifier, day = "Jum", date = "25", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Sab", date = "26", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Min", date = "27", enabledStatus = true, chosenStatus = false)
           }
           Spacer(modifier = modifier.padding(16.dp))
       }
   }
}

@Composable
fun TimePickCard(
    modifier: Modifier
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pilih Waktu", modifier = modifier
            .align(Alignment.Start)
            .padding(start = 12.dp), fontFamily = poppinFamily, fontWeight = FontWeight.Bold)
        Row {
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "09.00 AM", modifier = modifier)
            SmallTimeCard(enabledStatus = true, chosenStatus = false, time = "10.00 AM", modifier = modifier)
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "11.00 AM", modifier = modifier)
        }
        Row {
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "12.00 AM", modifier = modifier)
            SmallTimeCard(enabledStatus = true, chosenStatus = true, time = "13.00 AM", modifier = modifier)
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "14.00 AM", modifier = modifier)
        }
        Row {
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "15.00 AM", modifier = modifier)
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "16.00 AM", modifier = modifier)
            SmallTimeCard(enabledStatus = false, chosenStatus = false, time = "17.00 AM", modifier = modifier)
        }
    }
}

@Composable
fun SmallDateCard(
    modifier: Modifier,
    day: String, date: String,
    enabledStatus:Boolean,
    chosenStatus: Boolean,
) {
    val statusChosen = remember {
        mutableStateOf(chosenStatus)
    }
    val enableStatus = remember {
        mutableStateOf(enabledStatus)
    }
    OutlinedButton(
        modifier = modifier
            .width(90.dp)
            .padding(horizontal = 6.dp),
        shape = RoundedCornerShape(16.dp),
        onClick = {
        statusChosen.value = !statusChosen.value
    }, enabled = enableStatus.value,
        colors = ButtonDefaults.buttonColors(
            when (statusChosen.value) {
                true -> colorResource(id = R.color.blue_nicfit)
                false -> Color.White
            }
        ),
        border = BorderStroke(1.dp,
            when (enableStatus.value) {
                true -> colorResource(id = R.color.blue_nicfit)
                false -> Color.Gray
            }),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(text = day,
                textAlign = TextAlign.Center,
                color = when (statusChosen.value) {
                    true -> when (statusChosen.value) {
                        true -> Color.White
                        false -> colorResource(id = R.color.blue_nicfit)
                    }
                    false -> Color.Gray
                },
                modifier = Modifier.fillMaxWidth(), fontFamily = poppinFamily, fontWeight = FontWeight.Normal, fontSize = 10.sp)
            Text(text = date,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = when (statusChosen.value) {
                    true -> when (statusChosen.value) {
                        true -> Color.White
                        false -> colorResource(id = R.color.blue_nicfit)
                    }
                    false -> Color.Black
                }, fontFamily = poppinFamily, fontWeight = FontWeight.Bold,)
        }
    }
}

@Composable
fun SmallTimeCard(
    enabledStatus:Boolean,
    chosenStatus: Boolean,
    time: String,
    modifier: Modifier
) {
    val statusChosen = remember {
        mutableStateOf(chosenStatus)
    }
    val enableStatus = remember {
        mutableStateOf(enabledStatus)
    }
    OutlinedButton(
        modifier = modifier.padding(horizontal = 8.dp),
        shape = RoundedCornerShape(12.dp),
        onClick = {
        statusChosen.value = !statusChosen.value
    }, enabled = enableStatus.value,
        colors = ButtonDefaults.buttonColors(
        when (statusChosen.value) {
            true -> colorResource(id = R.color.blue_nicfit)
            false -> Color.White
        }
    ),
        border = BorderStroke(1.dp,
            when (enableStatus.value) {
                true -> colorResource(id = R.color.blue_nicfit)
                false -> Color.Gray
            })
    ) {
        Text(text = time,
            modifier = modifier,
            color = when (statusChosen.value) {
                    true -> when (statusChosen.value) {
                        true -> Color.White
                        false -> colorResource(id = R.color.blue_nicfit)
                    }
                    false -> Color.Gray
                }, fontFamily = poppinFamily, fontWeight = FontWeight.Normal
            )
    }
}

@Preview
@Composable
fun PreviewDatePickCard() {
    Column {
        DatePickCard(modifier = Modifier)
        TimePickCard(modifier = Modifier)
    }
}