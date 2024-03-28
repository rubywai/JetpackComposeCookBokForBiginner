package com.ruby.jetpackcomposepractice.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update


class ThemeViewModel() : ViewModel() {
    private var _themeState : MutableStateFlow<Boolean> = MutableStateFlow(false)
    val themeState  get()  = _themeState
    fun changeTheme(){
        _themeState.update { !_themeState.value }
    }

}