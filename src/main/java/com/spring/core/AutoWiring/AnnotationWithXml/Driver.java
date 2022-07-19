package com.spring.core.AutoWiring.AnnotationWithXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("AnnoWithXml.xml");
		Student st = (Student) con.getBean("student", Student.class);
		System.out.println(st.getClass());
	}

}
