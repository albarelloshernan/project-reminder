package com.haa.todoer.controller;

import com.haa.todoer.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("username")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping(value = "/list-todos")
    public String showToDos(ModelMap model) {
        String username = (String) model.get("username");
        model.put("filteredToDosList", toDoService.retrieveToDos(username));
        return "list-todos";
    }
}
