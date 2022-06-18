package com.learning.decimal.springBoot.LearnSpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.decimal.springBoot.LearnSpringBoot.courses.bean.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
