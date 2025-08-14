package com.thehappycode.ManagingConfigurations.Configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:dbConfig.properties") // Sử dụng PropertySource
public class DbConfiguration {

    @Autowired
    private Environment env;

    @Override
    public  String toString(){
        String userName = env.getProperty("userName");
        String password = env.getProperty("password");
        return String.format("-> dbConfig: {userName: %s, password: %s}", userName, password);
    }
}
