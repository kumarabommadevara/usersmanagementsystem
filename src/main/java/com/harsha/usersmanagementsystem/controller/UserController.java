package com.harsha.usersmanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    @GetMapping(path = {"/","/home"})
    public String getMessage(){
        return "Hello from spring security";
    }
}
