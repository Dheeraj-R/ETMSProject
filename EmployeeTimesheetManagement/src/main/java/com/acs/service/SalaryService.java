package com.acs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.entity.Salary;
import com.acs.repository.ISalaryRepository;


@Service
public class SalaryService {
	@Autowired
	private ISalaryRepository repo;
	
	public List<Salary> getAllSalary() {
		return repo.findAll();
	}

	public Salary getEmployeeById(int empid) {
		Optional<Salary> op = repo.findById(empid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String createEmployee(Salary sal) {
		repo.save(sal);
		return "Salary Created With Id:" + sal.getSid();
	}

}
