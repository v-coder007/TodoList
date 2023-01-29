package com.vcoder.demo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vcoder.demo.model.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
