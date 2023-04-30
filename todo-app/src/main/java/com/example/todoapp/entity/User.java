package com.example.todoapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    private Long id;
    private String userName;
    private String password;

    private List<Todo> todoList = new ArrayList<>();



}
