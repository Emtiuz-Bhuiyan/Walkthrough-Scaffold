package com.example.appbar_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.appbar_demo.ui.navigation.ScaffoldApp
import com.example.appbar_demo.ui.theme.Appbar_demoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Appbar_demoTheme {
                    ScaffoldApp()
                }
            }
        }
    }
