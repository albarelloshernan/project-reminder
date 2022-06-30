package com.haa.todoer.service.impl;

import com.haa.todoer.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean validateUser(String userId, String password) {
        return userId.equalsIgnoreCase("CosmeFulanito") && password.equalsIgnoreCase("Entraro01");
    }
}
