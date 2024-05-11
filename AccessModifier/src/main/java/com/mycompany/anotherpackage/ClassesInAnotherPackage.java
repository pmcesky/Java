package com.mycompany.anotherpackage;

import com.mycompany.accessmodifier.AccessModifier;

public class ClassesInAnotherPackage{
    // just an empty class
}

class MyClassC extends AccessModifier{
    public void printMessages(){
        // This is ok
        System.out.println(publicNum);

        // This is ok --- derived class
        System.out.println(protectedNum);

        // // This is not ok --- not in the same package
        // System.out.println(packagePrivateNum);

        // // This is not ok
        // System.out.println(privateNum);
    }
}

class MyClassD{
    public void printMessages(){
        AccessModifier p = new AccessModifier();

        // This is ok
        System.out.println(p.publicNum);

        // // This is Not ok --- not in the same package or a derived class
        // System.out.println(p.protectedNum);

        // // This is Not ok --- not in the same package
        // System.out.println(p.packagePrivateNum);
        
        // // This is Not ok --- class private
        // System.out.println(p.privateNum);
    }
}