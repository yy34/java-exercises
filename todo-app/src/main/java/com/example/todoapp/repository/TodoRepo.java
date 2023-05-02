package com.example.todoapp.repository;

import com.example.todoapp.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo,Long> {
}