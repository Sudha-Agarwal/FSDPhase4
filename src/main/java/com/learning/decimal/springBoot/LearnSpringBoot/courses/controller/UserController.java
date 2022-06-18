package com.learning.decimal.springBoot.LearnSpringBoot.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.Course1;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.User;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.repository.UserRepository;

@CrossOrigin("*")
@RestController
public class UserController {

	
	/*
	 * @Autowired private UserRepository repository;
	 * 
	 * 
	 * @CrossOrigin(origins = "http://localhost:4200")
	 * 
	 * @PostMapping("/users/{email}") public ResponseEntity checkLogin(@PathVariable
	 * String email, @RequestBody User user){
	 * System.out.println("check login called"); User userResult =
	 * repository.findByEmail(email);
	 * 
	 * 
	 * if(userResult == null) { return new ResponseEntity(HttpStatus.NOT_FOUND); }
	 * 
	 * if(!userResult.getPassword().equals(user.getPassword())) { return new
	 * ResponseEntity(HttpStatus.NOT_FOUND); }
	 * 
	 * 
	 * return new ResponseEntity(HttpStatus.OK); }
	 */

}
