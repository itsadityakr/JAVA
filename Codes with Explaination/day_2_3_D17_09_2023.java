        //v010 Assignment Operators in Java --------------------------------------------
public class day_2_3_D17_09_2023 {
    public static void main(String[] args) {
        int x = 10;
        // = (Assignment Operator)
        int a = x; // Assigns the value of x to a
        System.out.println("a = " + a);
        // += (Addition Assignment Operator)
        x += 10; // Equivalent to x = x + 10
        System.out.println("x += y: " + x);
        // -= (Subtraction Assignment Operator)
        x -= 5; // Equivalent to x = x - 5
        System.out.println("x -= y: " + x);
        // *= (Multiplication Assignment Operator)
        x *= 2; // Equivalent to x = x * 2
        System.out.println("x *= y: " + x);
        // /= (Division Assignment Operator)
        x /= 10; // Equivalent to x = x / 10
        System.out.println("x /= y: " + x);
        // %= (Modulus Assignment Operator)
        x %= 3; // Equivalent to x = x % 3
        System.out.println("x %= y: " + x);
    }
}
