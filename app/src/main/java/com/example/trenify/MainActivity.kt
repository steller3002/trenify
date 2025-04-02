package com.example.trenify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.trenify.presentation.bottom_navigation.MainScreen
import com.example.trenify.ui.theme.TrenifyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrenifyTheme {
                MainScreen()
            }
        }
    }
}