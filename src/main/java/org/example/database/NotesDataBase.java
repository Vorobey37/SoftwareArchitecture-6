package org.example.database;

import org.example.notes.infrastructure.persistance.DataBase;

public class NotesDataBase implements DataBase {

    private NotesTable notesTable;


    public NotesTable getNotesTable() {
        if (notesTable == null){
            notesTable = new NotesTable();
        }
        return notesTable;
    }
}
