package com.gcolina.rickandmortykmparis.ui.core.navigation

sealed class Routes(val routes: String) {
    data object Home:Routes("home")
}