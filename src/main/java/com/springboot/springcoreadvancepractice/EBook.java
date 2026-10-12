package com.springboot.springcoreadvancepractice;

import org.springframework.stereotype.Component;

@Component
public class EBook implements Reader {

    @Override
    public void read() {
        System.out.println("Reading an ebook");
    }


}
