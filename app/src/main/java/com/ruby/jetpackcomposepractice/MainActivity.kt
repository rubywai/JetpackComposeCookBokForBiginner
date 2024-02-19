package com.ruby.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ruby.jetpackcomposepractice.composables.ButtonsEg
import com.ruby.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme

class MainActivity : ComponentActivity() {


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Jetpack Compose Cookbook")
                            }
                        )
                    },

                ){
                    Box(modifier = Modifier.padding(it)) {
                        MyApp()
                    }
                }
            }
        }
    }

    @Composable
    fun MyApp() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                Home(navController = navController)
            }
            composable("buttons"){
                ButtonsEg()
            }
        }
    }

    @Composable
    fun Home(navController: NavController) {
        Column {
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("buttons")
                }) {
                Text("Buttons")
            }
        }
    }
}

