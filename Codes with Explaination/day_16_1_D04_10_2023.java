// v055 Packages in Java --------------------------------------------
import java_package.*;
// import java_package(folder name) to access all classes.
// '*' -> is used to import all the files inside the package
public class day_16_1_D04_10_2023 {
    // Define the main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create instances of the calculator classes.
        Calculator basicCalculator = new Calculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        // Basic Calculator
        System.out.println("Basic Calculator:");
        // Perform basic arithmetic operations using the basic calculator.
        System.out.println("Addition: " + basicCalculator.add(10, 5));
        System.out.println("Subtraction: " + basicCalculator.subtract(10, 5));
        System.out.println("Multiplication: " + basicCalculator.multiply(10, 5));
        System.out.println("Division: " + basicCalculator.divide(10.0, 5.0));

        // Advanced Calculator
        System.out.println("\nAdvanced Calculator:");
        // Perform advanced operations using the advanced calculator.
        System.out.println("Square: " + advancedCalculator.square(5));
        System.out.println("Cube: " + advancedCalculator.cube(3));

        // Scientific Calculator
        System.out.println("\nScientific Calculator:");
        // Perform scientific operations using the scientific calculator.
        System.out.println("Square Root: " + scientificCalculator.sqrt(25));
        System.out.println("Power: " + scientificCalculator.power(2, 3));
    }
}
