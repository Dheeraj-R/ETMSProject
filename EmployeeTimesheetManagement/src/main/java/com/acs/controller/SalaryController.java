package com.acs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acs.entity.Employee;
import com.acs.entity.Salary;
import com.acs.service.SalaryService;


@RestController
@RequestMapping("salary")
public class SalaryController {
	@Autowired
	private SalaryService service;

	@GetMapping(produces = { "application/xml", "application/json" })
	public List<Salary> getAllSalaty() {
		return service.getAllSalary();
	}

	@GetMapping("/{sid}")
	public ResponseEntity<Salary> getSalary(@PathVariable int sid) {
		Salary sal = service.getSalaryById(sid);
		if (sal != null)
			return new ResponseEntity<Salary>(sal, HttpStatus.OK);
		else
			return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
	}

	@PostMapping(consumes = { "application/xml", "application/json" })
	public String createSalary(@RequestBody Salary sal) {
		return service.createSalary(sal);

	}
	@PutMapping(consumes = { "application/xml", "application/json" })
	public String updateSalary(@RequestBody Salary sal) {
		return service.updateSalary(sal);
	}

}
