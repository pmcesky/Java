package com.mycompany.inheritance;

import java.util.Scanner;

// parent class
abstract public class Member { // abstract classes can have abstract methods; they can not be instantiated, can only be a base/parent class for other classes to inherit 
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee; // accessible within the class in which it is declared, any class that is derived from it and any class in the same package
    private String name;
    private int memberID;
    private int memberSince;
    private double discount = 0;

    // Constructor
    public Member(){
        System.out.println("Parent Constructor with no parameters");
    }

    public Member(String pName, int pMemberID, int pMemberSince){
        System.out.println("Parent Constructor with 3 parameters");
        
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter the admin password: ");
        password = input.nextLine();
        if (! password.equals("abcd")){
            System.out.println("Invalid password. You do not have authority to edit the discount.");
        }
        else{
            System.out.println("Please enter the discount: ");
            discount = input.nextDouble();
        }
    }
    
    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }

    abstract public void  calculateAnnualFee(); // abstract methods can only exist in abstract classes; 
    // abstract methods have no body and must be implemented in the derived class.
}