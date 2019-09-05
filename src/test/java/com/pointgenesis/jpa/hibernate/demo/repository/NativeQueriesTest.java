package com.pointgenesis.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class NativeQueriesTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Test
	public void native_queries_basic() {
		Query query = em.createNativeQuery("select * from course;", Course.class);
		List<?> resultList = query.getResultList();
		logger.info("[native_queries_basic] select * from course --> {}", resultList);
	}
	
	@Test
	public void native_queries_findById() {
		Long id = 10001L;
		Query query = em.createNativeQuery("select * from course where id = ?;", Course.class);
		query.setParameter(1, id);
		List<?> resultList = query.getResultList();
		logger.info("[native_queries_findById] select * from course where id = {} --> {}", id, resultList);
	}
	
	@Test
	public void native_queries_findById_named_param() {
		Long id = 10001L;
		Query query = em.createNativeQuery("select * from course where id = :ID", Course.class);
		query.setParameter("ID", id);
		List<?> resultList = query.getResultList();
		logger.info("[native_queries_findById_named_param] select * from course where id = {} --> {}", id, resultList);
	}	

	@Test
	@Transactional
	public void native_queries_to_update() {
		Query query = em.createNativeQuery("update course set last_updated_date=sysdate()");
		int numberOfRowsUpdated = query.executeUpdate();
		logger.info("[native_queries_to_update] number of rows updated: {}", numberOfRowsUpdated);
	}	
}
