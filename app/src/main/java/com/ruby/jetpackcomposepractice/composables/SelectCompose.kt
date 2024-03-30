package com.ruby.jetpackcomposepractice.composables

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ruby.jetpackcomposepractice.MainActivity
import com.ruby.jetpackcomposepractice.viewmodels.ThemeViewModel

@Composable
fun SwitchComposable() {
    val themeViewModel: ThemeViewModel = viewModel(LocalContext.current as MainActivity)
    val isDarkTheme = themeViewModel.themeState.collectAsState()
    Switch(
        checked = isDarkTheme.value,
        onCheckedChange = {
            themeViewModel.changeTheme()
        },
    )

}