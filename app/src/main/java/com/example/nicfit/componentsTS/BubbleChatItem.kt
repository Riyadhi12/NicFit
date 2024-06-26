package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily
//import com.example.nicfit.model.Message
import com.example.nicfit_22_bios.model.Message

@Composable
fun MessageItemTemanSehat(message: Message, modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = when (message.status) {
            true -> Arrangement.Start
            false -> Arrangement.End
        }
    ){
        Card(
            colors = CardDefaults.cardColors(colorResource(id = R.color.chat_bubble_color).copy(alpha = 0.2f)),
            modifier = modifier.width(256.dp).padding(end = 8.dp)
        ){
            Column(
                modifier = modifier
                    .width(190.dp)
                    .padding(8.dp)
            ) {
                Text(text = message.text, fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                Text(
                    text = "08.30 AM",
                    fontSize = 10.sp, fontFamily = poppinFamily, fontWeight = FontWeight.Normal
                )
            }
        }
        Image(painter = painterResource(id = R.drawable.icon_profile_chat), contentDescription = "")
    }
}



@Composable
fun MessageItem(message: Message, modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = when (message.status) {
            true -> Arrangement.Start
            false -> Arrangement.End
        }
    ){
        Card(
            colors = CardDefaults.cardColors(colorResource(id = R.color.chat_bubble_color).copy(alpha = 0.2f)),
            modifier = modifier.width(256.dp)
        ){
            Column(
                modifier = modifier
                    .width(190.dp)
                    .padding(8.dp)
            ) {
                Text(text = message.text, fontFamily = poppinFamily, fontWeight = FontWeight.Normal)
                Text(
                    text = "08.30 AM",
                    fontSize = 10.sp, fontFamily = poppinFamily, fontWeight = FontWeight.Normal
                )
            }
        }
    }
}


@Composable
fun MessageList(
    modifier:Modifier,
    navHostController: NavHostController,
    isKonsultasi:Boolean
) {
    val messages = remember {
        mutableStateListOf<Message>(
            Message(text = "No. Pesanan : wjnasa6wm\n" +
                    "Total Pesanan : Rp. 32.000\n" +
                    "Rekening penerima\n" +
                    "BNI a.n Pawan Kusuma\n" +
                    "188213277", author = "Reply", timestamp = System.currentTimeMillis(), status = true),
            Message(text = "Yang bener aja, Saya ingin konsultasi pak", author = "Me", timestamp = System.currentTimeMillis(), status = false),)
    }

    val messagesTemanSehat = remember {
        mutableStateListOf<Message>(
            Message(text = "Aku sudah berhenti merokok selama satu minggu", author = "Me", timestamp = System.currentTimeMillis(), status = false),
            Message(text = "Keren boy tingkatkan lagi", author = "Me", timestamp = System.currentTimeMillis(), status = false),
            Message(text = "Gacor menyala abangku", author = "Me", timestamp = System.currentTimeMillis(), status = false),)
    }
    val messageText = remember { mutableStateOf("") }
    val colorBackground = colorResource(id = R.color.blue_nicfit)
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ){
        LazyColumn {
            when(isKonsultasi){
                true -> {
                    items(messages) { message ->
                        MessageItem(message = message, modifier = modifier)
                    }
                }

                false -> {
                    items(messagesTemanSehat) { message ->
                        MessageItemTemanSehat(message = message, modifier = modifier)
                    }
                }
            }
        }
        Row (
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            OutlinedTextField(
                leadingIcon = {Image(painter = painterResource(id = R.drawable.smile), contentDescription = "", modifier = modifier.size(36.dp))},
                shape = RoundedCornerShape(40.dp),
                modifier = modifier.fillMaxWidth(0.8f),
                value = messageText.value,
                onValueChange = { messageText.value = it },
                placeholder = { Text(text = "Pesan")},
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White,
                    cursorColor = Color.Black,
                    )
            )

            Button(onClick = {
                when(isKonsultasi){
                    true -> {
                        messages.add(Message(text = messageText.value, author = "Me", timestamp = System.currentTimeMillis(), status = false))
                    }

                    false -> {
                        messagesTemanSehat.add(Message(text = messageText.value, author = "Me", timestamp = System.currentTimeMillis(), status = false))
                    }
                }
                messageText.value = ""
            },
                modifier = modifier
                    .padding(horizontal = 8.dp)
                    .clip(CircleShape)
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(colorBackground)
            ) {
            Image(painter = painterResource(id = R.drawable.send_chat), contentDescription = "", modifier = modifier
                .size(20.dp)
                .fillMaxSize())
            }
        }
    }
}

@Preview
@Composable
fun MessageListPreview() {
    MessageList(modifier = Modifier, navHostController = NavHostController(LocalContext.current), isKonsultasi = false)
}