package com.spring.core.autowire_demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CongiClass.class);

		Employee emp = context.getBean(Employee.class);

		System.out.println("EmpID : " + emp.getEmpId());
		System.out.println("Emp Name : " + emp.getEmpName());
		System.out.println("Emp Passport : " + emp.getPassprot().toString());
		context.close();
	}

}
