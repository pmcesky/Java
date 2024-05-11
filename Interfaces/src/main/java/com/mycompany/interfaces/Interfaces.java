package com.mycompany.interfaces;


/**
 * Interfaces
 * Interfaces are much like abstract classes in that they can not be instantiated
 * Abstract classes can contain non-abstract methods while Interfaces can not
 * Interfaces must be implemented by classes or extended by other interfaces
 * Till Java 7, Interfaces can only contain abstract methods (implicitly public) and constants (implicitly public static final)
 * Since Java 8, Interfaces can contain static and default methods (not suggested though)  
 * This allows adding methods to interfaces without making changes to the classes that implemented them
 */
interface MyInterface {
    int myInt = 5; // public static final by default
    void someMethod(); // abstract public by default

    public static void someStaticMethod(){
        System.out.println("This is a static method in an interface");
    }

    public default void someDefaultMethod(){ // default methods refer to non-static methods that are implemented in an interface
        System.out.println("This is a default method in an interface");
    }
}

class MyClass implements MyInterface{
    @Override
    public void someMethod(){
        System.out.println("This is a method implemented MyClass");
    }
}


public class Interfaces{
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();
        System.out.println("The value of the constant is " + MyInterface.myInt);
        
        a.someDefaultMethod();
        MyInterface.someStaticMethod();
    }
}