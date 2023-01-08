package com.acs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.entity.Attendence;
import com.acs.repository.IAttendenceRepository;


@Service
public class AttendenceService {
	@Autowired
	private IAttendenceRepository repo;

	public List<Attendence> getAllAttendence() {
		return repo.findAll();
	}

	public Attendence getAttendenceById(int empid) {
		Optional<Attendence> op = repo.findById(empid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String createAttendence(Attendence at) {
		repo.save(at);
		return "Employee Created With Id:" + at.getAid();
	}

}
