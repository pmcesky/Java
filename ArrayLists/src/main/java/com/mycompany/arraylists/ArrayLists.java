package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays; // to use array methods


public class ArrayLists {

    public static void main(String args[]){
        // ArrayList is a pre-written class that implements the List interface
        // it acts as a resizable array
        ArrayList<Integer> userAgeList = new ArrayList<>();
        // LinkedList<Integer> userAgeList = new LinkedList<>(); // Replace the above line, everything runs perfectly and outputs same result
        // // both LinkedList and ArrayList classes implement the List interface. Hence a lot of methods are common to both classes
        // // But LinkedList class also implements the Queue and Deque interface, so it has some additional methods that are missing in the List interface and the ArrayList class 
        
        // add members
        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        System.out.println(userAgeList);
        // add member at a specific position
        userAgeList.add(2, 51); 
        System.out.println(userAgeList);
        // replace an element at a specific position
        userAgeList.set(3, 49);
        System.out.println(userAgeList);
        // remove member at a specific position
        userAgeList.remove(3);
        System.out.println(userAgeList);
        // get the element at a specific position
        System.out.println(userAgeList.get(2));
        // System.out.println(userAgeList[2]); // "[ ]" only works for array type, not ArrayList
        // number of elements in the list
        System.out.println(userAgeList.size());
        // contains a certain number or not
        System.out.println(userAgeList.contains(51));
        System.out.println(userAgeList.contains(12));
        // indexOf
        System.out.println(userAgeList.indexOf(51)); // get the index of the first occurrence of the element
        System.out.println(userAgeList.indexOf(12)); // return -1 if element does not exist in the list

        // to array
        Object[] myArray = userAgeList.toArray(); // to an Object[] array
        System.out.println(Arrays.toString(myArray)); // to print an array
        Integer[] myIntArray = userAgeList.toArray(new Integer[0]);
        // int[] myIntArray = userAgeList.toArray(new int[0]); // this throws exception
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(myIntArray[0]); // we can use "[ ]" to access array element at a specific index

        // remove all items in a list
        userAgeList.clear();
        System.out.println(userAgeList);
    }
}