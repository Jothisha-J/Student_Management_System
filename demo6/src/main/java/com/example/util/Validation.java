package com.example.util;

public class Validation {

    public static boolean isValidID(int id){
        return id>0;
    }

    public static boolean isValid(String str){
        return str.matches("[a-zA-Z. ]");
    }

    public static  boolean isValidName(String str){
        return str.matches("[a-zA-Z0-9-. ]");
    }
    
}
