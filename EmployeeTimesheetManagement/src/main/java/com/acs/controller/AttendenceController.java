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

import com.acs.entity.Attendence;
import com.acs.service.AttendenceService;

@RestController
@RequestMapping("attendence")
public class AttendenceController {
	@Autowired
	private AttendenceService service;

	@GetMapping(produces = { "application/xml", "application/json" })
	public List<Attendence> getAllAttendence() {
		return service.getAllAttendence();
	}

	@GetMapping("/{aid}")
	public ResponseEntity<Attendence> getAttendence(@PathVariable int aid) {
		Attendence at = service.getAttendenceById(aid);
		if (at != null)
			return new ResponseEntity<Attendence>(at, HttpStatus.OK);
		else
			return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
	}

	@PostMapping(consumes = { "application/xml", "application/json" })
	public String createAttendence(@RequestBody Attendence at) {
		return service.createAttendence(at);

	}

}
