package com.acs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.entity.Salary;

public interface ISalaryRepository extends JpaRepository<Salary,Integer>{

}
