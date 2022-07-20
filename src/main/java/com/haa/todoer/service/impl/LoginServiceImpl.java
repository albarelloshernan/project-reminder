package com.haa.todoer.service.impl;

import com.haa.todoer.repository.ToDoRepository;
import com.haa.todoer.repository.UsersRepository;
import com.haa.todoer.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    ToDoRepository toDoRepository;

    @Autowired
    UsersRepository usersRepository;

    @Value("${todoer.userName}")
    private String ToDoUserName;

    @Value("${todoer.password}")
    private String ToDoPass;

    @Override
    public boolean validateUser(String userId, String password) {
        LOGGER.info(":: LoginServiceImpl$validateUser - Credentials validation. ::");
        return userId.equalsIgnoreCase(ToDoUserName) && password.equalsIgnoreCase(ToDoPass);
    }
}
