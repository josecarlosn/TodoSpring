package com.todo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TodoController {
    @GetMapping("/list")
    public String listTasks() {
        return "Lista de dados";
    }
    ;
    @GetMapping("/create")
    public String createTasks() {
        return "Cria dados";
    }
    ;
    @GetMapping("/update")
    public String updateTasks() {
        return "Atualiza dados";
    }
    ;
    @GetMapping("/delete")
    public String deleteTasks() {
        return "Deleta dados";
    }
    ;
}