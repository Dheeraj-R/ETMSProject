package com.acs.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "leavetbl")
public class Leave {
	@Id
	private int lid;
	private LocalDate start_date;
	private LocalDate end_date;
	private String reason;
	private LocalDate apply_date;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Employee employee;

	public Leave() {

	}

	public Leave(int lid, LocalDate start_date, LocalDate end_date, String reason, LocalDate apply_date,
			Employee employee) {
		super();
		this.lid = lid;
		this.start_date = start_date;
		this.end_date = end_date;
		this.reason = reason;
		this.apply_date = apply_date;
		this.employee = employee;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDate getApply_date() {
		return apply_date;
	}

	public void setApply_date(LocalDate apply_date) {
		this.apply_date = apply_date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
