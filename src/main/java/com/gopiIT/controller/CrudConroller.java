package com.gopiIT.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudConroller {

    @PostMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to git hub Course";
    }
}
