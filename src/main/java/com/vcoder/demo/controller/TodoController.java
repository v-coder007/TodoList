package com.vcoder.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcoder.demo.model.Todo;
import com.vcoder.demo.service.TodoService;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todos")
	public List<Todo> getAllTodos(){
		return this.todoService.getAllTodos();		
	}
	
	@GetMapping("todo/{id}")
	public Todo getTodoById(@PathVariable("id") String id) {
		return this.todoService.getTodoById(id);
	}
	
	@PostMapping("todo")
	public Todo createTodo(@RequestBody Todo todo) {
		return this.todoService.createTodo(todo);
	}
	
	@DeleteMapping("todo/{id}")
	public Todo deleteTodoById(@PathVariable("id") String id) {
		return this.todoService.deleteTodoById(id);
	}
	
}
