public class day_2_1_D17_09_2023 {
    public static void main (String[] a){
        //v007 Datatype --------------------------------------------
        // byte (8 bits)
        byte myByte = 127; // Range: -128 to 127
        System.out.println("byte: " + myByte);
        // short (16 bits)
        short myShort = 32767; // Range: -32,768 to 32,767
        System.out.println("short: " + myShort);
        // int (32 bits)
        int myInt = 2147483647; // Range: -2^31 to (2^31 - 1)
        System.out.println("int: " + myInt);
        // long (64 bits)
        long myLong = 9223372036854775807L; // Range: -2^63 to (2^63 - 1)
        System.out.println("long: " + myLong);
        // float (32 bits)
        float myFloat = 123.45f; // Range: Approximately ±3.4E+38
        System.out.println("float: " + myFloat);
        // double (64 bits)
        double myDouble = 12345.6789; // Range: Approximately ±1.7E+308
        System.out.println("double: " + myDouble);
        // char (16 bits)
        char myChar = 'A'; // Represents Unicode characters
        System.out.println("char: " + myChar);
        // boolean (size not explicitly defined)
        boolean myBoolean = true; // Can be true or false
        System.out.println("boolean: " + myBoolean);
        //v008 Literals --------------------------------------------
        // Integer Literals
        int decimalLiteral = 42;
        int octalLiteral = 052;
        int hexadecimalLiteral = 0x2A;
        System.out.println("Integer Literals:");
        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hexadecimal Literal: " + hexadecimalLiteral);
        // Floating-Point Literals
        float floatLiteral = 3.14f;
        double doubleLiteral = 2.71828;
        System.out.println("\nFloating-Point Literals:");
        System.out.println("Float Literal: " + floatLiteral);
        System.out.println("Double Literal: " + doubleLiteral);
        // Character Literal
        char charLiteral = 'A';
        System.out.println("\nCharacter Literal:");
        System.out.println("Char Literal: " + charLiteral);
        // String Literal
        String stringLiteral = "Hello, World!";
        System.out.println("\nString Literal:");
        System.out.println("String Literal: " + stringLiteral);
        // Boolean Literals
        boolean trueLiteral = true;
        boolean falseLiteral = false;
        System.out.println("\nBoolean Literals:");
        System.out.println("True Literal: " + trueLiteral);
        System.out.println("False Literal: " + falseLiteral);
        // Null Literal
        String nullLiteral = null;
        System.out.println("\nNull Literal:");
        System.out.println("Null Literal: " + nullLiteral);
    }
}
