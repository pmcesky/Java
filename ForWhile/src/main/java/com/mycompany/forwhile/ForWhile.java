package com.mycompany.forwhile;

public class ForWhile{
    public static void main(String[] args){
        // For statement
        for (int i = 0; i<5; i++){
            System.out.print(i+"\t");
            // Local variables are declared in methods, constructors, or blocks (all block variables are local variables).
            // What ever the variables declared inside the block ,the scope restricted to that block.
            // so local variables like "i" or some local variables declared within this for block will only exist within this for block.
        }
        System.out.println();

        int[] myNumber = {10, 20, 30, 40, 50};
        for (int i = 0; i < myNumber.length; i++){
            System.out.print(myNumber[i]+"\t");
        }
        System.out.println();
        // enhanced for statement when working with arrays and Collections
        for (int item : myNumber){ 
            System.out.print(item+"\t");
        }
        System.out.println();


        // While statement
        int counter = 5;
        while (counter >0){
            System.out.println("Counter = "+counter);
            counter -= 1;
        }

        // do-while statement
        int num = 100;
        do { // code within the curly braces of do-while statement is executed at least once regardless of test condition
            System.out.println("num = " + num);
            num++;
        }   while (num < 0); // ";" is required after the test condition
        System.out.println();
        
        // break
        for (int i = 0; i < 5; i++){
            System.out.println("i = "+i);
            if (i == 2) 
                break;
        }
        System.out.println();

        // continue
        for (int i = 0; i<5; i++){
            System.out.println("i = "+i);
            if (i == 2) 
                continue;
            System.out.println("This will not be printed if i = 2.");
        }
    }
}