// v053 Multiple Inheritance in Java--------------------------------------------
/*
In Java, multiple inheritance through classes (i.e., inheriting from more than one class) is not possible. Java supports single inheritance for classes, meaning a class can inherit from only one superclass.

However, Java does support multiple inheritance through interfaces. A class can implement multiple interfaces, which effectively allows it to inherit abstract methods and define multiple behaviors from those interfaces.

So, the statement "Multiple Inheritance in Java is possible" is partially true when referring to interfaces but not when it comes to classes.
*/

// Uncomment line no 42-59 and 63-70 this will throw error because multiple inheritance no possible.

// Parent class 1: Father
class Father {
    String lastName;

    // Constructor for Father class
    Father(String lastName) {
        this.lastName = lastName;
    }

    // Method to display the last name of the father
    void displayLastName() {
        System.out.println("Last Name (Father): " + lastName);
    }
}

// Parent class 2: Mother
class Mother {
    String maidenName;

    // Constructor for Mother class
    Mother(String maidenName) {
        this.maidenName = maidenName;
    }

    // Method to display the maiden name of the mother
    void displayMaidenName() {
        System.out.println("Maiden Name (Mother): " + maidenName);
    }
}

/* // Child class inheriting from both Father and Mother
class Child extends Father, Mother {
    String firstName;

    // Constructor for Child class
    Child(String firstName, String lastName, String maidenName) {
        super(lastName);    // Call Father's constructor and initialize the last name
        super(maidenName);  // Call Mother's constructor and initialize the maiden name
        this.firstName = firstName;
    }

    // Method to display the full name of the child
    void displayFullName() {
        // Access attributes from both Father and Mother classes
        System.out.println("Full Name (Child): " + firstName + " " + lastName + " " + maidenName);
    }
}
*/
public class day_15_2_D02_10_2023 {
    public static void main(String[] args) {
        // Create an object of the Child class
/*      Child child = new Child("John", "Doe", "Smith");

        // Display various information about the child
        child.displayFirstName();   // Output: John
        child.displayLastName();    // Output: Doe
        child.displayMaidenName();  // Output: Smith
        child.displayFullName();    // Output: John Doe Smith
*/
    }
}

/* Explanation - 
Multiple inheritance in the context of classes means that a child class can inherit properties and behaviors from more than one parent class. To explain this concept, let's use an example involving child and parent classes:

Suppose we have two parent classes, Father and Mother, and we want to create a child class called Child that inherits attributes from both parents. Here's how multiple inheritance could be illustrated:

In this example:

The Father class defines properties related to the father, such as the last name.
The Mother class defines properties related to the mother, such as the maiden name.
The Child class inherits from both Father and Mother, allowing it to access attributes from both parent classes.
Please note that multiple inheritance using classes is not supported in Java. Java instead uses interfaces to achieve multiple inheritance of behaviors. However, I've provided this example to illustrate the concept of multiple inheritance for better understanding.
*/