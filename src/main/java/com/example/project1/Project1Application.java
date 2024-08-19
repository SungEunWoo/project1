package com.example.project1;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.project1.bean.Config;
import com.example.project1.bean.Member;
import com.example.project1.bean.Printer;

//@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Project1Application.class, args);
	
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Member member1 = (Member)context.getBean("member1");
		member1.print();

		Member member2 = (Member)context.getBean("Sung", Member.class);
		member2.print();

		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
	}

}
