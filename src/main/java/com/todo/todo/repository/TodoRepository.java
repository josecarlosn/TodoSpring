package com.todo.todo.repository;

import com.todo.todo.models.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoModel,Long> {
}

