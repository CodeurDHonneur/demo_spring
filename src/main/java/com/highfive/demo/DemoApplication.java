package com.highfive.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.highfive.demo.config.ApplicationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    ApplicationProperties.class, LiquibaseProperties.class
})

public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
