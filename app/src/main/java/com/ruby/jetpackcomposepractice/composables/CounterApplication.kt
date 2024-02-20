package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CounterPage() {
    var count by remember { mutableIntStateOf(0) }

  Column(
      modifier = Modifier.fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally
  ) {
      Text("The counter value is $count")
      Divider()
      Row {
          IconButton(onClick = {
              count ++
          }) {
              Icon(Icons.Default.KeyboardArrowUp,"add")
          }
          IconButton(onClick = {
              count --
          }) {
              Icon(Icons.Default.KeyboardArrowDown,"minus")
          }

      }
  }
}