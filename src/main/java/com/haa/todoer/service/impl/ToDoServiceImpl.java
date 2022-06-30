package com.haa.todoer.service.impl;

import com.haa.todoer.model.ToDo;
import com.haa.todoer.service.ToDoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    private static List<ToDo> toDosList = new ArrayList<ToDo>();
    private static int toDoCount = 3;

    static {
        toDosList.add(new ToDo(1, "CosmeFulano", "Learn Spring MVC", new Date(), false));
        toDosList.add(new ToDo(2, "CosmeFulanito", "Learn Hibernate", new Date(), false));
        toDosList.add(new ToDo(3, "CosmeFulanito", "Learn AOP", new Date(), false));
    }

    @Override
    public List<ToDo> retrieveToDos(String user) {
        List<ToDo> filteredToDosList = new ArrayList<ToDo>();
        for (ToDo toDo : toDosList) {
            if (toDo.getUser().equals(user)) {
                filteredToDosList.add(toDo);
            }
        }
        return filteredToDosList;
    }
}
