package com.thehappycode.IoC.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCWithXMLConfiguration {

    public void run() {

        // Sử dụng ApplicationContext để triển khai Spring IoC.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // Lấy bean airtelService.
        SimService airtelService = applicationContext.getBean("airtelService", SimService.class);

        // Calling the method
        airtelService.calling();
        airtelService.data();

        // Lấy bean jioService
        SimService jioService = applicationContext.getBean("jioService", SimService.class);

        // Calling the method
        jioService.calling();
        jioService.data();
    }
}
