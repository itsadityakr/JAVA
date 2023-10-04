//Square Hollow Pattern in Java --------------------------------------------
/*
Enter Value : 6

Output :

*  *  *  *  *  *
*              *
*              *
*              *
*              *
*  *  *  *  *  *
*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Create a class named pattern_2
class pattern_2 {
    // Define a public method named "Pattern" that takes an integer input
    public void Pattern(int n) {
        int i, j;
        // Outer loop to handle the number of rows
        for (i = 0; i < n; i++) {
            // Inner loop to handle the number of columns
            for (j = 0; j < n; j++) {
                // Star will print only when it is in the first row, last row, first column, or last column
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*  "); // Print an asterisk followed by two spaces
                } else {
                    System.out.print("   "); // Otherwise, print three spaces
                }
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}

public class day_12_Practice_Pattern_2_D29_09_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_2 obj = new pattern_2(); // Create an instance of the pattern_1 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_2 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}
