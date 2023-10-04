//v041 Static Blocks in Java --------------------------------------------
class Mobile2 {
    String brand;    // Declaration of instance variable 'brand' to store the mobile's brand name.
    int price;       // Declaration of instance variable 'price' to store the mobile's price.
    static String name; // Declaration of static variable 'name' to store a common name for all mobiles.

    public Mobile2() {
        // Constructor: Initializes instance variables and displays a message.
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }

    static {
        // Static Block: Initializes the static variable 'name' and displays a message.
        name = "Fold4";
        System.out.println("Inside Static Block");
    }

    public void show() {
        // Method to display mobile details including brand, price, and common name.
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class day_11_2_D28_09_2023 {
    public static void main(String[] args) {
        Mobile2 obj1 = new Mobile2(); // Creating an instance 'obj1' of the Mobile class.
        obj1.brand = "Apple";      // Setting the brand for 'obj1'.
        obj1.price = 1500;         // Setting the price for 'obj1'.
        Mobile2.name = "SmartPhone"; // Setting the static 'name' variable for all mobiles.

        //Mobile2 obj2 = new Mobile2(); // Creating another instance 'obj2' of the Mobile class.
    }
}
    //public static void main(String[] args) throws ClassNotFoundException {
/*
    The main method signature, which is the entry point of the Java program.
    It accepts an array of String arguments 'args'.
*/
    //Class.forName("Mobile2");}
/*
    This line uses the 'Class.forName' method to dynamically load the class named "Mobile."
    The purpose of this line is to load the class definition into the JVM at runtime.
    'Class.forName' is often used for dynamically loading classes when their names are known at runtime.

    The 'throws ClassNotFoundException' clause indicates that this method may throw a 'ClassNotFoundException.'
    This exception is thrown if the class named "Mobile" cannot be found during runtime.
*/
    
/*
Question - Why always Static Block executes first even when it's below the constructor?

Answer - 
Bookish Language -
The static block in Java, which is defined using the static { ... } syntax, is executed when the class
is loaded by the Java Virtual Machine (JVM). This static block is executed before any instance of the class is created or
any static methods or static variables are accessed. That's why it appears to be "printed first always."

Easy Understandable -
Think of a static block in Java like a special instruction that the computer follows when it first learns 
about a class. It's like telling the computer, "Hey, before you do anything else with this class, do these things first."
So, when you have a static block in a class, the computer does whatever you've told it to do inside that block before it 
does anything else with the class. This includes setting up any special values or printing messages.
That's why when you run a Java program, the stuff inside the static block happens first, even before the main part of 
your program starts. It's like a "preparation step" for the class.
*/