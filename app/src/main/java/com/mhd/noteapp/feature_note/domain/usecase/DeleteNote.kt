package com.mhd.noteapp.feature_note.domain.usecase

import com.mhd.noteapp.feature_note.domain.model.Note
import com.mhd.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}