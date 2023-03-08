package com.ada.aulaspringweb.controllers;

import com.ada.aulaspringweb.model.User;
import com.ada.aulaspringweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping("/users")
    public String addUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("senha") String senha){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(senha);
        userService.save(user);

        return "redirect:users";
    }

    @GetMapping("add-user")
    public String createUser(){
        return "add-users";
    }
}
