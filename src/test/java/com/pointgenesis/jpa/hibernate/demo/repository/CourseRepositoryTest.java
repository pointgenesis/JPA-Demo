package com.pointgenesis.jpa.hibernate.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.pointgenesis.jpa.hibernate.demo.DemoApplication;
import com.pointgenesis.jpa.hibernate.demo.entity.Course;
import com.pointgenesis.jpa.hibernate.demo.entity.Review;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository; 
	
	@Autowired
	EntityManager em;
	
	@Test
	public void findById_basic() {
		logger.info("Testing is running.");
		Course course = repository.findById(10001L);
		assertEquals("How to shoot a bear with a Bear", course.getName());
	}
	
	@Test
	@DirtiesContext /*Instructs Spring to return the data back to the pre-test condition.*/
	public void deleteById_basic() {
		logger.info("Testing deleteById_basic.");
		Course course = repository.findById(10002L);
		repository.deleteById(course.getId());
		assertNull(repository.findById(10002L));
	}
	
	@Test
	@DirtiesContext
	public void save_basic() {
		logger.info("Testing save_basic.");
		Course coarse = repository.save(new Course("Big Pimpin\' aka da Lady Killa"));
		assertNotNull(coarse);
		
		Course insertedCourse = repository.findById(2L);
		assertNotNull(insertedCourse);
		
		insertedCourse.setName("Big Pimpin\' by Hooper Lee aka Tha\' Lady Killa");
		repository.save(insertedCourse);
		
		Course updatedCourse = repository.findById(2L);
		assertEquals("Big Pimpin\' by Hooper Lee aka Tha\' Lady Killa", updatedCourse.getName());
	}
	
	@Test
	@DirtiesContext
	public void playWithEntityManager() {
		repository.playWithEntityManager();
	}
	
	@Test
	@Transactional 
	/* Transactional is required to get the reviews (course.getReviews) the context does not extend by default. 
	 * However, you can modify the @OneToMany annotation to include , fetch=FetchType.EAGER in Course
	 * On the ONE side default is LAZY, so you have to add @Transactional or Modify @OneToMany(mappedBy="attributeName", fetch=FetchType.EAGER)
	 * On the MANY side default is EAGER, so you have to Modify @ManyToOne(fetch=FetchType.LAZY)*/
	public void retrieveReviewsForCourse() {
		Course course = repository.findById(10001L);
		logger.info("{}", course.getReviews());
	}
	
	@Test
	@Transactional 
	/* Transactional is required to get the reviews (course.getReviews) the context does not extend by default. 
	 * However, you can modify the @OneToMany annotation to include , fetch=FetchType.EAGER in Course
	 * On the ONE side default is LAZY, so you have to add @Transactional or Modify @OneToMany(mappedBy="attributeName", fetch=FetchType.EAGER)
	 * On the MANY side default is EAGER, so you have to Modify @ManyToOne(fetch=FetchType.LAZY)*/
	public void retrieveCourseForReview() {
		Review review = em.find(Review.class, 50001L);
		logger.info("{}", review.getCourse());
	}	
	
	@Test
	@Transactional
	public void retrieveCourseAndStudents() {
		Course course = em.find(Course.class,  10001L);
		logger.info("Course -> {}", course);
		logger.info("Students -> {}", course.getStudents());
	}
	
	@Test
	public void test() {
		boolean hasPassed = true;
		if (!hasPassed) { 
			fail("Not yet implemented");
		}
	}

}
