package com.springboot.springcoreadvancepractice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemo {

    public BeanLifeCycleDemo() {
        System.out.println("1. Constructor 1 called");
    }


    @PostConstruct
    public void init() {
        System.out.println("2. Bean Initialized");
    }


    @PreDestroy
    public void destroy() {
        System.out.println("3. Bean Destroyed");
    }
}
