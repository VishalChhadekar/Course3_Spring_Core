package com.spring.core.SI;

import java.util.List;

public class Student {
	private int stuId;
	private String studentName;
	private Address address;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public Student(int stuId, String studentName, Address address) {
		super();
		this.stuId = stuId;
		this.studentName = studentName;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
