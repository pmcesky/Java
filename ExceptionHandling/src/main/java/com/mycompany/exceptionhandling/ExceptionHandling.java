package com.mycompany.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling{
    public static void main(String[] args){
        int num, deno;

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Please enter the numerator: ");
            num = input.nextInt();
            System.out.print("Please enter the denominator: ");
            deno = input.nextInt();
            System.out.println("The result is " + num/deno);
        } catch (Exception e) { // Exception is a pre-written class in Java that handles all general errors
            System.out.println(e.getMessage()); // display error message
        }
        finally{ // the finally block is always executed regardless of whether try or catch block is executed
            System.out.println("---- End of the Error Handling Example ----");
        }
        

        System.out.println("\nCatch Specific Errors:");
        int choice;
        int[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.print("Please enter the index of the array: ");
        try {
            choice = input.nextInt();
            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException and Exception are from java.lang and are imported by default in all Java programs 
            System.out.println("Error: Index is invalid.");
        } catch (InputMismatchException e){ // InputMismatchException is from java.util package and must be imported before use
            System.out.println("Error: You did not enter an integer.");
        } catch (Exception e){ // catch general errors
            System.out.println(e.getMessage());
        }

        
        System.out.println("\nThrow an Exception:");
        int choose;
        System.out.print("Please enter the index of the array: ");
        try {
            choose = input.nextInt();
            if (choose == 0) // self-defined conditions for when an error should occur
                throw new ArrayIndexOutOfBoundsException();
            System.out.printf("numbers[%d] = %d%n", choose, numbers[choose]);
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException and Exception are from java.lang and are imported by default in all Java programs 
            System.out.println("Error: Index is invalid."); // this line would print if index choose out of bounds or choose == 0 as we defined
        } catch (InputMismatchException e){ // InputMismatchException is from java.util package and must be imported before use
            System.out.println("Error: You did not enter an integer.");
        } catch (Exception e){ // catch general errors
            System.out.println(e.getMessage());
        }
    }
}