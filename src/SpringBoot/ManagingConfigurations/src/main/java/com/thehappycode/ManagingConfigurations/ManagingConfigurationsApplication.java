package com.thehappycode.ManagingConfigurations;

import com.thehappycode.ManagingConfigurations.Configurations.ConfigDataFile;
import com.thehappycode.ManagingConfigurations.Configurations.DbConfiguration;

import com.thehappycode.ManagingConfigurations.Configurations.SpringApplicationConfiguration;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Properties;
import java.util.logging.Logger;

import static com.thehappycode.ManagingConfigurations.Configurations.SpringApplicationConfiguration.run;

@SpringBootApplication
public class ManagingConfigurationsApplication {

	public static void main(String[] args) {

        // TODO: Using the Default configuration.
        // SpringApplication.run(ManagingConfigurationsApplication.class, args);

        // TODO: Using SpringApplication’s setDefaultProperties method
        ConfigurableApplicationContext applicationContext =
                SpringApplicationConfiguration.run(ManagingConfigurationsApplication.class, args);

        // TODO: dbConfig - Sử dụng @PropertySource
        // ConfigurableApplicationContext applicationContext = SpringApplication.run(ManagingConfigurationsApplication.class, args);
        DbConfiguration dbConfiguration = applicationContext.getBean(DbConfiguration.class);
        System.out.println(dbConfiguration.toString());

        // TODO: Config data file
        ConfigDataFile.run();
	}

}
