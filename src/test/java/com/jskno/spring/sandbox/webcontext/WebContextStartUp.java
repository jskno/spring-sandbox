package com.jskno.spring.sandbox.webcontext;

import com.jskno.spring.sandbox.SpringSandboxApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

public class WebContextStartUp {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(SpringSandboxApplication.class, args);
        printAllBeans();
    }

    private static void printAllBeans() {
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("NUMBER OF BEANS: " + applicationContext.getBeanDefinitionCount());
        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(beanName -> System.out.println("Bean Name: " + beanName)
                );
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
    }
}
