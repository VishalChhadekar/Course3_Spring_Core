package com.spring.core.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByImplementingInterfaces implements InitializingBean, DisposableBean  {

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Container has been closed, this is destroy method");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Container instantiated and instatnce of bean is created, after init method is called");	
		
	}

}
