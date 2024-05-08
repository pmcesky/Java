package com.mycompany.classes;

public class Staff {
    // fields
    private String nameOfStaff;
    private final int hourlyRate = 30; // variable declared as final must initialized at declaration or within the constructor
    private int hoursWorked;

    // methods
    public void printMessage(){
        System.out.println("Calculating Pay...");
    }

    public int calculatePay(){
        printMessage();
        int staffPay; // local variable, only exist within the method
        staffPay = hoursWorked * hourlyRate; // methods can access all the fields declared inside the class
        if (hoursWorked > 0){
            return staffPay;
        }
        else{
            return -1;
        }
    }

    // overloading
    public int calculatePay(int bonus, int allowance){
        printMessage();
        if (hoursWorked > 0 ){
            return hoursWorked*hourlyRate + bonus + allowance;
        }
        else{
            return 0;
        }
    }

    // setter
    public void setHoursWorked(int hours){
        if (hours>0){
            hoursWorked = hours;
        }
        else{
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero.");
            System.out.println("Error: HoursWorked is not updated.");
        }
    }
    // getter
    public int getHoursWorked(){
        return hoursWorked;
    }

    public String getNameOfStaff(){
        return nameOfStaff;
    }

    // constructor
    public Staff(String name){ // same name as the class; constructor has no return but no need to add void for a constructor
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }

    // another constructor, overloading
    public Staff(String firstName, String lastName){
        nameOfStaff = firstName+" "+ lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }
}
