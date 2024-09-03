package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;

@Controller
public class SignUpController {
    
        @RequestMapping(value = "/sign-up", method = RequestMethod.GET) 
    public String test(Model model) {
        return "sign-up"; 
    }

}

