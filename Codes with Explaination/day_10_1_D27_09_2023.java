public class day_10_1_D27_09_2023{
    public static void main(String[] args) {
//v036 What is String in Java --------------------------------------------
        // Creating a new String object 'name' with the value "Vanish".
        String name = new String("Vanish");
        name = "Aditya";
        System.out.println(name);        // Print the value of 'name'.
        System.out.println(name.hashCode()); // Print the hash code of 'name'.
        System.out.println("hello " + name); // Concatenate "hello" with 'name' and print.
        System.out.println(name.concat("reddy")); // Concatenate "reddy" with 'name' and print.

//v037 Mutable vs Immutable String in Java --------------------------------------------
        // Creating a new String 'name1' with the value "navin" and concatenating "reddy" to it.
        String name1 = "navin";
        name1 = name1 + "reddy"; // Note: Strings are immutable; a new String is created when you modify it.
        System.out.println("hello" + name1);

        // Creating two String variables 's1' and 's2' with the same value "Navin".
        String s1 = "Navin";
        String s2 = "Navin";

        // Comparing references of 's1' and 's2'; they are pointing to the same String literal in the String pool.
        System.out.println(s1 == s2);

//v038 StringBuffer and StringBuilder in Java --------------------------------------------
        // Creating a StringBuffer 'sb' with the initial value "Navin".
        StringBuffer sb = new StringBuffer("Navin");

        // Displaying the length and capacity of the StringBuffer.
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        // Appending "Reddy" to the 'sb' StringBuffer.
        sb.append("Reddy");

        // Displaying the updated 'sb'.
        System.out.println(sb);

        // Converting the 'sb' StringBuffer to a String 'str'.
        String str = sb.toString();
        System.out.println(str);

        // Deleting a character at index 2 in 'sb'.
        sb.deleteCharAt(2);

        // Inserting "Java" at the beginning (index 0) of 'sb' and "java" at index 6.
        sb.insert(0, "Java");
        sb.insert(6, "java");

        // Setting the length of 'sb' to 30 (increasing capacity if necessary).
        sb.setLength(30);

        // Ensuring that 'sb' has a minimum capacity of 100.
        sb.ensureCapacity(100);

        // Displaying the final 'sb'.
        System.out.println(sb);
    }
}
