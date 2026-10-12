package com.springboot.springcoreadvancepractice;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class EagerLazy {


    public EagerLazy() {
        System.out.println("Eager bean created");
    }
}

@Component
@Lazy
class LazyBean {

    public LazyBean() {
        System.out.println("LazyBean bean created");
    }
}