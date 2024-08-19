package com.example.project1.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    public Member member1(){
        Member member1 = new Member();
        member1.setName("김일남");
        member1.setPrinter(new PrinterA());

        return member1;
    }

     
    @Bean(name="Sung")
    public Member member2(){
        return new Member("김이남", new PrinterA());
    }

    @Bean
    public PrinterA printerA(){
        return new PrinterA();
    }

    @Bean
    public PrinterB printerB(){
        return new PrinterB();
    }
}
