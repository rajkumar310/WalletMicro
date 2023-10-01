package com.serviceregistry.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}


//git init

//git add .
//
//git commit -m "any message"
//
//git remote add origin <repo name>
//
//git remote -v
//
//git push origin master
//

//for next time:-

//
//git init
//
//git add .
//
//git commit -m "any message"
//
//git push origin master