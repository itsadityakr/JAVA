//Numeral Column Square Pattern in Java --------------------------------------------
/*
Enter Value : 5

Output :

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

// Create a class named pattern_5
class pattern_5 {
    // Define a public method named "Pattern" that takes an integer input
    public void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns (iterates from 1 to 'n')
            for (int j = 1; j <= n; j++) {
                // Print the value of 'j' (the current column number) followed by a space
                System.out.print(j + " ");
            }
            // Move to the next line after each row to create a new row in the pattern
            System.out.println();
        }
    }
}

public class day_13_Practice_Pattern_5_D30_09_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter Value : "); // Print a message to prompt the user for input
        int input = sc.nextInt(); // Read an integer input from the user
        pattern_5 obj = new pattern_5(); // Create an instance of the pattern_1 class
        obj.Pattern(input); // Call the "Pattern" method of the pattern_2 object with the user's input
        sc.close(); // Closes the scanner class to release resources
    }
}
