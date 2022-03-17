package com.learning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dao.Test;
import com.learning.dao.TestDao;

@Service
public class TestService {
	@Autowired
	private TestDao dao;

	public Test createRandomData() {
		Test test = new Test();
		test.setName("Majo" + Math.round(Math.random() * 10));
		test.setPhone(Math.round(Math.random() * 100000));
		return dao.save(test);
	}

	public List<Test> getAllData() {

		return dao.selectAll();
	}
}
