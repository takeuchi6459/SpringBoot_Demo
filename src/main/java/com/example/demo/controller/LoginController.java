package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET) 
    public String test(Model model) {
        return "login"; 
    }

}
