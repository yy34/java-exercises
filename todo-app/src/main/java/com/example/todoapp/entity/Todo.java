package com.example.todoapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    private Long id;
    private String todoText;
    private boolean isCompleted;
}
