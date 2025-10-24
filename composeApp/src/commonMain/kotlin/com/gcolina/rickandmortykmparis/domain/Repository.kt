package com.gcolina.rickandmortykmparis.domain

import com.gcolina.rickandmortykmparis.domain.model.CharacterModel

interface Repository {
    suspend fun getRandomCharacter(id: String): CharacterModel
}