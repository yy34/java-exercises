package com.example.todoapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Todo {
    @Id
    private Long id;
    private String todoText;
    private boolean isCompleted;
}
