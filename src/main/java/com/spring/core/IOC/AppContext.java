package com.spring.core.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("appContextxml.xml");
		Product product = (Product)con.getBean("product");
		System.out.println("Product ID: " + product.getProdId());
		System.out.println("Product Name: " + product.getProName());
		System.out.println("Product Price: " + product.getProPrice());
	}

}
