package com.example.service;

import java.util.Scanner;

import com.example.dao.BookDAOImpl;
import com.example.model.Book;
import com.example.util.InputUtil;
import com.example.util.Validation;

public class BookServiceImpl implements BookService{

    BookDAOImpl dao=new BookDAOImpl();
    private static Scanner sc=new Scanner(System.in);
    public boolean insert(){
        
        System.out.println("Enter book id:");
        int id=sc.nextInt();
        if(!Validation.isValidID(id)){
            System.out.println("Invalid ID...");
            id=InputUtil.getInt("Enter book id:");
        }

        System.out.println("Enter Book Name:");
        String name=sc.next();
        if(!Validation.isValidName(name)){
            System.out.println("Invalid Book Name...");
            name=InputUtil.getString("Enter book Name:");
        }

        System.out.println("Enter Book Author:");
        String auth=sc.next();
        if(!Validation.isValid(auth)){
            System.out.println("Invalid Book Author...");
            auth=InputUtil.getString("Enter book Author:");
        }

        System.out.println("Enter Book Publisher:");
        String pub=sc.next();
        if(!Validation.isValid(pub)){
            System.out.println("Invalid Book Publisher...");
            pub=InputUtil.getString("Enter book Publisher:");
        }

        System.out.println("Enter book price:");
        float price=sc.nextFloat();

        return dao.add(new Book(id,name,auth,pub,price));
    }
    
}
