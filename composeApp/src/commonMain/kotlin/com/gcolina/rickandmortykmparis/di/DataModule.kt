package com.gcolina.rickandmortykmparis.di

import com.gcolina.rickandmortykmparis.data.RepositoryImpl
import com.gcolina.rickandmortykmparis.data.remote.ApiServices
import com.gcolina.rickandmortykmparis.domain.Repository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val dataModule = module {
    single {
        HttpClient {
            install(ContentNegotiation) {
                json(json = Json { ignoreUnknownKeys = true }, contentType = ContentType.Any)
            }
            /* Si dejas la barra al final en la URL en IOS rompe,
                       A android le da igual si esta o no entonces la quitamos para que no de conflictos
                       host = "rickandmortyapi.com/"  */
            install(DefaultRequest) {
                url {
                    protocol = URLProtocol.HTTPS
                    host = "rickandmortyapi.com/"
                    /* De esta manera se hacen las llamadas a Apis con alguna KEY*/
                    // parameters.append(name = "key", value = "")
                }
            }
        }
    }
    factoryOf(::ApiServices)
    factory<Repository> { RepositoryImpl(get()) }
}