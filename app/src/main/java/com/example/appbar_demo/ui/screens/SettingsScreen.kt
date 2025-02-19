package com.example.appbar_demo.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.appbar_demo.ui.topbars.ScreenTopBar

@Composable
fun SettingsScreen(navController: NavController){
    Scaffold(
        topBar = { ScreenTopBar("Settings", navController) }
    ) { innerPadding ->
        Text(text = "Settings", modifier = Modifier.padding(innerPadding))
    }
}