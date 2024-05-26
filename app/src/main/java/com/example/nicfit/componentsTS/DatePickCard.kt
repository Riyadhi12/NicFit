package com.example.nicfit.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@Composable
fun DatePickCard(
    modifier: Modifier
) {
   Card(
       modifier = modifier.fillMaxWidth(),
       colors = CardDefaults.cardColors(Color.White),
       elevation = CardDefaults.cardElevation(12.dp)
   ) {
       Column {
           Row(
               modifier = modifier
                   .fillMaxWidth()
                   .padding(horizontal = 16.dp),
               horizontalArrangement = Arrangement.SpaceBetween
           ) {
               Text(text = "Maret 2024")
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
           Row(
               modifier = modifier.fillMaxWidth()
           ){
               SmallDateCard(modifier = modifier, day = "Jum", date = "25", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Sab", date = "26", enabledStatus = true, chosenStatus = false)
               SmallDateCard(modifier = modifier, day = "Min", date = "27", enabledStatus = true, chosenStatus = false)
           }
       }
   }
}

@Composable
fun TimePickCard(
    modifier: Modifier
){
    Column(
        modifier = modifier.fillMaxWidth().padding(top = 16.dp, bottom = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pilih Waktu", modifier = modifier.align(Alignment.Start).padding(start = 12.dp))
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
    OutlinedButton(onClick = {
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
        modifier = modifier
            .width(90.dp)
            .padding(4.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(text = day,
                color = when (statusChosen.value) {
                    true -> when (statusChosen.value) {
                        true -> Color.White
                        false -> colorResource(id = R.color.blue_nicfit)
                    }
                    false -> Color.Gray
                },
                modifier = modifier.fillMaxWidth())
            Text(text = date,
                modifier = modifier.fillMaxWidth(),
                color = when (statusChosen.value) {
                    true -> when (statusChosen.value) {
                        true -> Color.White
                        false -> colorResource(id = R.color.blue_nicfit)
                    }
                    false -> Color.Gray
                })
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
    OutlinedButton(onClick = {
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
        modifier = modifier.padding(4.dp),
    ) {
        Text(text = time,
            color = when (statusChosen.value) {
                    true -> when (statusChosen.value) {
                        true -> Color.White
                        false -> colorResource(id = R.color.blue_nicfit)
                    }
                    false -> Color.Gray
                }
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