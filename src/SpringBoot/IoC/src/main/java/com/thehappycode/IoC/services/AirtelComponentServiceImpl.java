package com.thehappycode.IoC.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component // Mặc định sử dụng specify the bean name
//@Primary // Primary sẽ lấy class này làm mặc định.
@Component("airtelBean") // Sử dụng explicit bean name
public class AirtelComponentServiceImpl implements  SimService {

    @Override
    public void calling() {
        System.out.println("--> Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("--> Airtel Data");
    }
}
