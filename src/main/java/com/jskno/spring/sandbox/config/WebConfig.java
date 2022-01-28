package com.jskno.spring.sandbox.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryCustomizer;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

//@Configuration
//@EnableAutoConfiguration(exclude = {
//        ServletWebServerFactoryCustomizer.class,
//        WebMvcAutoConfiguration.class,
//        EmbeddedWebServerFactoryCustomizerAutoConfiguration.class,
//        ServletWebServerFactoryAutoConfiguration.class,
//        DispatcherServletAutoConfiguration.class,
//})
public class WebConfig {

//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
//        RequestMappingHandlerMapping mapping = new RequestMappingHandlerMapping();
//        // add properties here
//        return mapping;
//    }
}
