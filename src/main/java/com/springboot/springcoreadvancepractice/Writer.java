package com.springboot.springcoreadvancepractice;

import org.springframework.stereotype.Component;

@Component
public class Writer {
    private final Pen pen;
    public Writer(Pen pen) {
        this.pen = pen;

    }

    public void doWriting() {
        pen.write();
        System.out.println("Writer is working");
    }
}
