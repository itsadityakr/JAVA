//v040 Static Methods in Java --------------------------------------------
class Mobile1 {
    String brand;   // Declaration of instance variable 'brand' to store the mobile's brand name.
    int price;      // Declaration of instance variable 'price' to store the mobile's price.
    static String name; // Declaration of static variable 'name' to store a common name for all mobiles.

    public void show() {
        // Method to display mobile details including brand, price, and common name.
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile1 obj) {
        // Static method to display mobile details using an object and the static variable 'name'.
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class day_11_1_D28_09_2023 {
    public static void main(String[] args) {
        Mobile1 obj1 = new Mobile1(); // Creating an instance 'obj1' of the Mobile class.
        obj1.brand = "Apple";       // Setting the brand for 'obj1'.
        obj1.price = 1500;          // Setting the price for 'obj1'.
        Mobile1.name = "SmartPhone"; // Setting the static 'name' variable for all mobiles.

        Mobile1 obj2 = new Mobile1(); // Creating another instance 'obj2' of the Mobile class.
        obj2.brand = "Samsung";     // Setting the brand for 'obj2'.
        obj2.price = 1700;          // Setting the price for 'obj2'.

        obj1.show();                // Calling the 'show' method for 'obj1' to display its details.
        obj2.show();                // Calling the 'show' method for 'obj2' to display its details.
        Mobile1.show1(obj1);         // Calling the static 'show1' method using 'obj1' to display its details.
    }
}
