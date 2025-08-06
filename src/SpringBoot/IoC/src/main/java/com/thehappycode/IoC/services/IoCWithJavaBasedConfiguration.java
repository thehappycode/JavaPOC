package com.thehappycode.IoC.services;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCWithJavaBasedConfiguration {

    public void run()
    {
        // Load Spring IoC Container sử dụng Java-based configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaBasedAppConfig.class);

        // Retrieve the bean
        SimService airtelService = applicationContext.getBean("airtelService", SimService.class);

        // Call the method
        airtelService.calling();
        airtelService.data();


        // Retrieve the bean
        SimService jioService = applicationContext.getBean("jioService", SimService.class);

        // Call the method
        jioService.calling();
        jioService.data();

    }
}
