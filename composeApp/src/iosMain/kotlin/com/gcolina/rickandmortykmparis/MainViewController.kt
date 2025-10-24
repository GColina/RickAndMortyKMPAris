package com.gcolina.rickandmortykmparis

import androidx.compose.ui.window.ComposeUIViewController
import com.gcolina.rickandmortykmparis.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }