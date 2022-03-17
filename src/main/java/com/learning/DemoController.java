package com.learning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dao.Test;

@RestController
public class DemoController {
	@Autowired
	private TestService service;

	@GetMapping(path = "/test/{name}", produces = "application/json")
	public ResponseEntity<String> test(@PathVariable(value = "name") String rqst) {
		return new ResponseEntity<String>("Hello " + rqst, HttpStatus.OK);
	}

	@GetMapping(path = "/saveRandom", produces = "application/json")
	public Test saveRandom() {
		return service.createRandomData();
	}

	@PostMapping()
	@GetMapping(path = "/getData", produces = "application/json")
	public List<Test> getAllData() {
		return service.getAllData();
	}

}
