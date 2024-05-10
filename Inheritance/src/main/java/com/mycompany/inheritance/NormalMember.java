package com.mycompany.inheritance;


public class NormalMember extends Member{
    // child class inherits all the public and protected fields and methods from the parent class
    // the child class does not inherit the private fields and methods of the parent class
    public NormalMember(){
        // automatically call the parameterless constructor in parent class first
        System.out.println("Child constructor with no parameter");
    }
    public NormalMember(String pName, int pMemberID, int pMemberSince){
        super(pName, pMemberID, pMemberSince); // have to use super to call parameter constructor in parent class
        // also use parent constructor to access the private fields in parent class
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override // optional bt strongly encouraged
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }
}


