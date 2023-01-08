package com.acs.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attbl")
public class Attendence {
	@Id
	private int aid;
	private String first_half;
	private String second_half;
	private LocalDate day_date;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Employee employee;

	public Attendence() {

	}

	public Attendence(int aid,String first_half, String second_half, LocalDate day_date, Employee employee) {
		super();
		this.aid=aid;
		this.first_half = first_half;
		this.second_half = second_half;
		this.day_date = day_date;
		this.employee = employee;
	}
    
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getFirst_half() {
		return first_half;
	}

	public void setFirst_half(String first_half) {
		this.first_half = first_half;
	}

	public String getSecond_half() {
		return second_half;
	}

	public void setSecond_half(String second_half) {
		this.second_half = second_half;
	}

	public LocalDate getDay_date() {
		return day_date;
	}

	public void setDay_date(LocalDate day_date) {
		this.day_date = day_date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
