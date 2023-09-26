        //v011 Relational Operators in Java --------------------------------------------
public class day_3_1_D18_09_2023 {
    public static void main (String [] a){

        int num1 = 10;
        int num2 = 5;
        // Equal to
        boolean isEqual = (num1 == num2);
        System.out.println("Is num1 equal to num2? " + isEqual);
        // Not equal to
        boolean isNotEqual = (num1 != num2);
        System.out.println("Is num1 not equal to num2? " + isNotEqual);
        // Greater than
        boolean isGreaterThan = (num1 > num2);
        System.out.println("Is num1 greater than num2? " + isGreaterThan);
        // Less than
        boolean isLessThan = (num1 < num2);
        System.out.println("Is num1 less than num2? " + isLessThan);
        // Greater than or equal to
        boolean isGreaterThanOrEqual = (num1 >= num2);
        System.out.println("Is num1 greater than or equal to num2? " + isGreaterThanOrEqual);
        // Less than or equal to
        boolean isLessThanOrEqual = (num1 <= num2);
        System.out.println("Is num1 less than or equal to num2? " + isLessThanOrEqual);

        //v012 Logical Operators in Java --------------------------------------------
        boolean result1 = (num1 > num2) && (num1 < 15);
        // Using && (Logical AND)
        System.out.println("Result1: " + result1);
        // Result will be true
        boolean result2 = (num1 < num2) || (num1 == 10);
        // Using || (Logical OR)
        System.out.println("Result2: " + result2);
        // Result will be true
        boolean result3 = !(num1 == num2);
        // Using ! (Logical NOT)
        System.out.println("Result3: " + result3);
        // Result will be true because (num1 == num2) is false, and ! negates it to true
        boolean result = (num1 > num2) ^ (num1 < 15);
        // Using XOR (^) operator
        System.out.println("Result: " + result);
        // Result will be false
    }
}
