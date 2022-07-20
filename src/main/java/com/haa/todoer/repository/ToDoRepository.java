package com.haa.todoer.repository;

import com.haa.todoer.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDoEntity, Long> {}
