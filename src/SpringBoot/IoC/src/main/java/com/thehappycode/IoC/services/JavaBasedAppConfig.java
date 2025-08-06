package com.thehappycode.IoC.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedAppConfig {

    @Bean
    public SimService airtelService() {
        return new AirtelServiceImpl();
    }

    @Bean
    public SimService jioService(){
        return new JioServiceImpl();
    }
}
