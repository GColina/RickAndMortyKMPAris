package com.gcolina.rickandmortykmparis.domain

import com.gcolina.rickandmortykmparis.domain.model.CharacterModel

class GetRandomCharacter(val repository: Repository) {
    suspend operator fun invoke(): CharacterModel{
        val randomId = (1..826).random()
       return repository.getRandomCharacter(randomId.toString())
    }
}