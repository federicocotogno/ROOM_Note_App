package com.federicocotogno.minimalnotes.data

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao) {
    val getAllData: LiveData<List<Note>> = noteDao.getAllData()

    suspend fun addNote(note: Note) {
        noteDao.addNote(note)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }

    suspend fun updateNote(note: Note) {
        noteDao.updateNote(note)
    }

    suspend fun deleteAllNotes() {
        noteDao.deleteAll()
    }

}