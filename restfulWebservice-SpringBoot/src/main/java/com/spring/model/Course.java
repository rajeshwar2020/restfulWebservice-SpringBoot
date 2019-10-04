package com.spring.model;

import java.util.List;

public class Course {
	private String id;
	private String name;
	private String description;
	private List<String> steps;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getSteps() {
		return steps;
	}
	public void setSteps(List<String> steps) {
		this.steps = steps;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", steps=" + steps + "]";
	}
}
