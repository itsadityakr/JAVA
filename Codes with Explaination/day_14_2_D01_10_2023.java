//v050 Need of Inheritance in Java --------------------------------------------
/*
Inheritance is a fundamental concept in object-oriented programming, including Java. It allows you to create new classes (subclasses or child classes) that inherit properties and behaviors from existing classes (superclasses or parent classes).
*/

//v051 What is Inheritance in Java --------------------------------------------

// Define a class named Calc1
class Calc1 {
    // Method to add two integers
    public int add(int m, int n) {
        return m + n;
    }

    // Method to subtract two integers
    public int sub(int m, int n) {
        return m - n;
    }
}

// Define a class named AdvCalc1 that extends Calc1 (Inherits from Calc1)
class AdvCalc1 extends Calc1 {
    // Method to multiply two integers (Inherited from Calc1)
    public int multi(int m, int n) {
        return m * n;
    }

    // Method to divide two integers (Inherited from Calc1)
    public int div(int m, int n) {
        return m / n;
    }
}

// Main class
class day_14_2_D01_10_2023 {
    public static void main(String[] args) {
        // Create an object of AdvCalc1 class
        AdvCalc1 obj = new AdvCalc1();
        
        // Use methods from both AdvCalc1 and Calc1 classes
        int r1 = obj.add(4, 7);     // Calling add method from Calc1
        int r2 = obj.sub(56, 32);   // Calling sub method from Calc1
        int r3 = obj.multi(3, 9);   // Calling multi method from AdvCalc1
        int r4 = obj.div(92, 8);    // Calling div method from AdvCalc1
        
        // Print the results
        System.out.println(r1);  // Output: 11 (Result of add method from Calc1)
        System.out.println(r2);  // Output: 24 (Result of sub method from Calc1)
        System.out.println(r3);  // Output: 27 (Result of multi method from AdvCalc1)
        System.out.println(r4);  // Output: 11 (Result of div method from AdvCalc1)
    }
}
