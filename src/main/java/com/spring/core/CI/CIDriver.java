package com.spring.core.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIDriver {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("CI.xml");
		Employee emp =(Employee) con.getBean("employee");
		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("City: " + emp.getAddress().getCity());
		System.out.println("State: " + emp.getAddress().getState());
	}

}
