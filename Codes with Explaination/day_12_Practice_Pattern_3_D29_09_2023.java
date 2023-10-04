//Diamond Pattern in Java --------------------------------------------
/*
Enter Value : 6

Output :

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

*/

// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Create a class named pattern_3
class pattern_3 {
    // Define a public method named "Pattern" that takes an integer input
    public void Pattern(int n) {
        int i, j; // Declare integer variables i and j for loop control.

        // Outer loop to handle the upper part of the pattern
        for (i = 1; i <= n; i++) { // Loop through rows from 1 to 'n'
            // Inner loop to print leading spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print a space for leading spaces
            }
            // Inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Print a star for the upper part
            }
            System.out.println(); // Move to the next line after each row is printed
        }

        // Outer loop to handle the lower part of the pattern
        for (i = n - 1; i >= 1; i--) { // Loop through rows from 'n-1' to 1
            // Inner loop to print leading spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print a space for leading spaces
            }
            // Inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Print a star for the lower part
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}

public class day_12_Practice_Pattern_3_D29_09_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_3 obj = new pattern_3(); // Create an instance of the pattern_3 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_3 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}