package com.github.springboot.dubbo.demo.customer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.springboot.dubbo.demo.customer.controller")
public class DubboCustomerMain {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerMain.class, args);
    }
}
