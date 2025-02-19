package com.example.appbar_demo.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.appbar_demo.ui.topbars.ScreenTopBar

@Composable
fun InfoScreen(navController: NavController){
    Scaffold(
        topBar = { ScreenTopBar("Info", navController) }
    ) { innerPadding ->
        Text(text = "Info screen", modifier = Modifier.padding(innerPadding))
    }
}