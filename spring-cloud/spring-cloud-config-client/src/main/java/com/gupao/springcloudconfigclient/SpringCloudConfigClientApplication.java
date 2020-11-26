package com.gupao.springcloudconfigclient;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication();
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(SpringCloudConfigClientApplication.class);
	}

}
