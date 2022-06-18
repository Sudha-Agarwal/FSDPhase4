package com.learning.decimal.springBoot.LearnSpringBoot.courses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.Course1;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.User;


public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
	
	//public List<Course1> findByName(String Name);

}
