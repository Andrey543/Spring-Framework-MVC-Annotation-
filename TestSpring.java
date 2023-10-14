package ru.Andrey.spring_app0;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
	  public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        HelloBean helloBean = context.getBean(HelloBean.class);
	        System.out.println(helloBean.getMessage());
	    }
	}