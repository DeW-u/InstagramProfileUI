package com.example.instagramprofileui

import android.media.Image
import androidx.compose.ui.graphics.painter.Painter

data class ImageWithText(
    val image: Painter,
    val text: String,
    val url: String? = null
)

