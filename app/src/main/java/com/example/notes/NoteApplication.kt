package com.example.notes

import android.app.Application
import com.example.notes.di.databaseModule
import com.example.notes.di.repoModule
import com.example.notes.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NoteApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(databaseModule, repoModule, viewModelModule))
        }
    }
}