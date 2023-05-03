package com.example.todoapp.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String userName;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Todo> todoList = new ArrayList<>();

}
