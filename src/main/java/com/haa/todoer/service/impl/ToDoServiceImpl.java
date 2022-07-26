package com.haa.todoer.service.impl;

import com.haa.todoer.entity.ToDoEntity;
import com.haa.todoer.model.ToDo;
import com.haa.todoer.repository.ToDoRepository;
import com.haa.todoer.service.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoServiceImpl implements ToDoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoServiceImpl.class);

    /*private static List<ToDo> toDosList = new ArrayList<ToDo>();
    private static int toDoCount = 3;

    static {
        toDosList.add(new ToDo(1, "CosmeFulano", "Learn Spring MVC", new Date(), false));
        toDosList.add(new ToDo(2, "CosmeFulanito", "Learn Hibernate", new Date(), false));
        toDosList.add(new ToDo(3, "CosmeFulanito", "Learn AOP", new Date(), false));
    }*/

    @Autowired
    ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    /** Retrieves a list of notes from a user
     * @param user
     * @return filteredToDoList
     */
    @Override
    public List<ToDo> retrieveToDos(String user) {
        List<ToDo> filteredToDosList = new ArrayList<ToDo>();

        for (int i=1;i<10;i++) {
            Long index = Long.valueOf(i);
            this.toDoRepository.findById(index);
        }

        /*for (ToDo toDo : toDosList) {
            if (toDo.getUser().equals(user)) {
                filteredToDosList.add(toDo);
            } else {
                LOGGER.error(":: ToDoServiceImpl$retrieveToDos - Notes excluded, wrong user {}. ::", toDo.getUser());
            }
        }*/
        LOGGER.info(":: ToDoServiceImpl$retrieveToDos - Notes list loaded. ::");
        return filteredToDosList;
    }

    /** Saves a note
     * @param note
     */
    @Override
    public ToDo saveNote(ToDo note) {
        ToDoEntity toDoNote = new ToDoEntity();

        toDoNote.setUser(note.getUser());
        toDoNote.setDescription(note.getDescription());
        toDoNote.setTargetDate((java.sql.Date) note.getTargetDate());
        toDoNote.setDone(note.isDone());

        this.toDoRepository.save(toDoNote);
        LOGGER.info(":: ToDoServiceImpl$saveNote - Note successfully saved. ::");

        return note;
    }
}
