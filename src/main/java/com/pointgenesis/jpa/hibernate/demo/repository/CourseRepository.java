package com.pointgenesis.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pointgenesis.jpa.hibernate.demo.entity.Course;
import com.pointgenesis.jpa.hibernate.demo.entity.Review;

@Repository
@Transactional
public class CourseRepository {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	public Course save(Course course) {
		if (course.getId() == null) {
			em.persist(course); /*INSERT*/
		} else {
			em.merge(course); /*UPDATE*/
		}
		return course;
	}
	
	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course); /*DELETE*/
	}
	
	public void playWithEntityManager() {
		Course course1 = new Course("How to shoot a bear");
		em.persist(course1); /*INSERT*/
		
		Course course2 = findById(10001L);
		course2.setName("How to shoot a bear with a Bear"); /*AUTOMATIC UPDATE*/
	}
	
	public void addReviewsForCourse(Long courseId, List<Review> reviews) {
		Course course = findById(courseId);
		logger.info("course.getReviews --> {}", course.getReviews());
		
		for (Review review : reviews ) {
			course.addReview(review); /* reviews <-- is a mapped field. */
			review.setCourse(course); /* course <-- is held as a foreign key. */			
			em.persist(review); /* Only the REVIEW table actually holds a foreign key, so only review needs to be persisted. */
		}		
	}
}
