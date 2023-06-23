package com.geekster.userManagementSystem.controller;


import com.geekster.userManagementSystem.model.User;
import com.geekster.userManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    //get all users
    @GetMapping("users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("user")
    String addUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }


    @GetMapping("users/{userId}")
    public User getUserById(@PathVariable Integer userId)
    {
        return userService.getUserById(userId);
    }

    //  update user info
    @PutMapping("users/{userId}")
    public String updateUserById(@PathVariable Integer userId)
    {
        return userService.updateUserById(userId);
    }

    @DeleteMapping("users/{userId}")
    public String deleteUserById(@PathVariable Integer userId)
    {
        return userService.deleteUserById(userId);
    }

}

