package com.learning.decimal.springBoot.LearnSpringBoot.courses.controller;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.Course1;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.User;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.repository.CourseRepository;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.repository.UserRepository;

@CrossOrigin("*")
@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository repository;
	
	// http://localhost:8080/courses
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/courses")
	public List<Course1> getAllCourses() {
	
		return repository.findAll();
		
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	//// http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Course1 getCourseDetails(@PathVariable long id) {
		
		Optional<Course1> course = repository.findById(id);
		
		if(!course.isPresent()) {
			throw new RuntimeException("Course not found with id " + id);
		}
	
		return course.get();
	}
	
	/*
	POST http://localhost:8080/courses
	{
		  "name": "Learn DevOps",
		  "author": "in28minutes"
	}*/

	//POST - Create a new resource (/courses)
	//@PostMapping(value="/courses", consumes = {MediaType.APPLICATION_JSON_VALUE})
	@PostMapping("/courses")
	public ResponseEntity<Course1> createCourse(@RequestBody Course1 course1){
		System.out.println(course1);
		//repository.save(course1);	
		return new ResponseEntity<Course1>(repository.save(course1),HttpStatus.CREATED);
		
	}
	
	/*
	PUT - http://localhost:8080/courses/100001
	{
		 "id": 100001,
		 "name": "Learn Microservices 2",
		 "author": "in28minutes"
		}
	*/
	
	//PUT - Update/Replace a resource (/courses/1)
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course1 course1){
		repository.save(course1);		
	}

	
	//DELETE - Delete a resource (/courses/1)
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id){
		repository.deleteById(id);
	}
	
	@GetMapping("/authors/{author}")
	public List<Course1> getByAuthor(@PathVariable String author){
		return repository.findByAuthor(author);
	}
	@GetMapping("/course-names/{name}")
	public List<Course1> getByName(@PathVariable String name){
		return repository.findByName(name);
	}
	
	
	 @Autowired private UserRepository userRepository;
	 

		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/users/{email}")
		public ResponseEntity checkLogin(@PathVariable String email, @RequestBody User user){
			System.out.println("check login called");
			User userResult =  userRepository.findByEmail(email);
			
			
			  if(userResult == null) { return new ResponseEntity(HttpStatus.NOT_FOUND); }
			  
			  if(!userResult.getPassword().equals(user.getPassword())) { return new
			  ResponseEntity(HttpStatus.NOT_FOUND); }
			 
			  HttpHeaders httpHeaders = new HttpHeaders();
		      httpHeaders.setContentType(new MediaType("text", "plain", StandardCharsets.UTF_8));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/createUser")
		public ResponseEntity createUser(@RequestBody User user){
								
			return new ResponseEntity<User>(userRepository.save(user),HttpStatus.CREATED);
		}


}
