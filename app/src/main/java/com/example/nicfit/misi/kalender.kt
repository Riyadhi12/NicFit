package com.example.nicfit.misi

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun CalendarView() {
    var calendar by remember { mutableStateOf(Calendar.getInstance()) }
    val lazyListState = rememberLazyListState()

    // Get today's date
    val today = remember { Calendar.getInstance().time }

    // Generate list of all dates in the current month
    val dates = remember(calendar) {
        val maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        (1..maxDay).map { day ->
            calendar.set(Calendar.DAY_OF_MONTH, day)
            calendar.time
        }
    }

    var selectedDate by remember { mutableStateOf(dates.first()) }
    val coroutineScope = rememberCoroutineScope()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF508CAE))
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = {
            coroutineScope.launch {
                lazyListState.scrollToItem((lazyListState.firstVisibleItemIndex - 7).coerceAtLeast(0))
            }
        }) {
            Icon(
                imageVector = Icons.Default.ArrowBackIos,
                contentDescription = "Previous",
                tint = Color.White
            )
        }

        LazyRow(
            state = lazyListState,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(dates) { date ->
                val isSelected = date == selectedDate
                val dateFormat = SimpleDateFormat("E dd", Locale.getDefault())
                val dateText = dateFormat.format(date).split(" ")
                val day = dateText[0]
                val dayOfMonth = dateText[1]

                // Check if the current date is today
                val isToday = dateFormat.format(date) == dateFormat.format(today)

                DateItem(
                    day = day,
                    dayOfMonth = dayOfMonth,
                    isSelected = isSelected,
                    isToday = isToday,
                    onClick = { selectedDate = date }
                )
                Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            }
        }

        IconButton(onClick = {
            coroutineScope.launch {
                lazyListState.scrollToItem((lazyListState.firstVisibleItemIndex + 5).coerceAtMost(dates.size - 1))
            }
        }) {
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = "Next",
                tint = Color.White
            )
        }
    }
}

@Composable
fun DateItem(day: String, dayOfMonth: String, isSelected: Boolean, isToday: Boolean, onClick: () -> Unit) {
    val backgroundColor = when {
        isToday -> Color.Blue
        isSelected -> Color.White
        else -> Color.White
    }
    val textColor = when {
        isToday -> Color.White
        isSelected -> Color.Black
        else -> Color.Black
    }

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .padding(8.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = day, color = textColor, fontSize = 12.sp)
        Spacer(modifier = Modifier.height(1.dp))
        Text(text = dayOfMonth, color = textColor, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

