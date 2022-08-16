package com.hbue;

import com.hbue.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) classPathXmlApplicationContext.getBean("bookService");
        bookService.save();
    }
}
