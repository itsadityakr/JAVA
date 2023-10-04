// v047 This and Super Method in Java --------------------------------------------
// Every class in Java Automatically extends the Object class.
// Class A extends Object
class A extends Object {
    // Default constructor for class A
    public A() {
        // The "super" keyword is used to call the constructor of the superclass (Object in this case).
        // It's automatically added by the compiler even if you don't write it.
        super(); // Call the constructor of the Object class (not necessary to write this line)
        System.out.println("In A");
    }

    // Parameterized constructor for class A
    public A(int a) {
        super(); // Call the constructor of the Object class (not necessary to write this line explicitly)
        System.out.println("In A : " + a);
    }
}

// Class B extends class A
class B extends A {
    // Default constructor for class B
    public B() {
        // The "super" keyword here is used to call the constructor of the superclass (class A).
        // This is done automatically by the compiler even if you don't explicitly write it.
        super(); // Call the constructor of class A
        System.out.println("In B");
    }

    // Parameterized constructor for class B
    public B(int a) {
        // The "this" keyword here is used to call the constructor of the same class (class B).
        this(); // Call the default constructor of class B
        // You can also call the parameterized constructor of the superclass using "super(a);"
        // super(a); // Call the parameterized constructor of class A with the value of "a"
        System.out.println("In B int : " + a);
    }
}

// Main class
public class day_13_2_D30_09_2023 {
    public static void main(String[] args) {
        // Create an object of class B using the default constructor
        /*
        NOTE - UNCOMMENT BEFORE EXECUTION and REMOVE THIS LINE
        B obj = new B();
        System.out.println("After Passing Values - In B int will run");

        // Create an object of class B using the parameterized constructor
        B obj1 = new B(5);
        */
    }
}
// Every constructor in Java has a method with super(); in it even if we don't allocate it.