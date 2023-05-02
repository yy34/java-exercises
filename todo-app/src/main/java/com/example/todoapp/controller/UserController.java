package com.example.todoapp.controller;
import com.example.todoapp.entities.User;
import com.example.todoapp.repository.*;
import com.example.todoapp.request.addUser;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepo userRepo;
    private TodoRepo todoRepo;

    public UserController(UserRepo userRepo, TodoRepo todoRepo) {
        this.userRepo = userRepo;
        this.todoRepo = todoRepo;
    }
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userRepo.findById(userId).orElseThrow(() -> new NoSuchElementException());
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }

}
