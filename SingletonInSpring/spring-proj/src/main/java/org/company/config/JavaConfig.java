package org.company.config;

import org.company.AnotherBean;
import org.company.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
@Lazy
@Configuration
public class JavaConfig {

	@Lazy(false)
	@Bean
	public AnotherBean anotherBean() {
		return new AnotherBean();
	}
	

	@Bean
	public SampleBean sampleBean(AnotherBean anotherBean) {
		return new SampleBean(anotherBean);
	}
}
