package com.acs.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="salarytbl")
public class Salary {
	@Id
	private int sid;
	private double hra;
	private double da;
	private double basic;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate month_year;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Employee employee;

	public Salary() {

	}

	public Salary(int sid, double hra, double da, double basic, LocalDate month_year, Employee employee) {
		super();
		this.sid = sid;
		this.hra = hra;
		this.da = da;
		this.basic = basic;
		this.month_year = month_year;
		this.employee = employee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public LocalDate getMonth_year() {
		return month_year;
	}

	public void setMonth_year(LocalDate month_year) {
		this.month_year = month_year;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}  

}
