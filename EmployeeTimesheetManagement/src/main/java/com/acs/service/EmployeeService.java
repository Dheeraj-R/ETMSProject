package com.acs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.entity.Employee;
import com.acs.repository.IEmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private IEmployeeRepository repo;

	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	public Employee getEmployeeById(int empid) {
		Optional<Employee> op = repo.findById(empid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String createEmployee(Employee emp) {
		repo.save(emp);
		return "Employee Created With Id:" + emp.getEid();
	}

	public List<Employee> removeEmployee(int empid) {
		Employee emp = getEmployeeById(empid);
		if (emp != null)
			repo.delete(emp);
		return repo.findAll();
	}

	public String updateEmployee(Employee emp) {
		Employee emp1 = getEmployeeById(emp.getEid());
		if (emp1 != null)
			repo.saveAndFlush(emp);
		return "Employee Updated";
	}
}
