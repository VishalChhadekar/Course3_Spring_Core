package com.spring.core.CI;

public class Address {
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String city;
	private String state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

}
