package com.acs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer>{

}
