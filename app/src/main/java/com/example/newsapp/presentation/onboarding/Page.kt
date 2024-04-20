package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Lorem Ipsum is simply dummy1",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry1.",
        image = R.drawable.onboarding1,
    ),
    Page(
        title = "Lorem Ipsum is simply dummy2",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry2.",
        image = R.drawable.onboarding2,
    ),
    Page(
        title = "Lorem Ipsum is simply dummy3",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry3.",
        image = R.drawable.onboarding3,
    )
)
