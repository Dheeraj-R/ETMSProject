package com.acs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.entity.Attendence;


public interface IAttendenceRepository extends JpaRepository<Attendence,Integer>{

}
