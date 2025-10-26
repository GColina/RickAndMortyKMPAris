package com.gcolina.rickandmortykmparis.di

import com.gcolina.rickandmortykmparis.domain.GetRandomCharacter
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module


val domainModule = module {
factoryOf(::GetRandomCharacter)
}
