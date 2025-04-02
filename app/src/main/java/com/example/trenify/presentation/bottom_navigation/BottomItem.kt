package com.example.trenify.presentation.bottom_navigation

import com.example.trenify.R

sealed class BottomItem (val title: String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Journal", R.drawable.icon1, "Journal" )
    object Screen2: BottomItem("Workout", R.drawable.icon2, "Workout" )
    object Screen3: BottomItem("Account", R.drawable.icon3, "Account" )
}