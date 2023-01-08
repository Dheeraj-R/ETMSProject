package com.acs.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employeetbl")
public class Employee {
	@Id
	private int eid;
	private String name;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	@Column(name = "birth_date")
	private LocalDate dob;
	private String address;
	private long phone;
	private String email;
	private String job_post;

	public Employee() {

	}

	public Employee(int eid, String name, LocalDate dob, String address, long phone, String email, String job_post) {
		
		this.eid = eid;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.job_post = job_post;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob_post() {
		return job_post;
	}

	public void setJob_post(String job_post) {
		this.job_post = job_post;
	}

}
