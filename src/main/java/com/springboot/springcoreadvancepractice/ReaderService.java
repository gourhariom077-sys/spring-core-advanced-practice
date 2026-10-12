package com.springboot.springcoreadvancepractice;

import org.springframework.stereotype.Component;

@Component
public class ReaderService {
    private final Reader reader;

    public ReaderService(Reader reader) {
        this.reader = reader;
    }

    public void startReading(){
        reader.read();
    }
}
