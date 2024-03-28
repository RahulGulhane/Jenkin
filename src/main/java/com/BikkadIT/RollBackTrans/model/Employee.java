package com.BikkadIT.RollBackTrans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empId;

	private String empname;

	private int empAge;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empAge=" + empAge + "]";
	}
	}
