package java_package;
// Create a subclass called "AdvancedCalculator" that inherits from the "Calculator" class.
public class AdvancedCalculator extends Calculator {
    // Define additional methods for advanced operations.
    
    // Define a method to calculate the square of an integer.
    public int square(int a) {
        return a * a;
    }

    // Define a method to calculate the cube of an integer.
    public int cube(int a) {
        return a * a * a;
    }
}