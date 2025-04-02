package com.example.trenify.presentation.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "Journal"){
        composable("Journal"){
            Journal()
        }

        composable("Workout"){
            Workout()
        }

        composable("Account"){
            Account()
        }
    }
}