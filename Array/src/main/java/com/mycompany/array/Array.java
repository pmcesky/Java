package com.mycompany.array;

import java.util.Arrays;

public class Array{
    public static void main(String[] args){
        int[] userAge;
        userAge = new int[] {21, 22, 23, 24, 25};
        userAge[0] = 31;
        userAge[2] = userAge[2]+20;
        int[] userAge2 = {21, 22, 23, 24, 25};
        int[] userAge3 = new int[5];
        System.out.println(Arrays.toString(userAge));
        System.out.println(Arrays.toString(userAge2));
        System.out.println(Arrays.toString(userAge3));
        
        System.out.println(userAge.equals(userAge3));
        System.out.println(Arrays.equals(userAge, userAge2));

        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int [] dest = Arrays.copyOfRange(source, 3, 7);
        System.out.println(Arrays.toString(dest));
        
        // Sort (in place)
        int [] numbers2 = {12, 1, 5, -2, 16, 14};
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // Binary search
        int [] myInt = {21, 23, 34, 45, 56, 78, 99};
        int foundIndex = Arrays.binarySearch(myInt, 78);
        System.out.println(foundIndex);
        int foundIndex2 = Arrays.binarySearch(myInt, 39);
        System.out.println(foundIndex2);

        System.out.println(myInt.length);
    }
}