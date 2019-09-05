package com.pointgenesis.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pointgenesis.jpa.hibernate.demo.DemoApplication;
import com.pointgenesis.jpa.hibernate.demo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class CriteriaQueryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;

	@Test
	public void jpql_basic() {
		//Goal: "select c from Course c"
		//1. User Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//3. Define predicates etc using Criteria Builder
		//4. Add predicates etc to the Criteria Query
		
		//5. Build the TypeQuery using the entity manager and criteria query.
		TypedQuery<Course> query = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = query.getResultList();
		logger.info("TypedQuery -> {}", resultList);
	}
	
	@Test
	public void all_courses_having_100_Steps() {
		//Goal: "select c from Course c where name like '%100 Steps'" 
		//1. User Criteria Builder to create a Criteria Query returning the expected result object
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Course> cq = cb.createQuery(Course.class);
		
		//2. Define roots for tables which are involved in the query
		Root<Course> courseRoot = cq.from(Course.class);
		
		//3. Define predicates etc using Criteria Builder
		Predicate like100Steps = cb.like(courseRoot.get("name"), "%100 Steps");

		//4. Add predicates etc to the Criteria Query
		cq.where(like100Steps);
		
		//5. Build the TypeQuery using the entity manager and criteria query.
		TypedQuery<Course> query = em.createQuery(cq.select(courseRoot));
		List<Course> resultList = query.getResultList();
		logger.info("all_courses_having_100_Steps() -> {}", resultList);
	}

}
