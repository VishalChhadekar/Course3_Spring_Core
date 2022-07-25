package com.spring.core.BeanScope.SingltonAndPrototyp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class ConfigClass {
	
	@Bean
//	@Scope("singleton")
	@Scope("prototype")
	public Car getCar() {
		Car car = new Car();
		return car;
	}

}
