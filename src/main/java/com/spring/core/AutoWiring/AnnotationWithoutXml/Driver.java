package com.spring.core.AutoWiring.AnnotationWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(ConfigClass.class);
		Student st = (Student) con.getBean("getStudent", Student.class);
		st.studentMethod();
		System.out.println(st.getStuId());
		System.out.println(st.getStuName());

	}

}
