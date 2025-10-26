package com.gcolina.rickandmortykmparis.ui.home.tabs.characters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gcolina.rickandmortykmparis.domain.GetRandomCharacter
import com.gcolina.rickandmortykmparis.domain.model.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CharactersViewModel(val getRandomCharacter: GetRandomCharacter) : ViewModel() {
    private var _uiState = MutableStateFlow<CharacterState>(CharacterState())
    val uiState: StateFlow<CharacterState> = _uiState


    init {
        viewModelScope.launch {
            val result: CharacterModel = withContext(Dispatchers.IO) {
                getRandomCharacter()

            }
            _uiState.update {state -> state.copy(characterOfTheDay = result) }
        }
    }
}