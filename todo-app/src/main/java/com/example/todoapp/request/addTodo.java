package com.example.todoapp.request;

public class addTodo {
    private String todo;
    public addTodo() {
    }

    public addTodo(String content) {
        this.todo = content;
    }
    public void setTodo(String content) {
        this.todo = content;
    }

    public String getTodo() {
        return todo;
    }



}
