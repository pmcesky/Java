package com.mycompany.switchcase;

import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase(); // "input.nextLine()" returns a String
        
        // Old Switch-Case syntax
        switch (userGrade){
            case "A+":
            case "A":
                System.out.println("Distinction");
                System.out.println("Well Done");
                break; // when a certain case is satisfied, everything starting from the next line is executed until "break"
            case "B":
                System.out.println("B Grade");
                break;
            case "C":
                System.out.println("C Grade");
                break;
            default:
                System.out.println("Fail");
        }
        System.out.println("");

        // Simplified Switch-Case syntax since Java 12
        switch (userGrade){
            case "A+", "A" ->{ // combine multiple cases using a comma
                System.out.println("Distinction");
                System.out.println("Well Done!"); // "break" is no longer needed after each case
            }
            case "B" -> System.out.println("B Grade");
            case "C" -> System.out.println("C Grade");
            default -> System.out.println("Fail"); // default case is optional in a switch statement
        }

        // assign values using switch expressions
        int num = -1;
        char group = switch(num){
            case 1, 2, 3 -> 'A';
            case 4, 5 -> 'B';
            default -> 'C'; // default case is necessary in a switch expression to cover all possible input values
        }; // enclose entire statement with ";"
        System.out.println("\ngroup = "+group);
    }
}