package com.example.martapi.shop.controllers;

import com.example.martapi.shop.models.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    @GetMapping("/todos")
    public String getTodos(){
        return new String("Hi there");
    }

    @GetMapping("all/todos")
    public List<Todo> getAllTodos(){
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo(1, "I have to brush my teeth"));
        todoList.add(new Todo(1, "I have to brush my teeth"));
        return todoList;
    }
}
