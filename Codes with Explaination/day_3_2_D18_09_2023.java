        //v013 If else in Java --------------------------------------------
        //v014 If Else If in Java --------------------------------------------
        //v016 Switch Statement in Java --------------------------------------------
public class day_3_2_D18_09_2023 {
    public static void main (String [] a){
        int num1 = 10;
        int num2 = 5;
        // Using if statement
        if (num1 > num2) {
            System.out.println("num1 is greater than num2.");
        }
        // Using if-else statement
        if (num1 < num2) {
            System.out.println("num1 is less than num2.");
        } else {
            System.out.println("num1 is not less than num2.");
        }
        // Using if-else if-else statement
        if (num1 == num2) {
            System.out.println("num1 is equal to num2.");
        } else if (num1 > num2) {
            System.out.println("num1 is greater than num2.");
        } else {
            System.out.println("num1 is less than num2.");
        }
        // Using switch statement
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("You chose option 1.");
                break;
            case 2:
                System.out.println("You chose option 2.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        //v015 Ternary Operator in Java --------------------------------------------
        int num3 = 15;
        String result;
        if (num3 % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        // Using ternary operator to achieve the same result
        result = (num3 % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num3 + " is " + result + ".");
        //v017 What's new in Java Switch Statement and Expression --------------------------------------------
        int day = 2;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                yield "Weekday";
            }
            case 6, 7 -> {
                yield "Weekend";
            }
            default -> {
                yield "Invalid day";
            }
        };
        System.out.println("The day " + day + " is a " + dayType + ".");
    }
}
