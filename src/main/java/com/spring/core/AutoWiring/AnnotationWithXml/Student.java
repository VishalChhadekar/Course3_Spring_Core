package com.spring.core.AutoWiring.AnnotationWithXml;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int stuId;
	private String studenName;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStudenName() {
		return studenName;
	}

	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}

}
