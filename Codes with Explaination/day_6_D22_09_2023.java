    //v028 Stack And Heap in Java --------------------------------------------
    //Global Variables and Local Variables --------------------------------------------
// Define a class named Calculator3
class Calculator3 {
    // Global Variable (Instance Variable)
    int num = 5;

    // Method to add two numbers
    public int add(int n1, int n2) {
        // Access the global variable 'num' inside the method
        System.out.println(num);
        return n1 + n2;
    }
}

public class day_6_D22_09_2023 {
    public static void main(String[] args) {
        // Local Variable: 'data' is declared and initialized inside the main method
        int data = 10;

        // Create two objects (instances) of the Calculator3 class
        Calculator3 obj = new Calculator3();
        Calculator3 obj1 = new Calculator3();

        // Call the 'add' method of the 'obj' instance with arguments 3 and 4
        int r1 = obj.add(3, 4);

        // Change the value of the global variable 'num' in the 'obj' instance to 8
        obj.num = 8;

        // Print the updated value of 'num' in the 'obj' instance
        System.out.println(obj.num);

        // Print the value of 'num' in the 'obj1' instance (it remains unchanged, so it's 5)
        System.out.println(obj1.num);
        System.out.println(data);
        System.out.println(r1);
    }
}
