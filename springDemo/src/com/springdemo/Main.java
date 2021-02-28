package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);
	
		
		ICustomerService myService = context.getBean("service",ICustomerService.class);
		
		
		myService.add();
		context.close();
		
		

	}

}
