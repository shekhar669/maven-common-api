package org.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service1 {

    public static void main(String[] args) {
        SpringApplication.run(Service1.class, args);
    }

    public String getServiceName() {
        return "Service1";
    }
}// Service1 test
