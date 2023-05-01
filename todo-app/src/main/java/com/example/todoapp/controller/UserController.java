package com.example.todoapp.controller;
import com.example.todoapp.repository.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController {
    private UserRepo userRepo;
    private TodoRepo todoRepo;

    public UserController(UserRepo userRepo, TodoRepo todoRepo) {
        this.userRepo = userRepo;
        this.todoRepo = todoRepo;
    }

}
