package com.spring.core.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {

		AbstractApplicationContext con = new ClassPathXmlApplicationContext("beanLifeCycle.xml");

		// demo for using xml file, to invoked init and destroy methods
		ByXml byXml = (ByXml) con.getBean("byxml");
		con.registerShutdownHook(); //to invoke the destroy method

		// demo for; implementation of interfaces

		ByImplementingInterfaces byInterfaces = (ByImplementingInterfaces) con.getBean("byImpInterfaces");
		con.close(); //to invoke the destroy method
		
		
		// demo for; using annotation
		ByAnnotations byAnno = (ByAnnotations) con.getBean("byAnnotation");
		con.close();
	}

}
