package com.demo.autoconfigure;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;

@Profile("REGISTRY")
@AutoConfigureBefore(EurekaClientAutoConfiguration.class)
@Configuration
@EnableEurekaClient
public class ServiceRegistryConfiguration {

}
