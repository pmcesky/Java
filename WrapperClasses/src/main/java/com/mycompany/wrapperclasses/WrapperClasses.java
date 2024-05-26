package com.mycompany.wrapperclasses;

public class WrapperClasses {
    public static void main(String[] args) {
        // 8 primitive types in Java are basic data types and not objects
        // Java Collection Framework can only store objects (not primitive data types)
        // wrapper classes provide a convenient way to convert primitive data types into objects and vice versa
        // convert a primitive type into an object of its corresponding wrapper class
        Integer intObject = Integer.valueOf(100);
        int m = intObject.intValue();
        System.out.println(m);

        // Automatic conversion with autoboxing and unboxing
        // autoboxing
        Integer intObj = 100;
        //unboxing
        int n = intObj;
        System.out.println(n);

        // Converting strings into primitive types with wrapper classes
        int p = Integer.parseInt("5");
        System.out.println(p);
        double q = Double.parseDouble("5.1");
        System.out.println(q);
        int t = Integer.parseInt("ABC"); // Error
        System.out.println(t);
    }    
}