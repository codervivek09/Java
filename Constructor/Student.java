// Q. Create a class named Student. 
// Declare the following data members: 
// studentId studentName age percentage 
// Create a parameterized constructor to initialize all data members. 
// Create a displayDetails() method to print the student's information. 
// In the main() method: Use the Scanner class to take input from the user. 
// Create a Student object using the parameterized constructor. 
// Display the student details. 


import java.util.*;

public class Student {

    int studentid ;
    String studentname;
    int age;
    float percentage;


    // Constructor
    public Student(int id, String name, int ag, float percent) {
        this.studentid = id;
        this.studentname = name;
        this.age = ag;
        this.percentage = percent;

    }

    // Print StudentInfo 
    public void displaydetails(){

        System.out.println("ID : " + studentid);
        System.out.println("Name : " + studentname);
        System.out.println("Age : " + age); 
        System.out.println("Percentage : "+ percentage);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        float percentage = sc.nextFloat();

        // Object
        Student s = new Student(id, name, age, percentage);

        // Method Call
        s.displaydetails();
    }
}