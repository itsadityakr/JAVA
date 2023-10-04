//v039 Static Variable in Java --------------------------------------------
class Mobile {
    String brand;      // Declaration of instance variable 'brand' to store the mobile's brand name.
    int price;         // Declaration of instance variable 'price' to store the mobile's price.
    static String name; // Declaration of static variable 'name' to store a common name for all mobiles.

    public void show() {
        // Method to display mobile details including brand, price, and common name.
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class day_10_2_D27_09_2023 {
        public static void main(String[] args) {
        // Creating an instance 'obj1' of the Mobile class.
        Mobile obj1 = new Mobile();

        // Setting the brand, price, and common name for 'obj1'.
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // Setting the static 'name' variable for all mobiles.

        // Creating another instance 'obj2' of the Mobile class.
        Mobile obj2 = new Mobile();

        // Setting the brand, price, and common name for 'obj2'.
        obj2.brand = "Samsung";
        obj2.price = 1700;

        // Displaying the details of 'obj1' and 'obj2'.
        obj1.show();
        obj2.show();
        }
}