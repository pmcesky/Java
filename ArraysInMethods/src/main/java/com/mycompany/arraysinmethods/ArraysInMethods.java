package com.mycompany.arraysinmethods;

import java.util.Arrays;

class MyClass{
    public void printFirstElement(int[] a){
        System.out.println("The first element is " + a[0]);
    }

    public int[] returnArray(){
        int[] a = new int[3];
        for (int i = 0; i<a.length; i++){
            a[i] = i*2;
        }
        return a;
    }

    public void passPrimitive(int primitivePara){
        primitivePara = 10;
        System.out.println("Value inside method = " + primitivePara);
    }

    public void passReference(int[] refPara){
        refPara[1] = 5;
        System.out.println("Value inside method = " + refPara[1]);
    }
}

public class ArraysInMethods {

    public static void main(String[] args) {
        MyClass amd = new MyClass();
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        amd.printFirstElement(myArray);
        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));
        
        // Pass Primitive types parameters
        int number = 2;
        System.out.println("\nPass Primitive type parameters:");
        System.out.println("number before = " + number);
        // when passing a primitive type variable to a method, the value of the variable (not the variable address) is passed\
        // any changes to the variable is only valid within the method itself 
        amd.passPrimitive(number); // same as amd.passPrimitive(2)
        System.out.println("number after = " + number);
        

        System.out.println("\n");

        // Pass Reference type parameters
        System.out.println("Pass Reference type parameters:");
        System.out.println("myArray[1] before = " + myArray[1]);
        // when passing a reference type variable to a method, the address of the variable is passed, the compiler can go the address and make changes to the variable
        // any changes to the variable is valid even after the method ends
        amd.passReference(myArray);
        System.out.println("myArray[1] after = " + myArray[1]);

        // String is a reference type, but is immutable,
        // Whenever we update a String variable, we are actually creating a new string and assigning the memory address to the String variable
        System.out.println("\nStrings are immutable:");
        String message = "Hello";
        System.out.println("message = " + message);
        message = "World";
        System.out.println("message = " + message);

    }
}