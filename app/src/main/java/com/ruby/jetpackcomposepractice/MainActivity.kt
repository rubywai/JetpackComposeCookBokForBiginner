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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ruby.jetpackcomposepractice.composables.BoxLayout
import com.ruby.jetpackcomposepractice.composables.ButtonsEg
import com.ruby.jetpackcomposepractice.composables.CardEg
import com.ruby.jetpackcomposepractice.composables.CounterPage
import com.ruby.jetpackcomposepractice.composables.FloatingButtonEg
import com.ruby.jetpackcomposepractice.composables.ImageEg
import com.ruby.jetpackcomposepractice.composables.LazyColumnEg
import com.ruby.jetpackcomposepractice.composables.LazyRowEg
import com.ruby.jetpackcomposepractice.composables.RowAndColumn
import com.ruby.jetpackcomposepractice.composables.StackLayout
import com.ruby.jetpackcomposepractice.ui.theme.JetpackComposePracticeTheme
import com.ruby.jetpackcomposepractice.viewmodels.ThemeViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()

        }
    }

    @Composable
    fun MyApp() {
        val themeViewModel: ThemeViewModel = viewModel()
        val isDarkTheme = themeViewModel.themeState.collectAsState()
        val scope = rememberCoroutineScope()
        val hostState = remember { SnackbarHostState() }
        val navController = rememberNavController()
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        JetpackComposePracticeTheme(darkTheme = isDarkTheme.value) {
            Scaffold(
                snackbarHost = {
                    SnackbarHost(hostState = hostState)
                },
                topBar = {
                    CenterAlignedTopAppBar(
                        navigationIcon = {
                            if (navBackStackEntry?.destination?.route != "home") {
                                IconButton(onClick = { navController.popBackStack() }) {
                                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                                }
                            }
                        },
                        title = {
                            Text("Jetpack Compose Cookbook")
                        },
                        actions = {
                            Switch(checked = isDarkTheme.value, onCheckedChange = {
                                themeViewModel.changeTheme()
                            })
                        }

                    )
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = {
                        scope.launch {
                            hostState.showSnackbar("Snack Bar")
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
                        composable("fab_btn") {
                            FloatingButtonEg()
                        }
                        composable("counter") {
                            CounterPage()
                        }
                        composable("rowNColumn") {
                            RowAndColumn()
                        }
                        composable("stack") {
                            StackLayout()
                        }
                        composable("box") {
                            BoxLayout()
                        }
                        composable("image") {
                            ImageEg()
                        }
                        composable("card") {
                            CardEg()
                        }
                        composable("lazycolumn") {
                            LazyColumnEg()
                        }
                        composable("lazyrow") {
                            LazyRowEg()
                        }
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
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("fab_btn")
                }) {
                Text("Floating Action Buttons")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("counter")
                }) {
                Text("Counter Application")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("rowNColumn")
                }) {
                Text("Row and Column")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("stack")
                }) {
                Text("Stack Layout")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("box")
                }) {
                Text("Box Layout")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("image")

                }) {
                Text("Image Composable")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("card")
                }) {
                Text("Card Composable")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("lazycolumn")
                }) {
                Text("Lazy Column Composable")
            }
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate("lazyrow")
                }) {
                Text("Lazy Row Composable")
            }
        }
    }
}

