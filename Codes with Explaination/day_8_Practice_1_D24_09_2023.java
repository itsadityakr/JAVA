/*Easy Questions---------------------------
1.	Variables in Java
Create a Java program that declares two variables, num1 and num2, and assigns values 10 and 20 to them. Then, calculate and print their sum.
2.	Data Types in Java
Write a Java program that demonstrates the use of different data types (int, double, char, boolean). Initialize variables of each type with values and display them.
3.	If-Else in Java
Create a Java program that takes an integer as input and checks if it's even or odd. Print "Even" if it's even, and "Odd" if it's odd.
Intermediate Questions---------------------
4.	Switch Statement in Java
Write a Java program that takes a number between 1 and 7 as input (representing days of the week) and uses a switch statement to print the corresponding day name.
5.	For Loop in Java
Implement a Java program to calculate the factorial of a given number using a for loop. Display the result.
6.	Methods in Java
Create a Java class with a method that calculates and returns the area of a circle given its radius. Then, use this method to calculate and display the area of a circle with a radius of 5.0.*/
// Importing the Scanner class to take user input
import java.util.Scanner;
// Define a class named "a_Circle" for Circle calculations
class a_Circle {
    //("--------------------------- :Q6 (Class): ---------------------------");
    // Define a method for calculating the area of a circle based on its radius
    public double calculation_1(int radius) {
        // Calculate the area using the formula A = πr^2
        // Math.pow is used to raise the radius to the power of 2
        // Math.PI provides the value of π (approximately 3.141592653589793)
        return Math.pow(radius, 2) * Math.PI;
    }
}
// Main class for the program
public class day_8_Practice_1_D24_09_2023 {
    public static void main(String[] args) {

        System.out.println("--------------------------- :Q1: ---------------------------");
        // Simple addition of two numbers
        int num1 = 10, num2 = 20;
        System.out.println("Sum is : " + (num1 + num2)); // Print the sum

        System.out.println("--------------------------- :Q2: ---------------------------");
        // Declare and initialize variables of different data types
        int intValue = 42;
        double doubleValue = 3.14159;
        char charValue = 'A';
        boolean booleanValue = true;

        // Print the values of the variables
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

        System.out.println("--------------------------- :Q3: ---------------------------");
        // Check if a number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int input = sc.nextInt(); // Read user input

        if (input % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println("--------------------------- :Q4: ---------------------------");
        // Print the day of the week based on user input
        System.out.print("Enter a number between 1-7 : ");
        int days_input = sc.nextInt(); // Read user input

        switch (days_input) {
            case 1 -> System.out.println("QSunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter a number between 1-7");
        }

        System.out.println("--------------------------- :Q5: ---------------------------");
        // Calculate the factorial of a number
        System.out.print("Enter a number to find factorial : ");
        int f_input = sc.nextInt(); // Read user input
        int fact = 1;

        // Calculate the factorial using a loop
        for (int i = 1; i <= f_input; i++) {
            fact = fact * i;
        }

        // Print the factorial result
        System.out.println("Factorial of " + f_input + " is " + fact);

        System.out.println("--------------------------- :Q6: ---------------------------");
        // Calculate the area of a circle
        System.out.print("Radius : ");
        int radius_input = sc.nextInt(); // Read user input
        a_Circle obj = new a_Circle(); // Create an instance of the Circle class

        // Calculate the area using the Circle class method
        double result = obj.calculation_1(radius_input);
        float result_f = (float) result; // Convert the result to float

        // Print the result
        System.out.print("Area of the circle with radius " + radius_input + " is " + result_f);
        // Close the Scanner object to prevent resource leak
        sc.close();
    }
}

