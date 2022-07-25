package com.spring.core.BeanScope.SingltonAndPrototyp;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private int carId;
	private String carModel;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String string) {
		this.carModel = string;
	}
	//beanScope.xml
}
