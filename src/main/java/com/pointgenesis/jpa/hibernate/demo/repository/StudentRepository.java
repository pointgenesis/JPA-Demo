package com.pointgenesis.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pointgenesis.jpa.hibernate.demo.entity.Course;
import com.pointgenesis.jpa.hibernate.demo.entity.Passport;
import com.pointgenesis.jpa.hibernate.demo.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
	EntityManager em;
	
	public Student findById(Long id) {
		return em.find(Student.class, id);
	}
	
	public Student save(Student student) {
		if (student.getId() == null) {
			em.persist(student); /*INSERT*/
		} else {
			em.merge(student); /*UPDATE*/
		}
		return student;
	}
	
	public void deleteById(Long id) {
		Student student = findById(id);
		em.remove(student); /*DELETE*/
	}
	
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z1238585");
		em.persist(passport);
		
		Student student = new Student("Derek");
		student.setPassport(passport);
		
		em.persist(student); /*INSERT*/
	}
	
	public void insertHardcodedStudentAndCourse() {
		Student student = new Student("Jack");
		Course course = new Course("Microservices in 100 Steps is Awesome!");
		
		em.persist(student);
		em.persist(course);
		
		student.addCourse(course);
		course.addStudent(student);
		em.persist(student);
	}
	
	public void insertStudentAndCourse(Student student, Course course) {
		em.persist(student);
		em.persist(course);
		
		student.addCourse(course);
		course.addStudent(student);
		em.persist(student);
	}
}