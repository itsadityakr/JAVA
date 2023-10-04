    //v034 Array of Objects in Java --------------------------------------------
    //v035 Enhanced for Loop in Java --------------------------------------------
class Student {
    int roll_no; // Declare an integer variable to store the student's roll number.
    String name; // Declare a string variable to store the student's name.
    int marks;   // Declare an integer variable to store the student's marks.
}

public class day_9_1_D26_09_2023 {
    public static void main(String[] args) {
        // Create an instance of the Student class and assign values to its fields.
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.roll_no = 1;
        s1.marks = 97;

        // Create another instance of the Student class and assign values to its fields.
        Student s2 = new Student();
        s2.name = "Ravi";
        s2.roll_no = 2;
        s2.marks = 78;

        // Create a third instance of the Student class and assign values to its fields.
        Student s3 = new Student();
        s3.name = "Prasoon";
        s3.roll_no = 3;
        s3.marks = 97;

        // Create an array of Student objects to store multiple students.
        Student[] student = new Student[3];
        student[0] = s1; // Assign the first student object to the first element of the array.
        student[1] = s2; // Assign the second student object to the second element of the array.
        student[2] = s3; // Assign the third student object to the third element of the array.

        // Print the marks of the first student (Aditya).
        System.out.println(s1.marks);

        // Use a for-each loop to iterate through the array of students and print their information.
        for (Student stud : student) {
            System.out.println(stud.roll_no + " = " + stud.name + " : " + stud.marks);
        }

        // Use a for loop to iterate through the array of students and print their information.
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].roll_no + " = " + student[i].name + " : " + student[i].marks);
        }
    }
}
