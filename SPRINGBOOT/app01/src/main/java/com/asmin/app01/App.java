package com.asmin.app01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
        System.out.println("Welcome To SpringBoot Application");
        
    }
}
