package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to bootstrap the Spring Boot application.
 * Annotated with @SpringBootApplication, indicating that it is the main class and enabling auto-configuration.
 */
@SpringBootApplication
public class SpringBootJpaH2Application {

    /**
     * Main method to start the Spring Boot application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaH2Application.class, args);
    }
}
