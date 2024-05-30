package com.example.nicfit_22_bios.views.tabview

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nicfit.components.ReviewListItem


@Composable
fun Ulasan(
    modifier: Modifier
){
    val scrollable = rememberScrollState()
    Column(
        modifier.verticalScroll(scrollable)
    ) {
        ReviewListItem(modifier = modifier, rating = 5, "Peter Parker", "Dokter yang hebat dan ramah. Saya sangat merasa cocok berkonsultasi.")
        ReviewListItem(modifier = modifier, rating = 3, "Mister Liadi", "Dokter yang hebat dan ramah. Saya tidak meminta apa-apa lagi.")
        ReviewListItem(modifier = modifier, rating = 3, "Adit Gunslinger", "Dokter yang sangat cocok, cocok buat oek hantam lo.")
    }
}

@Preview
@Composable
fun UlasanPreview(){
    Ulasan(modifier = Modifier)
}