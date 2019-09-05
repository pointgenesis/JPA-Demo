package com.pointgenesis.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	
	private String description;
	
	private String rating;

	@ManyToOne /*Many Reviews are associate with One Course*/
	private Course course;
	
	protected Review() {
		
	}

	public Review(String description, String rating) {
		super();
		this.description = description;
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return String.format("Review [id=%s, description=%s rating=%s]", id, description, rating);
	}

}
