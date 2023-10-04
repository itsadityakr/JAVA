        // Class definition for the Calculator class
class Calculator {
    // Method definition for the 'add' method
    public int add(int n1, int n2) {
        // Calculate the sum of 'n1' and 'n2'
        int r = n1 + n2;
        // Return the result of the addition
        return r;
    }

    public String subtract(int i, int j) {
        return null;
    }

    public String multiply(int i, int j) {
        return null;
    }
}
public class day_5_1_D20_09_2023 {
    public static void main (String [] a){
        //v023 Class And Object Theory in Java --------------------------------------------
        //v024 Class and Object Practical in Java --------------------------------------------
        // Declare and initialize two integer variables 'num1' and 'num2'
        int num1 = 4;
        int num2 = 5;

        // Create an object 'calc' of the 'Calculator' class
        Calculator calc = new Calculator();

        // Call the 'add' method of the 'calc' object with arguments '4' and '5'
        int result = calc.add(num1, num2);

        // Print the result of the addition
        System.out.println(result);
    }
}