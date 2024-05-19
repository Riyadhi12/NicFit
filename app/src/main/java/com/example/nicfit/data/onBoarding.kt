package com.example.nicfit.data

import androidx.annotation.DrawableRes
import com.example.nicfit.R

sealed class onBoarding(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : onBoarding(
        image = R.drawable.riyadhi3,
        title = "Selamat datang di Nicfit",
        description = "Nicfit merupakan aplikasi yang akan membantu mengatasi masalah mu dalam berhenti merokok"
    )

    object Second : onBoarding(
        image = R.drawable.riyadhi3,
        title = "Selesaikan Misi dan Wujudkan Impian",
        description = "Nicfit merupakan aplikasi yang akan membantu mengatasi masalah mu dalam berhenti merokok"
    )

    object Third : onBoarding(
        image = R.drawable.riyadhi3,
        title = "Berkenalan Dengan Teman Sehat",
        description = "Nicfit merupakan aplikasi yang akan membantu mengatasi masalah mu dalam berhenti merokok"
    )
}