package com.employee_payroll.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_leave")
public class AdminLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "from_date")
	private String from_date;

	@Column(name = "to_date")
	private String to_date;

	@Column(name = "leave_type")
	private String leave_type;

	@Column(name = "reason")
	private String reason;

	@Column(name = "status")
	private String status;

	public AdminLeave(long id, String from_date, String to_date, String leave_type, String reason, String status) {
		super();
		this.id = id;
		this.from_date = from_date;
		this.to_date = to_date;
		this.reason = reason;
		this.leave_type = leave_type;
		this.status = status;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getfrom_date() {
		return from_date;
	}

	public void setfrom_date( String from_date) {
		this.from_date = from_date;
	}

	public  String getto_date() {
		return to_date;
	}

	public void setto_date( String to_date) {
		this.to_date = to_date;
	}

	public String getleave_type() {
		return leave_type;
	}

	public void setleave_type(String leave_type) {
		this.leave_type = leave_type;
	}

	public String getreason() {
		return reason;
	}

	public void setreason(String reason) {
		this.reason = reason;
	}

	public String getstatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}

	public AdminLeave() {
		super();
		
	}

}
