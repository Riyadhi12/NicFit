//package com.example.nicfit.beranda
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material.Icon
//import androidx.compose.material.IconButton
//import androidx.compose.material.Scaffold
//import androidx.compose.material.Text
//import androidx.compose.material.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.nicfit.R
//
//data class Notification(
//    val title: String,
//    val message: String,
//    val time: String,
//    val isNew: Boolean
//)
//
//@Composable
//fun NotificationItem(notification: Notification) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//    ) {
//        Icon(
//            painter = painterResource(
//                if (notification.isNew)R.drawable.yoga else R.drawable.second
//            ),
//            contentDescription = null,
//            tint = if (notification.isNew) Color.Red else Color.Gray,
//            modifier = Modifier.size(24.dp)
//        )
//        Spacer(modifier = Modifier.width(16.dp))
//        Column(modifier = Modifier.weight(1f)) {
//            Text(
//                text = notification.title,
//                fontWeight = FontWeight.Bold,
//                fontSize = 16.sp
//            )
//            Text(
//                text = notification.message,
//                fontSize = 14.sp,
//                color = Color.Gray
//            )
//        }
//        Text(
//            text = notification.time,
//            fontSize = 14.sp,
//            color = Color.Gray
//        )
//    }
//}
//
//@Composable
//fun NotificationList(notifications: List<Notification>, contentPadding: PaddingValues) {
//    LazyColumn(contentPadding = contentPadding) {
//        items(notifications) { notification ->
//            NotificationItem(notification = notification)
//        }
//    }
//}
//
//@Composable
//fun NotificationScreen() {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Notifikasi") },
//                navigationIcon = {
//                    IconButton(onClick = { }) {
//                        Icon(
//                            painter = painterResource(R.drawable.second),
//                            contentDescription = null
//                        )
//                    }
//                }
//            )
//        }
//    ) { contentPadding ->
//        val notifications = listOf(
//            Notification("Pasukan Berhenti Merokok", "Ayo ngumpul kita rokok lebih banyak lagi di taman...", "15 Min", isNew = true),
//            Notification("Pasukan Berhenti Merokok", "Ayo ngumpul kita rokok lebih banyak lagi di taman...", "15 Min", isNew = true),
//            Notification("Pasukan Berhenti Merokok", "Ayo ngumpul kita rokok lebih banyak lagi di taman...", "15 Min", isNew = false),
//            Notification("Pasukan Berhenti Merokok", "Ayo ngumpul kita rokok lebih banyak lagi di taman...", "15 Min", isNew = false),
//            Notification("Pasukan Berhenti Merokok", "Ayo ngumpul kita rokok lebih banyak lagi di taman...", "15 Min", isNew = false)
//        )
//        NotificationList(notifications = notifications, contentPadding = contentPadding)
//    }
//}
