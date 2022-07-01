package com.haa.todoer.controller;

import com.haa.todoer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping(value = "/")
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @PostMapping(value = "/")
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
