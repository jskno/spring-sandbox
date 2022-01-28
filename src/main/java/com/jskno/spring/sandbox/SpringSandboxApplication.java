package com.jskno.spring.sandbox;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringSandboxApplication {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new SpringApplicationBuilder(SpringSandboxApplication.class)
//                .web(WebApplicationType.NONE)
                .run(args);
        printAllBeans();
        checkBeansPresence("newsRepository", "newsService", "newsController",
                "mainErrorController");
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
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
    }

}
