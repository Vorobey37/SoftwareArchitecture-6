package org.example.notes.infrastructure.persistance;

public abstract class DBContext {

    protected DataBase dataBase;

    public DBContext(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
        return  true;
    }
}
