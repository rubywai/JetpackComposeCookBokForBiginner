package com.ruby.jetpackcomposepractice.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardEg() {
  Column(
      modifier = Modifier
          .fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally
  ) {
      Card(
          colors = CardDefaults.cardColors(
              containerColor = MaterialTheme.colorScheme.surfaceVariant,
          ),
          modifier = Modifier.size(200.dp,100.dp)

      ){
        Text("Filled Card",
            modifier = Modifier.padding(10.dp))
      }
      ElevatedCard(
          elevation = CardDefaults.cardElevation(
              defaultElevation = 6.dp
          ),
          modifier = Modifier.size(200.dp,100.dp)
      ) {
          Text("Elevated Card")
      }
      OutlinedCard(
          modifier = Modifier.size(200.dp,100.dp),
          colors = CardDefaults.cardColors(
              containerColor = MaterialTheme.colorScheme.surfaceVariant,
          )
      ) {
          Text("Outlined Card")
      }
  }
}