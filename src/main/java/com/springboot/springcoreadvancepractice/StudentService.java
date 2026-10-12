package com.springboot.springcoreadvancepractice;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private final BookService bookService;

    public StudentService(@Lazy BookService bookService) {
        this.bookService = bookService;
    }

    public void study() {
        System.out.println("Student is studying");
    }
}
