package com.learning.decimal.springBoot.LearnSpringBoot.courses.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Course {

	@Id
	@GeneratedValue
	@Column(name="course_id")
	private long id;
	
	//@Column(name="course_name")
	private String name;

	/*@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="fk_author_id")*/
	
	//@OneToMany(cascade =  CascadeType.ALL)
	//@JoinColumn(name="fk_course_id", referencedColumnName = "course_id")
	
	@OneToMany(cascade =  CascadeType.ALL)
	@JoinColumn(name="fk_course_id",referencedColumnName = "course_id" )
	private List<Author> author;
	
	public Course() {
	}

	/*public Course(long id, String name, List<Author> author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}*/
	
	public Course(long id, String name, List<Author> author) {
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

	/*public List<Author> getAuthor() {
		return author;
	}*/
	
	public List<Author> getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}