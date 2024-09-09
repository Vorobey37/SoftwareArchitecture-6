package org.example.notes.infrastructure.persistance;

import org.example.database.NotesDataBase;
import org.example.database.NotesRecord;
import org.example.notes.core.application.interfaces.NoteDataBaseContext;
import org.example.notes.core.domain.Note;
import org.example.notes.infrastructure.persistance.configuratins.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class NotesDBContext extends DBContext implements NoteDataBaseContext {
    public NotesDBContext(DataBase dataBase) {
        super(dataBase);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

    @Override
    public Collection<Note> getAll() {
        Collection<Note> noteList = new ArrayList<>();
        for (NotesRecord notesRecord :((NotesDataBase)dataBase).getNotesTable().getRecords()) {
            noteList.add(new Note(
                    notesRecord.getId(),
                    notesRecord.getUserId(),
                    notesRecord.getTitle(),
                    notesRecord.getDetails(),
                    notesRecord.getCreationDate()
            ));
        }
        return noteList;
    }
}
