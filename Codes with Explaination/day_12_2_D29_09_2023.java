class Human0 {
    //In Java, it's common practice to encapsulate data by making instance variables private.

    private int age; // Using the private keyword, you can access 'age' only within this class (Encapsulation using private keyword)

    // You can access 'age' using indirect methods. It's a good practice to make data private to control access.
    String name;
//v045 Constructor in Java --------------------------------------------
    // Constructor - special method with the same name as the class
    public Human0() {
        age = 12; // Initialize 'age' to 12 when an instance of Human is created.
        name = "John"; // Initialize 'name' to "John" when an instance of Human is created.
        System.out.println("In Constructor"); // Print a message when the constructor is called.
    }

    // Getter method for 'age' - This method is used to retrieve the 'age'.
    public int getAge() {
        return age; // Return the value of 'age'.
    }

    // Getter method for 'name' - This method is used to retrieve the 'name'.
    public String getName() {
        return name; // Return the value of 'name'.
    }

    // Setter method for 'age' - This method is used to set the 'age'.
    public void setAge(int age) {
        this.age = age; // 'this' is a keyword representing the current object. It's used to distinguish the instance variable 'age' from the method parameter 'age'.
    }

    // Setter method for 'name' - This method is used to set the 'name'.
    public void setName(String n) {
        name = n; // Set the value of 'name' to the provided string 'n'.
    }
}

public class day_12_2_D29_09_2023 {
    public static void main(String[] args) {
        Human0 obj = new Human0(); // Create an instance of the Human class using the default constructor.

        // Uncomment the following two lines to set a new name and age:
        // obj.setName("Aditya");
        // obj.setAge(21);

        // Print the name and age of the Human object using getter methods.
        System.out.println(obj.name + " : " + obj.getAge());
        // 'name' can be accessed directly as it's not private, but to access 'age', we use the 'getAge' method.
    }
}
