package com.example.appbar_demo.ui.navigation

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appbar_demo.ui.screens.FavoriteScreen
import com.example.appbar_demo.ui.screens.InfoScreen
import com.example.appbar_demo.ui.screens.MainScreen
import com.example.appbar_demo.ui.screens.SearchScreen
import com.example.appbar_demo.ui.screens.SettingsScreen

@Composable
fun ScaffoldApp(){
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
    NavHost(
        navController = navController,
        startDestination = "home"
    ){
        composable(route = "home") { MainScreen(navController, drawerState) }
        composable(route = "info") { InfoScreen(navController) }
        composable(route = "settings") { SettingsScreen(navController) }
        composable(route = "favorite") { FavoriteScreen(navController, drawerState)  }
        composable(route = "search") { SearchScreen(navController, drawerState)  }

    }
}