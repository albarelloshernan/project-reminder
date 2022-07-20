package com.haa.todoer.controller;

import com.haa.todoer.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
@RequestMapping("/landing")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping(value = "/login")
    public String showLoginPage(ModelMap model) {
        LOGGER.info(":: LoginController$showLoginPage - GET login. ::");
        return "login";
    }

    @PostMapping(value = "/login")
    public String showHomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
        boolean isValidUser = loginService.validateUser(username, password);

        if (!isValidUser) {
            LOGGER.info(":: LoginController$showHomePage - Invalid credentials. ::");
            model.put("errorMessage", "Invalid credentials");
            return "login";
        }

        model.put("username", username);
        model.put("password", password);

        return "home";
    }
}
