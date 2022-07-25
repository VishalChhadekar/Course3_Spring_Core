package com.spring.core.AutoWiring.AnnotationWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.core.AutoWiring.AnnotationWithoutXml") 
//instead of creating a xml file, we can create a java class which will handle all the configurations
//to make it so, we have to Annotated it with @Configuration
@ComponentScan
public class SingletonAndPrototype {

	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setStuId(45);
		student.setStuName("Sandman");
		return student;
	}

}
