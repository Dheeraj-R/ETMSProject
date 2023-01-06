package com.acs.entity;

import java.time.LocalDate;

import javax.persistence.OneToOne;

public class Salary {
	private int sid;
	private String name;
	private String email;
	private double hra;
	private double da;
	private double basic;
	private LocalDate month_year;

	@OneToOne
	private int eid;

	public Salary() {

	}

	public Salary(int sid, String name, String email, double hra, double da, double basic, LocalDate month_year,
			int eid) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.hra = hra;
		this.da = da;
		this.basic = basic;
		this.month_year = month_year;
		this.eid = eid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

}
