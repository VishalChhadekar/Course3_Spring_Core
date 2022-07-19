package com.spring.core.CollectiveDataType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("CollDataType.xml");
		Customer cust = (Customer)con.getBean("customer");
		System.out.println("Name: " + cust.getCustName());
		System.out.println(cust.toString());
	}

}
