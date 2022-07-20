package com.haa.todoer.repository;

import com.haa.todoer.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, Long> {}
