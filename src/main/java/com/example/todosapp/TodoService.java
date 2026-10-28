package com.example.todosapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();

    public List<Todo> findByUsername(String s) {
        return todoList.stream().filter(todo -> todo.getUserName().equalsIgnoreCase(s)).toList();
    }
}
