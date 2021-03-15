package org.company;

import org.company.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Bean config using XML
		//GenericXmlApplicationContext context = new GenericXmlApplicationContext("config.xml");

		// Bean config using Java
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		LoanService sampelBean = (LoanService) context.getBean("loanService");
		sampelBean.issueLoan("cust1234");
		sampelBean.clearDue("cust4321");
		context.close();

	}

}
