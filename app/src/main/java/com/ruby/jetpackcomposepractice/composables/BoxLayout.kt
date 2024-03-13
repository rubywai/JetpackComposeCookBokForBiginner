package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .size(300.dp, 100.dp)
                    .background(
                        Color.Blue,
                        shape = RoundedCornerShape(8.dp),
                    )
                    .border(
                        1.dp, Color.Red, RoundedCornerShape(8.dp)
                    )
                    .padding(10.dp)
            )

            {
                Text(
                    "Box composable(Container widget)",
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier.size(300.dp,100.dp)
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(
                                Color.Yellow,
                                Color.Red,
                                Color.DarkGray
                            ),
                            startX = 0f,
                            endX = 300f,
                        )
                    )

            ){

            }

        }
    }
}