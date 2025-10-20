package com.gcolina.rickandmortykmparis.ui.home

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.gcolina.rickandmortykmparis.ui.core.navigation.bottomnavigation.BottomBarItem

@Composable
fun HomeScreen() {

    val items = listOf(BottomBarItem.Episodes(), BottomBarItem.Characters())
    val navController = rememberNavController()

    Scaffold(bottomBar = { BottomNavigation(items, navController) }) {

    }

}

@Composable
fun BottomNavigation(items: List<BottomBarItem>, navController: NavHostController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        items.forEach { itemNavigation ->
            NavigationBarItem(
                icon = itemNavigation.icon,
                selected = currentDestination?.hierarchy?.any { it.route == itemNavigation.route } == true,
                onClick = {

                }
            )
        }
    }

}