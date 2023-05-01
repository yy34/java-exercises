package com.example.todoapp.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String userName;
    private String password;

    @OneToMany
    private List<Todo> todoList = new ArrayList<>();

    public User(Long id, String userName, String password, List<Todo> todoList) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.todoList = todoList;
    }

    public User() {

    }
}
