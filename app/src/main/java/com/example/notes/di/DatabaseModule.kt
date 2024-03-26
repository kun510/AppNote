package com.example.notes.di

import android.app.Application
import androidx.room.Room
import com.example.notes.room.Database
import com.example.notes.room.NoteDao
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {

    fun provideDatabase(application: Application): Database {
        return Room.databaseBuilder(application, Database::class.java, "note.db")
            .fallbackToDestructiveMigration()
            .build()
    }
    fun provideNoteDao(database: Database): NoteDao {
        return  database.noteDao
    }
    single {
        provideDatabase(androidApplication())
    }
    single {
        provideNoteDao(get())
    }
}