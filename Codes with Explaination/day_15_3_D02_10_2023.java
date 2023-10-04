// v054 Method Overriding in Java --------------------------------------------

/*
Method overriding is a concept in object-oriented programming where a subclass provides a specific implementation for a method that is already defined in its superclass. This allows the subclass to customize or extend the behavior of the inherited method.

In method overriding:

The method in the subclass must have the same name, return type, and parameter list (method signature) as the method in the superclass.

The subclass method can provide a new implementation that replaces or extends the behavior of the superclass method.

When you call the overridden method on an object of the subclass, the subclass's implementation is executed, rather than the superclass's implementation.

Method overriding is a way to achieve polymorphism, where objects of different classes can respond differently to the same method call based on their actual types. It's a fundamental concept in object-oriented programming, promoting code reusability and flexibility.
*/

// Base class: Calculator
class Calculator5 {
    // Method to perform addition
    int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    public String multiply(int i, int j) {
        return null;
    }

    public String divide(double d, double e) {
        return null;
    }
}

// Subclass 1: AdvancedCalculator (overrides add method)
class AdvancedCalculator extends Calculator5 {
    // Method overriding: Override the add method
    int add(int a, int b) {
        return a + b + 10; // Perform addition with an extra value
    }

    public String square(int i) {
        return null;
    }

    public String cube(int i) {
        return null;
    }
}

// Subclass 2: ScientificCalculator (overrides subtract method)
class ScientificCalculator extends Calculator5 {
    // Method overriding: Override the subtract method
    int subtract(int a, int b) {
        return a - b - 5; // Perform subtraction with a modified value
    }

    public String sqrt(int i) {
        return null;
    }

    public String power(int i, int j) {
        return null;
    }
}

public class day_15_3_D02_10_2023 {
    public static void main(String[] args) {
        // Create instances of the subclasses
        AdvancedCalculator advCalculator = new AdvancedCalculator();
        ScientificCalculator sciCalculator = new ScientificCalculator();

        // Perform addition and subtraction using method overriding
        int result1 = advCalculator.add(10, 5);         // Calls overridden add method
        int result2 = sciCalculator.subtract(20, 8);    // Calls overridden subtract method

        // Display the results
        System.out.println("Result of addition: " + result1);       // Output: 25
        System.out.println("Result of subtraction: " + result2);    // Output: 7
    }
}
