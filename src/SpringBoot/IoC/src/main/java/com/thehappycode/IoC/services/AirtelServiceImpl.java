package com.thehappycode.IoC.services;

public class AirtelServiceImpl implements SimService {
    @Override
    public void calling() {
        System.out.println("--> Airtel Calling");
    }

    public void data() {
        System.out.println("--> Airtel Data");
    }
}
