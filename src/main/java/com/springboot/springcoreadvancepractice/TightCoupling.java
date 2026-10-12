package com.springboot.springcoreadvancepractice;


class PaperBook{
    void read(){
        System.out.println("Reading a paper book");
    }
}

public class TightCoupling {

    public static void main(String[] args) {
        PaperBook book = new PaperBook();
        book.read();
    }
}
