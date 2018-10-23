package com.niit.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class testcase {

	public static void main(String [] arg)
	{
    	//ApplicationContext context=new AnnotationConfigApplicationContext();
    	
    	//AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBconfiguration.class);
		//AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(DBconfiguration.class);
		//context.scan("niit.model.*"); 
		//context.refresh();
	      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBconfiguration.class);

	}
}
