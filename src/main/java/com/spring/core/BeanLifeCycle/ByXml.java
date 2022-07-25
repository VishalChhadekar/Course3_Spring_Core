package com.spring.core.BeanLifeCycle;

public class ByXml {
	public void init() {
		System.out.println("Init method; byXml");
	}

	public void destroy() {
		System.out.println("destroy method; byXml");
	}
}
