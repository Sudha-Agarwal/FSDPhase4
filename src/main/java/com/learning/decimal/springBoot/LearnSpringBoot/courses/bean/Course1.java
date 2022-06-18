package com.learning.decimal.springBoot.LearnSpringBoot.courses.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course1 {

	@Id
	@GeneratedValue
	private long id;
	
	//@Column(name="course_name")
	private String name;

	
	private String author;
	
	public Course1() {
	}

	public Course1(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course1 [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}