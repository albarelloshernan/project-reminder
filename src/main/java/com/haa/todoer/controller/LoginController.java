package com.haa.todoer.controller;

import com.haa.todoer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@SessionAttributes("username")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(value = "/login")
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @PostMapping(value = "/login")
    public String showHomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
        boolean isValidUser = loginService.validateUser(username, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid credentials");
            return "login";
        }

        model.put("username", username);
        model.put("password", password);

        return "home";
    }
}
