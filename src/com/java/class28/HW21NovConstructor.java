package com.java.class28;

// Class 1
// Super class
class Parent {
    int value = 1000;

    // Constructor of super class
    Parent()
    {

        // Print statement
        System.out.println("Parent Constructor");
    }
}

// Class 2
// Sub class
class Child extends Parent {

    int value = 10;

    // Constructor of sub class
    Child()
    {

        // Print statement
        System.out.println("Child Constructor");
    }
}