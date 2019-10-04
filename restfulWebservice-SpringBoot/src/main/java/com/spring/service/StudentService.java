package com.spring.service;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.spring.model.Course;

@Component
public class StudentService {
	
	static {
		Course course1 = new Course("Course1", "Spring", "10 Steps", 
				Arrays.asList("Learn Maven", "Import Project", "First Example", "Second Example"));
		Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
				Arrays.asList("Learn Maven", "Import Project", "First Example",
						"Second Example"));
		Course course3 = new Course("Course3", "Spring Boot", "6K Students",
				Arrays.asList("Learn Maven", "Learn Spring",
						"Learn Spring MVC", "First Example", "Second Example"));
		Course course4 = new Course("Course4", "Maven","Most popular maven course on internet!", 
				Arrays.asList("Pom.xml", "Build Life Cycle", "Parent POM", "Importing into Eclipse"));
		
	}
}
