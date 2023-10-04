// v052 Single and Multilevel inheritance in java --------------------------------------------
// Single level inheritance in java
// Define a class named Calc1
class Calc1 {
    // Method to add two integers
    public int add(int m, int n) {
        return m + n;
    }

    // Method to subtract two integers
    public int sub(int m, int n) {
        return m - n;
    }
}
// Define a class named AdvCalc1 that extends Calc1 (Inherits from Calc1)
class AdvCalc1 extends Calc1 {
    // Method to multiply two integers (Inherited from Calc1)
    public int multi(int m, int n) {
        return m * n;
    }

    // Method to divide two integers (Inherited from Calc1)
    public int div(int m, int n) {
        return m / n;
    }
}
//Multilevel inheritance in java

class VeryAdvCalc1 extends AdvCalc1{
    // Method to find power of two integers (Inherited from AdvCalc1)
    public double power(int m,int n){
        return Math.pow(m, n);
    }
}

// Main class
class day_15_1_D02_10_2023 {
    public static void main(String[] args) {
        // Create an object of VeryAdvCalc1 class
        VeryAdvCalc1 obj = new VeryAdvCalc1();
        
        // Use methods from VeryAdvCalc1, AdvCalc1 and Calc1 classes
        int r1 = obj.add(4, 7);     // Calling add method from Calc1
        int r2 = obj.sub(56, 32);   // Calling sub method from Calc1
        int r3 = obj.multi(3, 9);   // Calling multi method from AdvCalc1
        int r4 = obj.div(92, 8);    // Calling div method from AdvCalc1
        double r5 = obj.power(4,2);
        
        // Print the results
        System.out.println(r1);  // Output: 11 (Result of add method from Calc1)
        System.out.println(r2);  // Output: 24 (Result of sub method from Calc1)
        System.out.println(r3);  // Output: 27 (Result of multi method from AdvCalc1)
        System.out.println(r4);  // Output: 11 (Result of div method from AdvCalc1)
        System.out.println(r5);  // Output: 16.0 (Result of power method from VeryAdvCalc1)
    }
}
