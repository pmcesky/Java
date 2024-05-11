package com.mycompany.accessmodifier;

public class ClassesInSamePackage {
    // just an empty class
}

class ClassA extends AccessModifier{ // a derived class can access any public and protected fields in the parent class
    public void printMessages(){
        // This is ok
        System.out.println(publicNum);

        // This is ok --- derived class or in same package
        System.out.println(protectedNum);

        // This is ok --- in same package
        System.out.println(packagePrivateNum); // this is ok as the files are inside the same package

        // // This is Not ok --- class private
        // System.out.println(privateNum);
    }
}

class ClassB{
    public void printMessages(){
        AccessModifier p = new AccessModifier();

        // This is ok
        System.out.println(p.publicNum);

        // This is ok --- in same package
        System.out.println(p.protectedNum);

        // This is ok --- in same package
        System.out.println(p.packagePrivateNum);

        // // This is Not ok --- class private
        // System.out.println(p.privateNum);
    }
}