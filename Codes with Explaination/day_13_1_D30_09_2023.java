//v042 Encapsulation in Java --------------------------------------------
class Human1 {
    private int age = 11; // Using the private keyword, you can access 'age' only within this class (Encapsulation using private keyword)

    // You can access 'age' using indirect methods. It's a good practice to make data private to control access.
    String name = "Bhaji";

    // Constructor (not explicitly defined here) - default constructor initializes 'age' to 11 and 'name' to "Bhaji".
//v046 Default vs Parameterized Constructor in Java --------------------------------------------
    // Default Constructor
    public Human1() {
        // This constructor initializes the object with default values.
        // It's automatically provided by Java when no constructors are defined.
        this.age = 47;         // Default age value
        this.name = "John Cena"; // Default name value
    }

    // Parameterized Constructor
    public Human1(int Age, String Name) {
        // This constructor accepts parameters and initializes the object with specific values.
        this.age = Age;      // Initialize age with the provided value
        this.name = Name;    // Initialize name with the provided value
    }
 //Every time if we create an object if there is no constructor available then the default constructor with no arguments will be automatically rendered. explain this in points with syntax explain this code by adding comments.

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

public class day_13_1_D30_09_2023 {
    public static void main(String[] args) {
        Human1 obj1 = new Human1(); // Create an instance of the Human class using the default constructor.
        Human1 obj2 = new Human1(51,"Triple H"); // Create an instance of the Human class using the default constructor.
        //obj1.setName("Aditya"); // Set the name of the Human object to "Aditya".
        //obj1.setAge(21); // Set the age of the Human object to 21.

        // Print the name and age of the Human object using getter methods.
        System.out.println(obj1.name + " : " + obj1.getAge());
        System.out.println(obj2.name + " : " + obj2.getAge());
        // 'name' can be accessed directly as it's not private, but to access 'age', we use the 'getAge' method.
    }
}
