//Rhombus Pattern in Java --------------------------------------------
/*
Enter Value : 5

Output :

      * * * * *
     * * * * *
    * * * * *
   * * * * *
  * * * * *

*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Define a class named pattern_9
class pattern_9 {
    // Define a public method named Pattern that takes an integer 'n' as a parameter
    public void Pattern(int n) {
        // Outer loop for rows (iterates from 1 to 'n')
        for (int i = 1; i <= n; i++) {
            
            // Inner loop for columns (iterates from 'n' to 'i')
            for (int j = n; j >= i; j--) {
                // Print spaces to create the left-side indentation
                System.out.print(" ");
            }
            
            // Inner loop to print '*' characters for the current row
            for (int k = 1; k <= n; k++) {
                System.out.print(" *"); // Print a space followed by '*'
            }
            
            // Move to the next line after each row to create a new row in the pattern
            System.out.println();
        }
    }
}


public class day_14_Practice_Pattern_9_D01_10_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_9 obj = new pattern_9(); // Create an instance of the pattern_3 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_3 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}