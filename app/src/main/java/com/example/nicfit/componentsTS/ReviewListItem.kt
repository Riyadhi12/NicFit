package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nicfit.R
import com.example.nicfit.componentsTS.poppinFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReviewListItem(
    modifier: Modifier,
    rating: Int,
    reviewerName:String,
    comment:String
) {
    val words = reviewerName.split(" ")
    val firstLetters = words.map { it[0] }
    val initials = firstLetters.joinToString("")
    Card(modifier = modifier.padding(12.dp),
        backgroundColor = Color.White,
        elevation = 8.dp) {
        Column (
            modifier = modifier.padding(8.dp)
        ){
            Row {
                AvatarText(modifier = modifier, avatarText = initials)
                Column {
                    Text(reviewerName, fontWeight = FontWeight.Bold, fontFamily = poppinFamily, fontSize = 16.sp)
                    Row(modifier = modifier) {
                        for (i in 1..5) {
                            val drawableRes = if (i <= rating) R.drawable.ic_star else R.drawable.inactive
                            Image(
                                painter = painterResource(id = drawableRes),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
            }
            Text(text = comment)
        }
    }
}

@Preview
@Composable
fun ReviewListItemPreview() {
    ReviewListItem(modifier = Modifier, rating = 4, "Peter Parker", "Dokter yang hebat dan ramah. Sangat merasas cocok untuk berkonsultasi.")
}

