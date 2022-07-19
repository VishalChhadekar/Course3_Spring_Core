package com.spring.core.AutoWiring.AnnotationWithoutXml;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int stuId;
	private String stuName;

	public void studentMethod() {
		System.out.println("Method envoked of student class");
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}
