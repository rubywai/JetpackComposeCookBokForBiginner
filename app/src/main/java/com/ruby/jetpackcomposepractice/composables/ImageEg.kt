package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.ruby.jetpackcomposepractice.R

@Composable
fun ImageEg() {
    Column {
        Text("Drawable image")
        Image(
            painter = painterResource(R.drawable.cat),
            contentDescription = "catImage",
        )
        Text("Network Image")
        AsyncImage("https://www.alleycat.org/wp-content/uploads/2019/03/FELV-cat.jpg",
            contentDescription = "online cat image")
    }
}