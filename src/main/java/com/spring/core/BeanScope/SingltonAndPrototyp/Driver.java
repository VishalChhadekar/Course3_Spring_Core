package com.spring.core.BeanScope.SingltonAndPrototyp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(ConfigClass.class);
		Car car = (Car) con.getBean("getCar", Car.class);
		car.setCarId(34);
		car.setCarModel("Tesla");
		System.out.println("CarId: " + car.getCarId());
		System.out.println("CarModel: " + car.getCarModel());

		Car car1 = (Car) con.getBean("getCar", Car.class);
		System.out.println("CarId: " + car1.getCarId());
		System.out.println("CarModel: " + car1.getCarModel());

	}

}
