        //v026 Methods in Java --------------------------------------------
        //v027 Method Overloading in Java --------------------------------------------
// Define a class named Calculator1
class Calculator1 {
    // Method Overloading Example:

    // Method to add three integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method to add two integers
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method to add a double and an integer
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class day_5_2_D20_09_2023 {
    public static void main(String[] args) {
        // Create an object (instance) of the Calculator1 class
        Calculator1 obj = new Calculator1();

        // Call the 'add' method with two integer arguments (method with two int parameters is invoked)
        int r1 = obj.add(3, 4);

        // Print the result
        System.out.println(r1);
    }
}