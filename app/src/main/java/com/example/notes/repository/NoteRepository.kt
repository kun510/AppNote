package com.example.notes.repository

import com.example.notes.model.Note
import com.example.notes.room.NoteDao

class NoteRepository(private val noteDao: NoteDao) {
    suspend fun getNote() = noteDao.getNote()
    suspend fun insertNote(note : Note) = noteDao.insertNote(note)
    suspend fun deleteNote(ids : ArrayList<Note>) {
        val list : ArrayList<Int> = ArrayList()
        ids.forEach { list.add(it.id) }
        noteDao.deleteNote(list)
    }
}