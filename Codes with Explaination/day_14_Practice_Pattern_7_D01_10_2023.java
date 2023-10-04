//Zero-One Triangle Pattern in Java --------------------------------------------
/*
Enter Value : 4

Output :

1
0 1
1 0 1
0 1 0 1

*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Define a class named pattern_4
class pattern_7 {
    // Define a public method named Pattern that takes an integer 'n' as a parameter
    public void Pattern(int n) {
        // Outer loop for rows (iterates from 1 to 'n')
        int i, j;
        for (i = 1; i <= n; i++) {
            // Inner loop to handle the number of columns
            for (j = 1; j <= i; j++) {
                // if the sum of (i + j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }
            // Printing a new line for each row
            System.out.println();
        }
    }
}


public class day_14_Practice_Pattern_7_D01_10_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_7 obj = new pattern_7(); // Create an instance of the pattern_3 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_3 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}