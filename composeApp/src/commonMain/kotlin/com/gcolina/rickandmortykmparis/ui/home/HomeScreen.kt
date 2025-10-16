package com.gcolina.rickandmortykmparis.ui.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.gcolina.rickandmortykmparis.ui.core.navigation.bottomnavigation.BottomBarItem

@Composable
fun HomeScreen() {

    val items = listOf(BottomBarItem.Episodes(), BottomBarItem.Characters())

    Scaffold(bottomBar = {BottomNavigation()}) {  }

}

@Composable
fun BottomNavigation() {

    NavigationBar {

    }

}