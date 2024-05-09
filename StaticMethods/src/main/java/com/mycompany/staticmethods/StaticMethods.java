package com.mycompany.staticmethods;


class MyClass{
    // non-static field and method
    public String message = "Hello World"; // in practice, fields should be made private and access via setter/getter
    public void displayMessage(){
        System.out.println("Message = " + message);
    }
    // static field and method
    public static String greetings = "Good morning";
    public static void displayGreetings(){
        System.out.println("Greetings = " + greetings);
    }
}


public class StaticMethods {

    public static void main(String[] args){
        MyClass sd = new MyClass();
        System.out.println(sd.message);
        sd.displayMessage();
        System.out.println(sd.greetings);
        sd.displayGreetings();

        // Access Static Field and Method using class name directly
        System.out.println("\n" + MyClass.greetings);
        MyClass.displayGreetings();

        // Some pre-written methods in Java are declared as static.
        // For instance, Arrays.sort()
    }
}