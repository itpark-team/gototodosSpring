package com.example.gototodos.repository;

import com.example.gototodos.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemsRepository extends JpaRepository<TodoItem, Integer> {

}
