package com.gcolina.rickandmortykmparis.data.remote.response

import com.gcolina.rickandmortykmparis.domain.model.CharacterModel
import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse(
    val id: String,
    val status: String,
    val image: String
) {
    fun toDomain(): CharacterModel {
        return CharacterModel(
            id = id,
            isAlive = status.lowercase() == "alive",
            image = image
        )
    }
}