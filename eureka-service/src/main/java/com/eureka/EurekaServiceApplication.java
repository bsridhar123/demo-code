package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
	
	 @GetMapping("/api/billing")
     String getName() {
         return "Welcome to spring boot:" ;
     }
	 
	 @PostMapping("/api/billing")
     void  submitName(@RequestBody Employee employee) {
         System.out.println("Received:" + employee);
     }
 
	
	 
}
