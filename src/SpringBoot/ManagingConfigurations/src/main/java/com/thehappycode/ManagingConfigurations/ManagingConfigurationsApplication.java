package com.thehappycode.ManagingConfigurations;

import com.thehappycode.ManagingConfigurations.Configurations.DbConfiguration;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Properties;
import java.util.logging.Logger;

@SpringBootApplication
public class ManagingConfigurationsApplication {

	public static void main(String[] args) {

        // TODO: Using the Default configuration.
        // SpringApplication.run(ManagingConfigurationsApplication.class, args);

        // TODO: Using the SpringApplication class.
        // Sử dụng phương thức setDefaultProperties() để set cấu hình.
//        Properties properties = new Properties();
//        properties.setProperty("spring.config.on-not-found", "ignore");
//
//        SpringApplication application = new SpringApplication(SpringBootApplication.class);
//        application.setDefaultProperties(properties);
//        application.run(args);


        // TODO: dbConfig - Sử dụng @PropertySource
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ManagingConfigurationsApplication.class, args);
        DbConfiguration dbConfiguration = applicationContext.getBean(DbConfiguration.class);
        System.out.println(dbConfiguration.toString());
	}

}
