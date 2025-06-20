package com.todo.todo.services;

import com.todo.todo.models.TodoModel;
import com.todo.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoModel> create(TodoModel todoModel) {
        todoRepository.save(todoModel);
        return list();
    };
    public List<TodoModel> list(){
        return todoRepository.findAll();
    };
    public List<TodoModel> delete(Long todoModel){
        todoRepository.deleteById(todoModel);
        return list();
    }


    public List<TodoModel> update(Long id, TodoModel todoModel){
        TodoModel updatedTask = todoRepository.findById(id).get();
        updatedTask.setTitle(todoModel.getTitle());
        updatedTask.setDescription(todoModel.getDescription());

        return list();
    }
}
