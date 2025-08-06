package com.thehappycode.IoC.services;

public class JioServiceImpl implements SimService {
    @Override
    public void calling() {
        System.out.println("--> Jio calling");
    }

    @Override
    public void data() {
        System.out.println("--> Jio Data");
    }
}
