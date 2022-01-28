package com.jskno.spring.sandbox.config;


import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

public class AppEnvironmentPreparedListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {

        ConfigurableEnvironment environment = event.getEnvironment();
        Properties props = new Properties();
        props.setProperty("spring.main.web-application-type", "none");
        environment.getPropertySources().addFirst(
                new PropertiesPropertySource("noWebContextOnTheFly", props));
    }
}
