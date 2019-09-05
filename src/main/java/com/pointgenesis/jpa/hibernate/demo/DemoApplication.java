package com.pointgenesis.jpa.hibernate.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pointgenesis.jpa.hibernate.demo.entity.Course;
import com.pointgenesis.jpa.hibernate.demo.entity.Review;
import com.pointgenesis.jpa.hibernate.demo.entity.Student;
import com.pointgenesis.jpa.hibernate.demo.repository.CourseRepository;
import com.pointgenesis.jpa.hibernate.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository; 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = courseRepository.findById(10001L);
		logger.info("Course(10001) --> {}", course);
		
		courseRepository.save(new Course("Paint by Numbers"));
		
		courseRepository.playWithEntityManager();
		
		studentRepository.saveStudentWithPassport();
		
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("SpringBoot/JPA is awesome", "5"));
		reviews.add(new Review("Class is really great", "4"));
		reviews.add(new Review("Bears hibernate", "2"));
		reviews.add(new Review("Hello", "3"));
		courseRepository.addReviewsForCourse(10001L, reviews);
		
		studentRepository.insertHardcodedStudentAndCourse();
		
		studentRepository.insertStudentAndCourse(new Student("jerry berry"), new Course("Sleeping for Dummies"));
	}
}
