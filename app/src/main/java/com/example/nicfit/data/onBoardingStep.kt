package com.example.nicfit.data

import androidx.annotation.DrawableRes
import com.example.nicfit.R

data class onBoardingStep(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
)