package com.pointgenesis.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pointgenesis.jpa.hibernate.demo.DemoApplication;
import com.pointgenesis.jpa.hibernate.demo.entity.Course;
import com.pointgenesis.jpa.hibernate.demo.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class JPQLTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void findById_basic() {
		Query query = em.createNamedQuery("query_get_all_courses");
		List<?> resultList = query.getResultList();
		logger.info("findById_basic() \nselect c from Course c --> {}", resultList);
	}
	
	@Test
	public void findById_typed() {
		TypedQuery<Course> query = em.createNamedQuery("query_get_all_courses", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("findById_typed() \nselect c from Course c --> {}", resultList);
	}
	
	@Test
	public void jpql_where() {
		String sql = "select c from Course c where name like 'Paint%'";
		TypedQuery<Course> query = em.createQuery(sql, Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("jpql_where() \n{} --> {}", sql, resultList);
	}

	@Test
	public void jpql_where_using_named_query() {
		String sql = "select c from Course c where name like 'Paint%'";
		TypedQuery<Course> query = em.createNamedQuery("query_get_paint_courses", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("jpql_where_using_named_query() \n{} --> {}", sql, resultList);
	}

	@Test
	public void jpql_courses_without_students() {
		TypedQuery<Course> query = em.createQuery("Select c from Course c where c.students is empty", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("jpql_courses_without_students() Results -> {}", resultList);
	}
	
	@Test
	public void jpql_courses_with_atleast_2_students() {
		TypedQuery<Course> query = em.createQuery("Select c from Course c where size(c.students) >= 2", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("jpql_courses_with_atleast_2_students() Results -> {}", resultList);
	}
	
	@Test
	public void jpql_courses_asc_ordered_by_students() {
		TypedQuery<Course> query = em.createQuery("Select c from Course c order by size(c.students)", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("jpql_courses_asc_ordered_by_students() Results -> {}", resultList);
	}
	
	@Test
	public void jpql_courses_desc_ordered_by_students() {
		TypedQuery<Course> query = em.createQuery("Select c from Course c order by size(c.students) desc", Course.class);
		List<Course> resultList = query.getResultList();
		logger.info("jpql_courses_desc_ordered_by_students() Results -> {}", resultList);
	}
	
	@Test
	@Transactional
	public void jpql_students_with_passports_matching_pattern() {
		TypedQuery<Student> query = em.createQuery("Select s from Student s where s.passport.number like '%1234%'", Student.class);
		List<Student> resultList = query.getResultList();
		logger.info("jpql_students_with_passports_matching_pattern() Results -> {}", resultList);
	}
	
	/*
	 * Research Topics:
	 * 
	 * LIKE
	 * BETWEEN 1 and 10
	 * IS NULL
	 * upper
	 * lower
	 * trim
	 * length
	 * etc.
	 * 
	 * */
	
	@Test
	@Transactional
	public void join() {
		Query query = em.createQuery("Select c, s from Course c JOIN c.students s");
		@SuppressWarnings("unchecked") /*https://stackoverflow.com/questions/38049896/type-safety-unchecked-cast-from-list-to-liststring*/
		List<Object[]> resultList = query.getResultList();
		
		logger.info("Results size: {}", resultList.size());
		
		for(Object[] result:resultList) {
			logger.info("join() -> Course: {} Student: {}", result[0], result[1]);
		}
	}
	
	@Test
	@Transactional
	public void left_join() {
		Query query = em.createQuery("Select c, s from Course c LEFT JOIN c.students s");
		@SuppressWarnings("unchecked") /*https://stackoverflow.com/questions/38049896/type-safety-unchecked-cast-from-list-to-liststring*/
		List<Object[]> resultList = query.getResultList();
		
		logger.info("Results size: {}", resultList.size());
		
		for(Object[] result:resultList) {
			logger.info("left_join() -> Course: {} Student: {}", result[0], result[1]);
		}
	}
	
	@Test
	@Transactional
	public void cross_join() {
		Query query = em.createQuery("Select c, s from Course c, Student s");
		@SuppressWarnings("unchecked") /*https://stackoverflow.com/questions/38049896/type-safety-unchecked-cast-from-list-to-liststring*/
		List<Object[]> resultList = query.getResultList();
		
		logger.info("Results size: {}", resultList.size());
		
		for(Object[] result:resultList) {
			logger.info("cross_join() -> Course: {} Student: {}", result[0], result[1]);
		}
	}

}
