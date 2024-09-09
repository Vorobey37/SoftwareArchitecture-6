package org.example;

import org.example.database.NotesDataBase;
import org.example.notes.core.application.ConcreteNoteEditor;
import org.example.notes.core.application.interfaces.NoteEditor;
import org.example.notes.core.application.interfaces.NotePresenter;
import org.example.notes.infrastructure.persistance.DBContext;
import org.example.notes.infrastructure.persistance.NotesDBContext;
import org.example.notes.presentstion.queries.controllers.NotesController;
import org.example.notes.presentstion.queries.views.NotesConsolePresenter;

public class Main {
    public static void main(String[] args) {
        NotesController notesController = new NotesController(
                new ConcreteNoteEditor(
                        new NotesDBContext(new NotesDataBase()), new NotesConsolePresenter()));
        notesController.getAll();
    }
}