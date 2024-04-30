package com.mycompany.variables;

public class Variables {
    public static void main(String[] args) {
        // Primitive Data Types in Java
        byte userAge = 20; //int8, -128 to 127
        short numberOfStudents = 45; // int16, -32768 to 32767
        int numberOfEmployees = 500; // int32
        long numberOfInhabitants = 21021313012678L; // int64

        float hourlyRate = 60.5F;
        double numberOfHours = 5120.5;

        char grade = 'A'; // char must use single quote
        boolean promote = true;

        byte level = 2, userExperence = 5;

        byte year;
        year = 20;

        // Type casting
        // widening primitive data conversion
        short age = 10;
        double myDouble = age;
        // narrowing primitive data conversion
        int x = (int) 20.9;
        float num1 = (float) 20.9;
    }
}