package com.gcolina.rickandmortykmparis.di

import com.gcolina.rickandmortykmparis.ui.home.tabs.characters.CharactersViewModel
import com.gcolina.rickandmortykmparis.ui.home.tabs.episodes.EpisodesViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {
    viewModelOf(::EpisodesViewModel)
    viewModelOf(::CharactersViewModel)

}