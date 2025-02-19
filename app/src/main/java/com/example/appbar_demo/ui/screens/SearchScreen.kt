package com.example.appbar_demo.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.appbar_demo.ui.bottomBar.BottomBar
import com.example.appbar_demo.ui.topbars.MainTopAppBar

@Composable
fun SearchScreen(navController: NavController, drawerState: DrawerState){
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet { Text("Menu") }
        },
        gesturesEnabled = true
    ) {
        Scaffold(
            topBar = { MainTopAppBar(navController, drawerState) },
            bottomBar = { BottomBar(navController) },
        ) { innerPadding ->
            Text(text = "Search screen", modifier = Modifier.padding(innerPadding))
        }
    }
}