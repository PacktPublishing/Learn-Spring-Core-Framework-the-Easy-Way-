package org.company;

import org.company.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Bean config using XML
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		System.out.println("Using beans in application ...");
		ServerConfig obj = (ServerConfig) context.getBean("serverConfig");
		
		System.out.println(obj.getNewserver().hashCode());
		System.out.println(obj.getNewserver().hashCode());
		System.out.println(obj.getNewserver().hashCode());
		
		System.out.println("Closing context ...");
		((ConfigurableApplicationContext) context).close();
	}

}
