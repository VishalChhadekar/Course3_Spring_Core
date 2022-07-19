package com.spring.core.autowire_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String empName;

	@Autowired
	private Passport passprot;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Passport getPassprot() {
		return passprot;
	}

	public void setPassprot(Passport passprot) {
		this.passprot = passprot;
	}

}
