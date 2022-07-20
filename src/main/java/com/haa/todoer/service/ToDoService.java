package com.haa.todoer.service;

import com.haa.todoer.model.ToDo;

import java.util.List;

public interface ToDoService {
    /** Retrieves a list containing the user's ToDos notes.
     * @param user
     * @return List
     * */
    public List<ToDo> retrieveToDos(String user);

    public ToDo saveNote(ToDo note);
}
