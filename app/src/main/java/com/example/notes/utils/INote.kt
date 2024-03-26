package com.example.notes.utils

import com.example.notes.databinding.ItemBinding
import com.example.notes.model.Note

interface INote {
    fun onClick(note : Note, position : Int, view : ItemBinding)
    fun onLongClick(note : Note, position : Int, view : ItemBinding)
}