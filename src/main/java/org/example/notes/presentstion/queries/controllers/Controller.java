package org.example.notes.presentstion.queries.controllers;

import org.example.notes.presentstion.queries.views.Presenter;

public abstract class Controller {

    public <T extends Presenter> void view(T presenter){

    }
}
