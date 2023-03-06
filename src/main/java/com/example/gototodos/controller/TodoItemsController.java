package com.example.gototodos.controller;


import com.example.gototodos.model.TodoItem;
import com.example.gototodos.service.TodoItemsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
;import java.util.List;

@RestController
@RequestMapping(path = "/todos")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class TodoItemsController {
    private final TodoItemsService todoItemsService;

    @GetMapping(value = "/getAll")
    public List<TodoItem> getAll() {
        return todoItemsService.getAll();
    }

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody TodoItem todoItem) {
        todoItemsService.addNew(todoItem);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        todoItemsService.deleteById(id);
    }
}
