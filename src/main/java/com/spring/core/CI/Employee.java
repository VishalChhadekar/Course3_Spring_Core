package com.spring.core.CI;



public class Employee {
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	private int empId;
	private String empName;
	private Address address;
	

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Address getAddress() {
		return address;
	}

	

	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		
	}

}
