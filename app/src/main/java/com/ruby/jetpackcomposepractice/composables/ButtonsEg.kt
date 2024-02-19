package com.ruby.jetpackcomposepractice.composables

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun ButtonsEg() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            Toast.makeText(context, "Filled Button", Toast.LENGTH_SHORT).show()
        }) {
            Text("Filled Button")
        }
        FilledTonalButton(onClick = { /*TODO*/ }) {
            FilledTonalButton(onClick = { /*TODO*/ }) {
                Text("Filled Tonal Button")
            }
        }
        ElevatedButton(onClick = { /*TODO*/ }) {
            Text("Elevated Button")
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Outlined Button")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text("Text Button")
        }
    }
}