package com.gcolina.rickandmortykmparis

import android.app.Application
import com.gcolina.rickandmortykmparis.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class RickMortyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@RickMortyApplication)
        }
    }
}