package com.example.notes.di

import com.example.notes.viewmodel.NoteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        NoteViewModel(get())
    }
}