package com.example.project1.bean;

public class PrinterB implements Printer{

    @Override
    public void print(String message) {
       System.out.println("printB" + message);
    }
    
}
