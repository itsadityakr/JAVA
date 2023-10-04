// v056 Access Modifiers in Java --------------------------------------------
//package com.example.myapp;

// Public class accessible from anywhere.
public class day_16_2_D04_10_2023 {

    // Public field accessible from anywhere.
    public int publicField = 10;

    // Protected field accessible within the same package and subclasses.
    protected int protectedField = 20;

    // Default field (package-private) accessible within the same package.
    int defaultField = 30;

    // Private field accessible only within this class.
    private int privateField = 40;

    // Public constructor accessible from anywhere.
    public day_16_2_D04_10_2023() {
        // Constructor code here
    }

    // Protected method accessible within the same package and subclasses.
    protected void protectedMethod() {
        // Method code here
    }

    // Default method (package-private) accessible within the same package.
    void defaultMethod() {
        // Method code here
    }

    // Private method accessible only within this class.
    private void privateMethod() {
        // Method code here
    }

    public static void main(String[] args) {
        // Create an instance of AccessModifiersDemo class.
        day_16_2_D04_10_2023 demo = new day_16_2_D04_10_2023();

        // Access fields and methods from the instance.

        // Public field is accessible from anywhere.
        System.out.println("Public field: " + demo.publicField);

        // Protected field is accessible within the same package and subclasses.
        System.out.println("Protected field: " + demo.protectedField);

        // Default field is accessible within the same package.
        System.out.println("Default field: " + demo.defaultField);

        // Private field is accessible only within this class.
        System.out.println("Private field: " + demo.privateField);

        // Call protected, default, and private methods.
        demo.protectedMethod();
        demo.defaultMethod();
        demo.privateMethod();
    }
}

/*

Certainly! In the provided code, access modifiers are used to control the visibility and accessibility of various class members, including fields, methods, constructors, and the class itself. Let's go through each part of the code and explain how access modifiers are used:

1. `public class AccessModifiersDemo`:
   - The class `AccessModifiersDemo` is declared as `public`, which means it can be accessed from anywhere, both within and outside the package.

2. Field Declarations:
   - `public int publicField = 10;`:
     - `publicField` is declared as `public`, making it accessible from anywhere.
   - `protected int protectedField = 20;`:
     - `protectedField` is declared as `protected`, making it accessible within the same package and by subclasses (even if they are in different packages).
   - `int defaultField = 30;`:
     - `defaultField` has no access modifier (default/package-private), so it is accessible only within the same package.
   - `private int privateField = 40;`:
     - `privateField` is declared as `private`, which means it is accessible only within the `AccessModifiersDemo` class itself.

3. Constructor:
   - `public AccessModifiersDemo()`:
     - The constructor is declared as `public`, allowing it to be accessed from anywhere.

4. Methods:
   - `protected void protectedMethod()`:
     - `protectedMethod` is declared as `protected`, so it is accessible within the same package and by subclasses.
   - `void defaultMethod()`:
     - `defaultMethod` has no access modifier (default/package-private), making it accessible only within the same package.
   - `private void privateMethod()`:
     - `privateMethod` is declared as `private`, meaning it is accessible only within the `AccessModifiersDemo` class itself.

5. `public static void main(String[] args)`:
   - The `main` method is declared as `public`, allowing it to be accessed from anywhere.
   - Inside the `main` method, we create an instance of the `AccessModifiersDemo` class and demonstrate accessing fields and methods with different access modifiers.

In summary, access modifiers are used to control the visibility and accessibility of class members, providing a way to encapsulate and protect data and functionality within a class while allowing controlled access from other parts of the code.

*/