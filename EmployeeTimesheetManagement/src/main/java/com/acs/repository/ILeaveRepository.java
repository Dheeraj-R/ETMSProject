package com.acs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.entity.Leave;

public interface ILeaveRepository extends JpaRepository<Leave,Integer>{

}
