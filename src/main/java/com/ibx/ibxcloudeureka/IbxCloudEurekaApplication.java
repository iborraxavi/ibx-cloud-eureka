package com.ibx.ibxcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IbxCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbxCloudEurekaApplication.class, args);
	}

}
