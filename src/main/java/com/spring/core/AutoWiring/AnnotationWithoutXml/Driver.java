package com.spring.core.AutoWiring.AnnotationWithoutXml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(SingletonAndPrototype.class);
		Student st = (Student) con.getBean("getStudent", Student.class);
		st.studentMethod();
		System.out.println(st.getStuId());
		System.out.println(st.getStuName());

	}

}
