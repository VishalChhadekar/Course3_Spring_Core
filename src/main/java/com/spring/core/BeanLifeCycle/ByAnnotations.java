package com.spring.core.BeanLifeCycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ByAnnotations {
	@PostConstruct
	public void init() {
		System.out.println("Init method, implemented with @PostConstruct");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destory method, implemented with @PreDestory");
	}
}
