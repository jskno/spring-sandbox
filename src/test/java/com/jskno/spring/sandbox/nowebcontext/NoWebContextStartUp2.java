package com.jskno.spring.sandbox.nowebcontext;

import com.jskno.spring.sandbox.SpringSandboxApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

public class NoWebContextStartUp2 {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringSandboxApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        applicationContext = app.run(args);
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

    private static void checkBeansPresence(String... beans) {
        Arrays.stream(beans).forEach(beanName -> System.out.println(
                "Is " + beanName + " in ApplicationContext: " + applicationContext.containsBean(beanName)
        ));
    }
}
