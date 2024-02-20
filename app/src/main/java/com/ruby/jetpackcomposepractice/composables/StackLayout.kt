package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun StackLayout() {
    Box(
        modifier = Modifier.fillMaxWidth()
            .height(200.dp)
            .background(color = Color.Red)
    ) {
        Box(
            modifier = Modifier.offset(
                0.0.dp,0.0.dp
            )
                .background(color = Color.Yellow)
        ) {
            Text("Hello")
        }
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .graphicsLayer {
                    translationY = 50f
                }
                .align(Alignment.BottomCenter)
                .background(Color.Blue)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(Color.Green)
                .offset(y=10.dp)
                .align(Alignment.Center)
        )
    }
}