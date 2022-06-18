package com.learning.decimal.springBoot.LearnSpringBoot.courses.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.Course;
import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.Course1;

public interface CourseRepository extends JpaRepository<Course1, Long> {
	public List<Course1> findByAuthor(String Author);
	
	public List<Course1> findByName(String Name);

}
