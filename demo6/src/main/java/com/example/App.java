package com.example;
import com.example.service.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        BookServiceImpl service=new BookServiceImpl();
        System.out.println( "Choices \n ---------------" );
        System.out.println("1.Add \n 2.View \n 3.Search \n 4.Update \n 5.Delete");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while (true) {
            switch (num) {
                case 1:
                    service.insert();
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
    }
    }

