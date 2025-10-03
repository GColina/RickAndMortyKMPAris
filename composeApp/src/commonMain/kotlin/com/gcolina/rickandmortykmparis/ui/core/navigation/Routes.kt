package com.gcolina.rickandmortykmparis.ui.core.navigation

sealed class Routes(val routes: String) {
    data object Home:Routes("home")


    //BottomNavigation
    data object Episodes:Routes("episodes")
    data object Characters:Routes("characters")
}