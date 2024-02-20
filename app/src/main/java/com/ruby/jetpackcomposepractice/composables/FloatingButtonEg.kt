package com.ruby.jetpackcomposepractice.composables

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun FloatingButtonEg() {
    val context = LocalContext.current;
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround

    ) {
        LargeFloatingActionButton(onClick = {
            Toast.makeText(context, "Large floating button", Toast.LENGTH_SHORT).show()
        }) {
            Icon(Icons.Filled.Add,contentDescription = "fab")
        }
        FloatingActionButton(onClick = {
            Toast.makeText(context, "Normal floating button", Toast.LENGTH_SHORT).show()
        }) {
            Icon(Icons.Filled.Add,contentDescription = "fab")
        }
        SmallFloatingActionButton(onClick = {
            Toast.makeText(context, "Small floating button", Toast.LENGTH_SHORT).show()
        }) {
            Icon(Icons.Filled.Add,contentDescription = "fab")
        }
    }
}