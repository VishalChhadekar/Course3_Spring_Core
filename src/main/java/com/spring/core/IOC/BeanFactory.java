package com.spring.core.IOC;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactory {
	public static void main(String[] args) {
		//Resource resource = new ClassPathResource("beanFactory.xml");
		Resource resource=new ClassPathResource("beanFactory.xml");  
		//BeanFactory factory=new XmlBeanFactory(resource);  
		//the XmlBeanFactory() constructor is deprecated, thus can not be user anymore
	}

}
