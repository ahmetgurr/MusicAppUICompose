package com.ahmetgur.myapplication.ui.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ahmetgur.myapplication.navigation.Screen

class MainViewModel: ViewModel() {

    private val _currentScreen: MutableState<Screen> = mutableStateOf(Screen.DrawerScreen.Account)

    // currentScreen is a mutableState that holds the current
    // currentScreen, mevcut ekranı tutan bir mutableState'dir, hangi sayfada olduğumuzu tutar
    val currentScreen: MutableState<Screen>
        get() = _currentScreen

    fun setCurrentScreen(screen: Screen){
        _currentScreen.value = screen
    }


}