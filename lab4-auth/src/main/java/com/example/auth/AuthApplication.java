package com.example.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthApplication {
    public static void main(String[] args) {
        System.out.println("=== STARTING SPRING BOOT APPLICATION ===");
        SpringApplication.run(AuthApplication.class, args);
        System.out.println("=== SPRING BOOT STARTED SUCCESSFULLY ===");
    }

    @Bean
    public CommandLineRunner keepAlive() {
        return args -> {
            System.out.println("=== APPLICATION IS RUNNING - KEEPING IT ALIVE ===");
            // Бесконечный цикл чтобы держать приложение активным
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("=== APPLICATION STOPPED ===");
                    break;
                }
            }
        };
    }
}