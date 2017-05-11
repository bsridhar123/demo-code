package com.demo.autoconfigure;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("REGISTRY")
@Configuration
@EnableEurekaClient
public class ServiceRegistryConfiguration {

}
