package com.jskno.spring.sandbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-fitnesse.properties")
public class PropertiesConfig {
}
