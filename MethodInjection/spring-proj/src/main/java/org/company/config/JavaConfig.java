package org.company.config;

import org.company.Server;
import org.company.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean
	@Scope("prototype")
	public Server server() {

		return new Server();

	}

	@Bean
	public ServerConfig serverConfig() {

	    return new ServerConfig() {
			@Override
			public Server getNewserver() {
				return server();
			}
	    };

	}

}
