package com.learning.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends CrudRepository<Test, Long> {

	@Query(value = "SELECT * from test", nativeQuery = true)
	List<Test> selectAll();

}
