package com.vcoder.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	
	@Id
	private String id;
	
	private String title;
	
	private String description;
	
	private boolean status;
	
	private String todoDate;
	
	

}
