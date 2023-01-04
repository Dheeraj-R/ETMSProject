package com.acs.entity;

import java.time.LocalDate;

public class Employee {
	private int empid;
private String name;
private String fname;
private int age;
private LocalDate dob;
private String address;
private long phone;
private String email;
private String education;
private String jobpost;
private long aadhar;

public Employee() {
	
}


public Employee(int empid, String name, String fname, int age, LocalDate dob, String address, long phone, String email,
		String education, String jobpost, long aadhar) {
	super();
	this.empid = empid;
	this.name = name;
	this.fname = fname;
	this.age = age;
	this.dob = dob;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.education = education;
	this.jobpost = jobpost;
	this.aadhar = aadhar;
}


public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
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

public String getEducation() {
	return education;
}

public void setEducation(String education) {
	this.education = education;
}

public String getJobpost() {
	return jobpost;
}

public void setJobpost(String jobpost) {
	this.jobpost = jobpost;
}

public long getAadhar() {
	return aadhar;
}

public void setAadhar(long aadhar) {
	this.aadhar = aadhar;
}


}
