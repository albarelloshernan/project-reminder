package com.haa.todoer.controller;

import com.haa.todoer.model.ToDo;
import com.haa.todoer.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
@RequestMapping("/list")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping(value = "/todonotes")
    public String showToDos(ModelMap model) {
        String username = (String) model.get("username");
        model.put("filteredToDosList", toDoService.retrieveToDos(username));
        return "list-todos";
    }

    @PostMapping(value = "/todonotes")
    public void saveToDos(@ModelAttribute("note") ToDo note) {
        toDoService.saveNote(note);
    }
}
