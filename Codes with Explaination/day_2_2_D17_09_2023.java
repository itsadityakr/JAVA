public class day_2_2_D17_09_2023 {
    public static void main(String[] args) {
                //v009 Type Conversion in Java --------------------------------------------
        // Implicit Type Casting (Widening Conversion)
        int a = 100;
        double b = a; // Implicitly converts int to double
        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("int to double: " + b);
        // Explicit Type Casting (Narrowing Conversion)
        double c = 123.456;
        int d = (int) c; // Explicitly converts double to int
        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("double to int: " + d);
        // Explicit Type Casting with Data Loss
        int  e = 1000;
        byte f = (byte) e; // Explicitly converts int to byte (with potential data loss)
        System.out.println("\nExplicit Type Casting with Data Loss:");
        System.out.println("int to byte: " + f);
        float g = 5.6f;
        int h = (int)g;
        System.out.println(h);
    }
}
