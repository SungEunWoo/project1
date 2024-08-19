package com.example.project1.bean;

public class PrinterA implements Printer{

    @Override
    public void print(String message) {
       System.out.println("printA" + message);
    }
    
}
