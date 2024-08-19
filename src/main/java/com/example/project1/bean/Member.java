package com.example.project1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String name;
    private Printer printer;

    public void print(){
        printer.print("Hello" + name + "!");
    }
    
}
