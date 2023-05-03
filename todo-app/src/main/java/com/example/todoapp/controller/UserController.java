package com.example.todoapp.controller;
import com.example.todoapp.entities.User;
import com.example.todoapp.repository.*;
import com.example.todoapp.request.addUser;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@NoArgsConstructor
@RequestMapping("/users")
public class UserController {
    private UserRepo userRepo;
    private TodoRepo todoRepo;


    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userRepo.findById(userId).orElseThrow(() -> new NoSuchElementException());
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        User user = userRepo.findById(userId).orElseThrow(() -> new NoSuchElementException());
        userRepo.delete(user);
    }

}
