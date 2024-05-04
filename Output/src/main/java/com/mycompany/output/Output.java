package com.mycompany.output;


public class Output{
    public static void main(String [] args){
        System.out.println("Hello ");
        System.out.println("How are you?");
        
        System.out.print("Hello ");
        System.out.print("How are you?");

        System.out.println("Hi, my name is Jamie.");

        int number = 30;
        System.out.println(number);

        System.out.println(30+5);
        System.out.println("Oracle".substring(1,4)); // "rac"
        System.out.println("Hello, " + "how are you?" + " I love Java.");

        int results = 79;
        System.out.println("You scored " + results + " marks for your test.");

        System.out.println("The sum of 50 and 2 is " + (50+2) + ".");

        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");
        System.out.println('\\');
        System.out.println("I am 5'9\" tall");
        
        System.out.println("The answer for 5.45 divided by 3 is "+(5.45/3));
        System.out.println("The answer for "+ 5.45 + " divided by " + 3 + " is " + (5.45/3));
        
        System.out.printf("The answer for %.3f divided by %d is %.2f.\n", 5.45, 3, 5.45/3); // note here use "printf"
        System.out.printf("%d\n",12); // "printf" does not comes with "\n" at the end of the line
        System.out.printf("%d%n%d\n", 12, 3); // %n is newline converter
        System.out.printf("%8d\n",12);
        System.out.printf("%8.2f\n", 12.4);
        System.out.printf("%,d\n", 12345); // "," is the thousands separator
        System.out.printf("%,.2f\n", 12345.56789);
    }
}