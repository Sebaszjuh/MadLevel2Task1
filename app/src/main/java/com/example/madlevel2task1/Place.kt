package com.example.madlevel2task1

import androidx.annotation.DrawableRes

data class Place (
    var name: String,
    @DrawableRes var imageResId: Int)

//{
//    companion object {
//        val PLACE_NAMES = arrayOf(
//        )