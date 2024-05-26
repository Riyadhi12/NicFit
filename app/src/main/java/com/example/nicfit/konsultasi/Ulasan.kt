package com.example.nicfit_22_bios.views.tabview

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nicfit.components.ReviewListItem


@Composable
fun Ulasan(
    modifier: Modifier
){
    Column {
        ReviewListItem(modifier = modifier, rating = 5)
        ReviewListItem(modifier = modifier, rating = 5)
        ReviewListItem(modifier = modifier, rating = 5)
    }
}

@Preview
@Composable
fun UlasanPreview(){
    Ulasan(modifier = Modifier)
}