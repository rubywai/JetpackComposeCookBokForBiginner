package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(300.dp, 100.dp)
                .background(
                    Color.Blue,
                    shape = RoundedCornerShape(8.dp),
                )
                .border(1.dp,Color.Red, RoundedCornerShape(8.dp))
            )


        {

        }
    }
}