package org.example.notes.presentstion.queries.controllers;

import org.example.notes.core.application.interfaces.NoteEditor;
import org.example.notes.core.domain.Note;

public class NotesController extends Controller{

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    public void routeAddNote(Note note){
        this.noteEditor.add(note);
    }

    public void routeRemoveNote(Note note){
        this.noteEditor.remove(note);
    }

    public void getAll(){
        this.noteEditor.printAll();
    }
}
