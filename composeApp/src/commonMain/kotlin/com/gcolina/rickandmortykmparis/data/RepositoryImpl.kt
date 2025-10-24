package com.gcolina.rickandmortykmparis.data

import com.gcolina.rickandmortykmparis.data.remote.ApiServices
import com.gcolina.rickandmortykmparis.data.remote.response.CharacterResponse
import com.gcolina.rickandmortykmparis.domain.Repository
import com.gcolina.rickandmortykmparis.domain.model.CharacterModel

class RepositoryImpl(val api: ApiServices): Repository {
    override suspend fun getRandomCharacter(id: String): CharacterModel {
        return api.getSingleCharacter(id).toDomain()
    }
}


