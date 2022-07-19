package com.spring.core.AutoWiring.Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("xmlAutowire.xml");
		Employee emp = (Employee) con.getBean("emp1");
		System.out.println("EmployeeId: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getEmpName());
		System.out.println("Passport Number: " + emp.getPassport().getPassNum());
		System.out.println("Country: " + emp.getPassport().getCountry());
		System.out.println("City: " + emp.getAddress().getCity());
		System.out.println("State: " + emp.getAddress().getState());

	}

}
