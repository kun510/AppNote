package com.example.notes.di

import com.example.notes.repository.NoteRepository
import org.koin.dsl.module

val repoModule = module {
    factory {
        NoteRepository(get())
    }
}