package com.ruby.jetpackcomposepractice.composables


import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnEg(
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        items(1000){
            Card(
                modifier = Modifier.padding(8.dp)
            ) {
                Toast.makeText(LocalContext.current,"position is $it",Toast.LENGTH_SHORT).show()
                Text("Item $it")
            }
        }
    }
}