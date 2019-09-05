package com.pointgenesis.jpa.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String number;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="passport") /*Session-73: mappedBy is added on the foreign key side of the relationship to enable bi-directional 1-1 mappings.*/
	private Student student; 
	
	protected Passport() {
		
	}

	public Passport(String number) {
		super();
		this.number = number;
	}	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Passport [id=%s, number=%s]", id, number);
	}	
}
