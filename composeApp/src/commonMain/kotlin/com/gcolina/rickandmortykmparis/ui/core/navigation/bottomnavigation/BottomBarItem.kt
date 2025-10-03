package com.gcolina.rickandmortykmparis.ui.core.navigation.bottomnavigation

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

import com.gcolina.rickandmortykmparis.ui.core.navigation.Routes

sealed class BottomBarItem {
    abstract val route: String
    abstract val title: String
    abstract val icon: @Composable () -> Unit

    data class Episodes(
        override val route: String = Routes.Episodes.routes,
        override val title: String = "Episodes",
        override val icon: @Composable () -> Unit = {

        }
    ) : BottomBarItem()
}
