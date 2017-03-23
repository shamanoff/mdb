package com.mdb.controller;

import com.mdb.model.User;
import com.mdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

}
