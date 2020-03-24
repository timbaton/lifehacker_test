package com.github.timbaton.testlifehacker.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

inline fun ImageView.loadImage(url: String?) {
    Glide.with(this)
        .load(url)
        .into(this)
}