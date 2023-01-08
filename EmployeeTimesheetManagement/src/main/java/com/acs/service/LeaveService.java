package com.acs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.entity.Leave;
import com.acs.repository.ILeaveRepository;

@Service
public class LeaveService {
	@Autowired
	private ILeaveRepository repo;

	public List<Leave> getAllLeave() {
		return repo.findAll();
	}

	public Leave getLeaveById(int lid) {
		Optional<Leave> op = repo.findById(lid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String createLeave(Leave l) {
		repo.save(l);
		return "Leave Applied With Id:" + l.getLid();
	}

}
