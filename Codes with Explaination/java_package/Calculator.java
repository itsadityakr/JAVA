package java_package;

public class Calculator {
    // Define a method to add two integers.
    public int add(int a, int b) {
        return a + b;
    }

    // Define a method to subtract two integers.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Define a method to multiply two integers.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Define a method to divide two doubles, handling division by zero.
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Return "Not-a-Number" if division by zero occurs.
        }
        return a / b;
    }
}
