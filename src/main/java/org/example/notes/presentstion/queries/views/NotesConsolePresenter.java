package org.example.notes.presentstion.queries.views;

import org.example.notes.core.application.interfaces.NotePresenter;
import org.example.notes.core.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotePresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }
}
