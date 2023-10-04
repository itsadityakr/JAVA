//v049 Anonymous Object in java--------------------------------------------
class A1 {
    // Constructor of class A
    public A1() {
        System.out.println("Object Created of Constructor A1");
    }

    // A method named "show" in class A
    public void show() {
        System.out.println("In A_Show");
    }
}

public class day_14_1_D01_10_2023 {
    public static void main(String a[]) {
        // Creating an anonymous object of class A using "new A()"
        // and immediately calling the "show" method on it
        new A1().show(); // Anonymous Object

        // Creating another anonymous object of class A using "new A()"
        // and immediately calling the "show" method on it
        new A1().show(); // Every time we use new A() it will create a new object
    }
}
