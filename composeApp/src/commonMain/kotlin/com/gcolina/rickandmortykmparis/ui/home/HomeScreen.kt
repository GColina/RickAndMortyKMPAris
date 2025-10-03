package com.gcolina.rickandmortykmparis.ui.home

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {

    Scaffold(bottomBar = {BottomNavigation()}) {  }

}

@Composable
fun BottomNavigation() {

    NavigationBar {

    }

}