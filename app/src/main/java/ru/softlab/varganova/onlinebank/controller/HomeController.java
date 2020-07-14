package ru.softlab.varganova.onlinebank.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }
}
