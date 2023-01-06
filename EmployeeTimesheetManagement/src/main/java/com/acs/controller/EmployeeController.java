package com.acs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acs.entity.Employee;
import com.acs.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping(produces = { "application/xml", "application/json" })
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}

	@GetMapping("/{empid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int empid) {
		Employee emp = service.getEmployeeById(empid);
		if (emp != null)
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		else
			return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
	}

	@PostMapping(consumes = { "application/xml", "application/json" })
	public String createEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);

	}

	@DeleteMapping("/{eid}")
	public List<Employee> deleteEmployee(@PathVariable int eid) {
		return service.removeEmployee(eid);
	}

	@PutMapping(consumes = { "application/xml", "application/json" })
	public String updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
}
