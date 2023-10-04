//Palindrome Triangle Pattern in Java --------------------------------------------
/*
Enter Value : 6

Output :

          1
        2 1 2 
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6

*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Define a class named pattern_8
class pattern_8 {
    // Define a public method named Pattern that takes an integer 'n' as a parameter
    public void Pattern(int n) {
        // Outer loop for rows (iterates from 1 to 'n')
        int i, j;

        // Outer loop to handle the number of rows
        for (i = 1; i <= n; i++) {
            
            // Inner loop to print spaces before the first part of the pattern
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print the first part of the pattern (decreasing numbers)
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Inner loop to print the second part of the pattern (increasing numbers)
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Printing a new line for each row to move to the next row
            System.out.println();
        }
    }
}

public class day_14_Practice_Pattern_8_D01_10_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_8 obj = new pattern_8(); // Create an instance of the pattern_3 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_3 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}