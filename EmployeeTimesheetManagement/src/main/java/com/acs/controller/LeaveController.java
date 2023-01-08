package com.acs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acs.entity.Leave;
import com.acs.service.LeaveService;

@RestController
@RequestMapping("leave")
public class LeaveController {
	@Autowired
	private LeaveService service;

	@GetMapping(produces = { "application/xml", "application/json" })
	public List<Leave> getAllLeave() {
		return service.getAllLeave();
	}

	@GetMapping("/{lid}")
	public ResponseEntity<Leave> getLeave(@PathVariable int lid) {
		Leave l = service.getLeaveById(lid);
		if (l != null)
			return new ResponseEntity<Leave>(l, HttpStatus.OK);
		else
			return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
	}

	@PostMapping(consumes = { "application/xml", "application/json" })
	public String createLeave(@RequestBody Leave l) {
		return service.createLeave(l);

	}

}
