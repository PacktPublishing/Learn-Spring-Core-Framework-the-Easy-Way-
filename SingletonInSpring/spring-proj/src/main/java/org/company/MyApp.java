package org.company;

import java.io.IOException;

import org.company.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) throws IOException {

		// Bean config using XML
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("Requesting for a Bean..");

		System.out.println("Hashcodes..");
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		
		System.out.println("Executing behaviour..");
		new Thread(() -> ((SampleBean) context.getBean("sampleBean")).sampleMethod("Message from T1")).start();
		new Thread(() -> ((SampleBean) context.getBean("sampleBean")).sampleMethod("Message from T2")).start();
		new Thread(() -> ((SampleBean) context.getBean("sampleBean")).sampleMethod("Message from T3")).start();
		new Thread(() -> ((SampleBean) context.getBean("sampleBean")).sampleMethod("Message from T4")).start();
	}

}
