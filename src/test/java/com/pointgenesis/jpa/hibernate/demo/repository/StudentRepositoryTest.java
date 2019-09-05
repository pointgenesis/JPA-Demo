package com.pointgenesis.jpa.hibernate.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pointgenesis.jpa.hibernate.demo.DemoApplication;
import com.pointgenesis.jpa.hibernate.demo.entity.Passport;
import com.pointgenesis.jpa.hibernate.demo.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	EntityManager em;
	
	@Test
	@Transactional
	public void retrieveStudentAndPassportDetails() {
		logger.info("retrieveStudentAndPassportDetails is running.");
		Student student = em.find(Student.class, 20001L);
		assertEquals("Don", student.getName());
		logger.info("Student: {}", student);
		logger.info("Passport: {}", student.getPassport());
	}
	
	@Test
	@Transactional
	public void retrievePassportAndStudentDetails() {
		logger.info("retrievePassportAndStudentDetails is running.");
		Passport passport = em.find(Passport.class, 40001L);
		Student student = passport.getStudent();
		assertEquals("Don", student.getName());
		logger.info("Student: {}", student);
		logger.info("Passport: {}", student.getPassport());
	}
	
	@Test
	@Transactional
	public void retrieveStudentAndCourses() {
		Student student = em.find(Student.class,  20001L);
		logger.info("Student -> {}", student);
		logger.info("Courses -> {}", student.getCourses());
	}
	
	@Test
	public void test() {
		boolean hasPassed = true;
		if (!hasPassed) { 
			fail("Not yet implemented");
		}
	}

}
