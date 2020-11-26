package com.gupao.springcloudconfigserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(scanBasePackages = "com.gupao.springcloudconfigserverdemo")
@EnableConfigServer
public class SpringCloudConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerDemoApplication.class, args);
	}

}
