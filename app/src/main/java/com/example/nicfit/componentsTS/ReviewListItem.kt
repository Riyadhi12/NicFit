package com.example.nicfit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nicfit.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReviewListItem(
    modifier: Modifier,
    rating: Int,
) {
    Card(modifier = modifier.padding(12.dp), elevation = CardDefaults.cardElevation(8.dp)) {
        Column (
            modifier = modifier.padding(8.dp)
        ){
            Row {
                AvatarText(modifier = modifier, avatarText = "NA")
                Column {
                    Text("Peter Parker")
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
            Text(text = "Dokter yang hebat dan ramah. Saya sangat merasa cocok berkonsultasi.")
        }
    }
}

@Preview
@Composable
fun ReviewListItemPreview() {
    ReviewListItem(modifier = Modifier, rating = 4)
}

