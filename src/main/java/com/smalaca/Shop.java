package com.smalaca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.smalaca")
public class Shop {
    public static void main( String[] args ) {
        SpringApplication.run(Shop.class, args);
    }
}
