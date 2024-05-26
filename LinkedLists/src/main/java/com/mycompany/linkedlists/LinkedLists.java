package com.mycompany.linkedlists;

import java.util.LinkedList;
import java.util.Arrays;

public class LinkedLists {

    public static void main(String[] args) {
        // LinkedList<Integer> userLinkedList = new LinkedList<>();
        // userLinkedList.add(40);
        // userLinkedList.add(53);
        // userLinkedList.add(51);
        // userLinkedList.add(53);
        // we can initialize the list quickly https://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
        LinkedList<Integer> userLinkedList = new LinkedList<>(Arrays.asList(40, 53, 51, 53));
        System.out.println(userLinkedList);
        // LinkedList implements List interface, as well as Queue and Deque interfaces
        // use LinkedList over ArrayList for frequent add/remove elements or use Queue/Deque methods
        // LinkedList has higher memory consumption than ArrayList, as need to store the addresses of the neighboring elements
        // ArrayList is good for element search and memory consumption
        
        // return first element and remove it from the list
        System.out.println(userLinkedList.poll()); // return null is list is empty
        // System.out.println(userLinkedList.pollFirst()); // deque
        System.out.println(userLinkedList); 
        // return last element and remove it from the list
        System.out.println(userLinkedList.pollLast()); // deque
        System.out.println(userLinkedList);
        
        // return first element of the list
        System.out.println(userLinkedList.peek()); // queue, return null if list empty
        System.out.println(userLinkedList.peekFirst()); // deque
        System.out.println(userLinkedList.getFirst()); // almost same as peek(), but gives NoSuchElementException exception if list empty
        // return last element
        System.out.println(userLinkedList.peekLast()); // return null if empty
        System.out.println(userLinkedList.getLast()); // gives NoSuchElementException exception if list empty
    }
}