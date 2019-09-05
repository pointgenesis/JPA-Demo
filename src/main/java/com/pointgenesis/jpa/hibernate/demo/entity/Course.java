package com.pointgenesis.jpa.hibernate.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

@NamedQueries(value = {
		@NamedQuery(name="query_get_all_courses", query="select c from Course c"),
		@NamedQuery(name="query_get_paint_courses", query="select c from Course c where name like 'Paint%'")
	}
)
/*
 * How to define a single named query
 * Note: The NamedQuery cannot be duplicated as it will result in an error.
 */
//@NamedQuery(name="query_get_all_courses", query="select c from Course c")

/*How */
public class Course {
	@Override
	public String toString() {
		return String.format("Course [id=%s, name=%s]", id, name);
	}

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy="course") /*One Course has Many Reviews*/
	private List<Review> reviews = new ArrayList<Review>();

	@ManyToMany(mappedBy="courses")
	private List<Student> students = new ArrayList<>();
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedDate;
	
	@CreationTimestamp
	private LocalDateTime createdOnDate;
	
	public Course(String name) {
		this.name = name;
	}
	
	protected Course() {
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public void removeReview(Review review) {
		this.reviews.remove(review);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}		
}
