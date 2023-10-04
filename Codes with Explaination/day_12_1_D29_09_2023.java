//v042 Encapsulation in Java --------------------------------------------
class Human {
    private int age = 11; // Using the private keyword, you can access 'age' only within this class (Encapsulation using private keyword)

    // You can access 'age' using indirect methods. It's a good practice to make data private to control access.
    String name = "Bhaji";

    // Constructor (not explicitly defined here) - default constructor initializes 'age' to 11 and 'name' to "Bhaji".

//v043 Getters and Setters in Java --------------------------------------------
    // Getter method for 'age' - This method is used to retrieve the 'age'.
    public int getAge() {
        return age; // Return the value of 'age'.
    }

    // Getter method for 'name' - This method is used to retrieve the 'name'.
    public String getName() {
        return name; // Return the value of 'name'.
    }

    // Setter method for 'age' - This method is used to set the 'age'.
//v044 This keyword in Java --------------------------------------------
    public void setAge(int age) {
        this.age = age; // 'this' is a keyword representing the current object. It's used to distinguish the instance variable 'age' from the method parameter 'age'.
    }

    // Setter method for 'name' - This method is used to set the 'name'.
    public void setName(String n) {
        name = n; // Set the value of 'name' to the provided string 'n'.
    }
}

public class day_12_1_D29_09_2023 {
    public static void main(String[] args) {
        Human obj = new Human(); // Create an instance of the Human class using the default constructor.

        obj.setName("Aditya"); // Set the name of the Human object to "Aditya".
        obj.setAge(21); // Set the age of the Human object to 21.

        // Print the name and age of the Human object using getter methods.
        System.out.println(obj.name + " : " + obj.getAge());
        // 'name' can be accessed directly as it's not private, but to access 'age', we use the 'getAge' method.
    }
}
