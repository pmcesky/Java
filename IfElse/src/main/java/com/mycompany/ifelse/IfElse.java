package com.mycompany.ifelse;

import java.util.Scanner;

import javax.swing.text.Style;

public class IfElse{
    public static void main(String[] args){
        // Ternary operator ?
        int myNum = 3>2 ? 10 : 5; 
        System.out.println("myNum = " + myNum);
        
        // if-else
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge <0 || userAge > 100){
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        }
        else if (userAge < 18) System.out.println("Sorry you are underage"); // curly braces are optional if there is only one statement to execute
        else if (userAge<21) System.out.println("You need parental consent");
        else{
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event!");
        }
    }
}