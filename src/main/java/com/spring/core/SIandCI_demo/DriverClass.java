package com.spring.core.SIandCI_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("SIandCIdemo.xml");
		Customer customer = (Customer)con.getBean("customer1");
		System.out.println("CustomerId: " + customer.getCustId());
		System.out.println("Name: " + customer.getCustName());
		System.out.println("Email: " + customer.getEmailId());
		System.out.println("Phone: " + customer.getContacNo());
		System.out.println("MemberShipID: " + customer.getMembership().getMemberShipId());
		System.out.println("MemberShipType: " + customer.getMembership().getMemberShipType());
		System.out.println("VisitPerYear: " + customer.getMembership().getVisitsPerYear());
	}

}
