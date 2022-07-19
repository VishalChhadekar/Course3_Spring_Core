package com.spring.core.autowire_demo;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CongiClass {

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEmpId(789);
		emp.setEmpName("Jocker");
		return emp;
	}

	@Bean
	public Passport passport() {
		Passport pass = new Passport();
		Date todayDate = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(todayDate);
		cal.add(Calendar.DATE, 100);
//      this will add the 100 days, with today's date 
//		today's date will be real-time date
		Date expiryDate = cal.getTime();

		pass.setDateOfIssue(todayDate);
		pass.setDateOfExpiry(expiryDate);

		return pass;
	}

}
