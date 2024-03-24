package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.ruby.jetpackcomposepractice.R

@Composable
fun LazyRowEg() {
    LazyRow(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
    ){
        items(100){
            item ->
            if(item % 2 ==0)
                Card {
                    Text(item.toString())
                }
            else
                Image(
                    painter = painterResource(R.drawable.cat),
                    contentDescription = "catImage",
                )
        }
    }
}