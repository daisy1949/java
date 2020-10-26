package com.gupao.springcloudconfigclient;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringCloudConfigClientApplication.class);
		application.setWebEnvironment(true);
		application.run(args);
	}

}
