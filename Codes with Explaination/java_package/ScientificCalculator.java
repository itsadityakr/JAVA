package java_package;

// Create another subclass called "ScientificCalculator" that inherits from the "AdvancedCalculator" class.
public class ScientificCalculator extends AdvancedCalculator {
    // Define additional methods for scientific operations.
    
    // Define a method to calculate the square root of a double, handling negative inputs.
    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Error: Square root of a negative number!");
            return Double.NaN; // Return "Not-a-Number" for negative square roots.
        }
        return Math.sqrt(a);
    }

    // Define a method to calculate the power of a base to an exponent.
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

