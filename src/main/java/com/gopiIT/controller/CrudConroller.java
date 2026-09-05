package com.gopiIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudConroller {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to git hub Course";
    }

}
