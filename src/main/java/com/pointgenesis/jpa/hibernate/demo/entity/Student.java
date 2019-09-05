package com.pointgenesis.jpa.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToOne(fetch=FetchType.LAZY) /*By default EAGER fetching occurs, which retrieves Passport when a Student is retrieved. We changed it to be LAZY loaded.*/
	private Passport passport;
	
	@ManyToMany(fetch=FetchType.EAGER) /*By default a M:N relationship is LAZY loaded... the opposite of a 1:1 relationship that is EAGER*/
	@JoinTable(
			name="STUDENT_COURSE",
			joinColumns = @JoinColumn(name="STUDENT_ID"), 
			inverseJoinColumns = @JoinColumn(name="COURSE_ID")
	)
	private List<Course> courses = new ArrayList<>();
	
	protected Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, passport=%s]", id, name, passport);
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	
	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

}
