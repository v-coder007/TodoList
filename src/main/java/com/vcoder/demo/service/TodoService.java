package com.vcoder.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcoder.demo.model.Todo;
import com.vcoder.demo.repos.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repo;

	public Todo createTodo(Todo todo) {
		if (todo != null) {
			return this.repo.save(todo);
		}
		return todo;
	}

	public List<Todo> getAllTodos() {
		return this.repo.findAll();
	}

	public Todo getTodoById(String id) {
		Optional<Todo> todo = this.repo.findById(id);
		return todo.get();
	}

	public Todo deleteTodoById(String id) {
		Todo todo = this.getTodoById(id);
		this.repo.delete(todo);
		return todo;
	}
}
