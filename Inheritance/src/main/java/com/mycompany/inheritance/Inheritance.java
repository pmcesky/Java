package com.mycompany.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
        
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemInfo();
        System.out.println();
        mem2.displayMemInfo();

        System.out.println();
        mem1.setDiscount(); // admin password is "abcd"
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();

        System.out.println();
        System.out.println(mem1.getDiscount());
        System.out.println(mem2.getDiscount());


        System.out.println();


        // Polymorphism
        Member[] clubMembers = new Member[6]; // we can assign child class objects to the array
        clubMembers[0] =  new NormalMember("James", 1, 2010);
        clubMembers[1] =  new NormalMember("Andy", 2, 2011);
        clubMembers[2] =  new NormalMember("Bill", 3, 2011);
        clubMembers[3] =  new VIPMember("Carol", 4, 2012);
        clubMembers[4] =  new VIPMember("Evelyn", 5, 2012);
        clubMembers[5] =  new VIPMember("Yvonne", 6, 2013);
        System.out.println();
        for (Member m : clubMembers){
            m.calculateAnnualFee(); // the program is smart enough to use the correct method based on the runtime class type of the object
            m.displayMemInfo();
            System.out.println();
        }
    }
}
