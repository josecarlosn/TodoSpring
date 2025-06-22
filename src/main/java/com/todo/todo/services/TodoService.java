package com.todo.todo.services;

import com.todo.todo.models.TodoModel;
import com.todo.todo.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    public List<TodoModel> list(){;
        Sort sort = Sort.by(Sort.Direction.ASC, "completed")
                .and(Sort.by(Sort.Direction.DESC, "creationDate"));
        return todoRepository.findAll(sort);
    };
    public List<TodoModel> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }


    public List<TodoModel> update(Long id, TodoModel taskToUpdate){
        TodoModel updatedTask = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        updatedTask.setTitle(taskToUpdate.getTitle());
        updatedTask.setDescription(taskToUpdate.getDescription());
        updatedTask.setCompleted(taskToUpdate.getCompleted());

        todoRepository.save(updatedTask);

        return list();
    }

}
