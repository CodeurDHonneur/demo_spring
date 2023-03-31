package com.highfive.demo;

import com.highfive.demo.config.ApplicationProperties;
import org.springframework.stereotype.Service;


@Service

public class HelloWorldService {
    public HelloWorldService(ApplicationProperties applicationProperties) {
        System.out.println(applicationProperties.getHello());
    }
}
