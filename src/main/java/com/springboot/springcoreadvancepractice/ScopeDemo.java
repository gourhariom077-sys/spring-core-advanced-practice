package com.springboot.springcoreadvancepractice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ScopeDemo {

    public ScopeDemo() {
        System.out.println("Scope object created");
    }
}
