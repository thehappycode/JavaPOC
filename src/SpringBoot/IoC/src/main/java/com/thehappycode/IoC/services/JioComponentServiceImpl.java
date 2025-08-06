package com.thehappycode.IoC.services;

import org.springframework.stereotype.Component;

// @Component // Mặc định sử dụng specify the bean name
@Component("jioBean") // Sử dụng explicit bean name
public class JioComponentServiceImpl implements  SimService{
    @Override
    public void calling() {
        System.out.println("--> Jio Calling");
    }

    @Override
    public void data() {
        System.out.println("--> Jio Data");
    }
}
