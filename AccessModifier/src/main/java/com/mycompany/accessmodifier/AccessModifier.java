package com.mycompany.accessmodifier;

public class AccessModifier{
    public int publicNum = 2; // accessible anywhere
    protected int protectedNum = 3; // accessible by the declared class, derived classes, and classes/files in the same package
    int packagePrivateNum = 4; // a field declared without any access modifier is package-private by default, accessible to all files in the same package
    private int privateNum = 1; // class private --- only accessible in the declared class itself
}