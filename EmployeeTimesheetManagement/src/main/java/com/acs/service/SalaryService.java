package com.acs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.entity.Employee;
import com.acs.entity.Salary;
import com.acs.repository.ISalaryRepository;


@Service
public class SalaryService {
	@Autowired
	private ISalaryRepository repo;
	
	public List<Salary> getAllSalary() {
		return repo.findAll();
	}

	public Salary getSalaryById(int empid) {
		Optional<Salary> op = repo.findById(empid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String createSalary(Salary sal) {
		repo.save(sal);
		return "Salary Created With Id:" + sal.getSid();
	}

	public String updateSalary(Salary sal) {
		Salary sal1 = getSalaryById(sal.getSid());
		if (sal1 != null)
			repo.saveAndFlush(sal);
		return "Salary Updated";
	}
}
