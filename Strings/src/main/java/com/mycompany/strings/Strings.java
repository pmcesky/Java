package com.mycompany.strings;

import java.util.Arrays;

public class Strings{ 
    public static void main(String[] args){
        String message = "Hello World";
        String myName = message + ", my name is Jamie";
        System.out.println(myName);
        
        System.out.println(myName.length());
        int mylength = "Hello World".length();
        System.out.println(mylength);

        String uCase  = "Hello World".toUpperCase();
        System.out.println(uCase);

        String firstSubString = "Hello World".toUpperCase().substring(6);
        System.out.println(firstSubString);
        String secondSubString = message.substring(1, 8);
        System.out.println(secondSubString);

        char myChar = message.charAt(1);
        System.out.println(myChar);

        boolean equalsOrNot = message==myName;
        System.out.println(equalsOrNot);

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
        System.out.println(Arrays.toString(splitNames)); // use this
        System.out.println(splitNames.toString());// this passed compilation but does not show the string format output, use above
        // https://stackoverflow.com/questions/13780374/why-tostring-method-works-differently-between-array-and-arraylist-object-in-ja
    }
}