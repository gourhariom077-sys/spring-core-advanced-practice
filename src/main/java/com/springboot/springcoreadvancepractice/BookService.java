package com.springboot.springcoreadvancepractice;

import org.springframework.stereotype.Component;

@Component
public class BookService {

    private final StudentService studentService;

    public BookService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void read() {
        System.out.println("Book is being read");
    }
}