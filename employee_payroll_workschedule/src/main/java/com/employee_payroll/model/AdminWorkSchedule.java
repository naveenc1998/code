package com.employee_payroll.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin_Work_Schedule")
public class AdminWorkSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "work_date")
	private String workdate;

	@Column(name = "work_time")
	private String worktime;

	@Column(name = "work_shift")
	private String workshift;

	@Column(name = "work_status")
	private String workstatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getWorkdate() {
		return workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public String getWorktime() {
		return worktime;
	}

	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}

	public String getWorkshift() {
		return workshift;
	}

	public void setWorkshift(String workshift) {
		this.workshift = workshift;
	}

	public String getWorkstatus() {
		return workstatus;
	}

	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public AdminWorkSchedule(long id, String emp_name, String workdate, String worktime, String workshift,
			String workstatus) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.workdate = workdate;
		this.worktime = worktime;
		this.workshift = workshift;
		this.workstatus = workstatus;
	}

	public AdminWorkSchedule() {
		super();
		
	}
	
	
	
	
	
	
}

	