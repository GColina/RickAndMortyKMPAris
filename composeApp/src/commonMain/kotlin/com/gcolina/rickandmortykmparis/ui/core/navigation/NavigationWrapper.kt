package com.gcolina.rickandmortykmparis.ui.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gcolina.rickandmortykmparis.ui.home.HomeScreen

@Composable
fun NavigationWrapper(){
    val mainNavController = rememberNavController()

    NavHost(navController = mainNavController, startDestination = Routes.Home.routes){

        composable(route = Routes.Home.routes){
            HomeScreen()
        }
    }
}