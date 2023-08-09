package com.harsha.usersmanagementsystem.controller;

import com.harsha.usersmanagementsystem.domain.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController{
    @GetMapping("/")
    public String getMessage(){

        return "index";
    }
    @GetMapping("/register")
    public String register(Model model){
        UserDTO user = new UserDTO();
        model.addAttribute("user", user);
        return "register";
    }
    @PostMapping("/register/save")
    public String welcome(@ModelAttribute("user") UserDTO userDTO){

        return "index";
    }
}
