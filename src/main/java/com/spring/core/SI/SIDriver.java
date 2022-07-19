package com.spring.core.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SIDriver {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("SI.xml");
		Student st = (Student) con.getBean("Student1");
		System.out.println("Name: " + st.getStudentName());
		System.out.println("Stree: " + st.getAddress().getStreet());
		System.out.println("City: " + st.getAddress().getCity());
		System.out.println("STate: " + st.getAddress().getState());
	}

}
