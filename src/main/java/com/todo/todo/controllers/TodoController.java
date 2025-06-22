package com.todo.todo.controllers;

import com.todo.todo.models.TodoModel;
import com.todo.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private final TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping("create")
    List<TodoModel> create(@RequestBody TodoModel todoModel) {
        return todoService.create(todoModel);
    }
    @GetMapping("tasks")
    List<TodoModel> listTasks(){
        return todoService.list();
    }
    @DeleteMapping("delete/{id}")
    List<TodoModel> deleteTasks(@PathVariable Long id){
        todoService.delete(id);
        return todoService.list();
    }
    @PutMapping("update/{id}")
        List<TodoModel> updateTasks(
            @PathVariable Long id,
            @RequestBody TodoModel todoModel
    ){
        todoService.update(id, todoModel);
        return todoService.list();
    };

};