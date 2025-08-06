package com.thehappycode.IoC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class IoCWithAnnotationConfiguration {

    @Autowired
    @Qualifier("airtelBean")
    private  SimService simService;
    public  void useSimService(){
        simService.calling();
        simService.data();
    }
    public void run()
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
        IoCWithAnnotationConfiguration ioCWithAnnotationConfiguration = applicationContext.getBean(IoCWithAnnotationConfiguration.class);
        ioCWithAnnotationConfiguration.useSimService();
    }
}
