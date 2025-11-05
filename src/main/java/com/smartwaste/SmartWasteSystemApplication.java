package com.smartwaste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-cloud.properties")  // 👈 tells Spring Boot to use cloud properties
public class SmartWasteSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartWasteSystemApplication.class, args);
    }
}