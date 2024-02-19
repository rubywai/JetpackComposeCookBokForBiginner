package com.ruby.jetpackcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ruby.jetpackcomposepractice.composables.ButtonsEg
import com.ruby.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeTheme {
                MyApp()
            }
        }
    }

    @Composable
    fun MyApp() {
        val scope = rememberCoroutineScope()
        val snackbarHostState = remember { SnackbarHostState() }
        val navController = rememberNavController()
        Scaffold(
            snackbarHost = {
                SnackbarHost(hostState = snackbarHostState)
            },
            topBar = {
                TopAppBar(
                    title = {
                        Text("Jetpack Compose Cookbook")
                    }
                )
            },
            floatingActionButton = {
                FloatingActionButton(onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar("Snack Bar")
                    }
                }) {
                    Icon(Icons.Filled.Add, contentDescription = "add")
                }
            }

            ) {
            Box(modifier = Modifier.padding(it)) {
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        Home(navController = navController)
                    }
                    composable("buttons") {
                        ButtonsEg()
                    }
                }
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

