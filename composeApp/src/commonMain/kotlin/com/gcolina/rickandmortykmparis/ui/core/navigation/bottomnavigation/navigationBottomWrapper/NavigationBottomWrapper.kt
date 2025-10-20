package com.gcolina.rickandmortykmparis.ui.core.navigation.bottomnavigation.navigationBottomWrapper

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gcolina.rickandmortykmparis.ui.core.navigation.Routes

@Composable
fun NavigationBottomWrapper (navController: NavHostController){

    NavHost(navController = navController, Routes.Episodes.routes){

        composable(route = Routes.Episodes.routes){


        }
        composable(route = Routes.Characters.routes){


        }

    }
}