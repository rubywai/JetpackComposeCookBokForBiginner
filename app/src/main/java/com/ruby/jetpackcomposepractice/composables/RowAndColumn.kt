package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RowAndColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier.background(
                color = Color.Red
            ).weight(2f)
                .fillMaxWidth()
        ) {
           Text("First Item")
        }
        Box(
            modifier = Modifier.background(
                color = Color.Green
            ).weight(1f)
                .fillMaxWidth()
        ){
            Text("Second Item")
        }
        Box(
            modifier = Modifier.background(
                color = Color.Blue
            ).weight(1f)
                .fillMaxWidth()
        ){
            Text("Third Item")
        }
    }
}