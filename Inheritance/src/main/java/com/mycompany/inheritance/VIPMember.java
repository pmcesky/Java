package com.mycompany.inheritance;


public class VIPMember extends Member{
    public VIPMember(String pName, int pMemberID, int pMemberSince){
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*1200;
    }
}