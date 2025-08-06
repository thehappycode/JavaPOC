package com.thehappycode.IoC.services;

public class WithoutIoC {

    public void run() {
        // Tạo instance airtel thủ công.
        SimService airtelService = new AirtelServiceImpl();

        // Gọi phương thức của instance airtel.
        airtelService.calling();
        airtelService.data();

        // Tạo instance jio thủ công.
        SimService jioService = new JioServiceImpl();

        // Gọi phương thức của instance jio.
        jioService.calling();
        jioService.data();
    }
}
