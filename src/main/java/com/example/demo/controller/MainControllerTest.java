package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ch.qos.logback.core.model.Model;


@Controller //ClassにControllerのアノテーション
public class MainControllerTest {
    
    //RequestMappingのアノテーション
    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String test(Model model) {
        return "welcome"; //"test"は表示したいHTMLの名前（拡張子不要）
    }

}
