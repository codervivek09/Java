// Q. Create a class named Employee. 
// Declare the following private variables: 
// employeeId 
// employeeName 
// salary 
// Generate setter and getter methods for all variables. 
// In the main() method: Accept values using the Scanner class. 
// Store values using setter methods. 
// Display the values using getter methods. 

import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String employeeName;
    private double salary;

    public Employee(int ID, String Name, double salary){
        this.employeeID = ID;
        this.employeeName = Name;
        this.salary = salary;
    }

    // Getter 
        public int getID(){
            return employeeID;
        }
        public String getName(){
            return employeeName;
        }
        public double getsalary(){
            return salary;
        }

    // Setter
        public void setID(int ID) {
            this.employeeID = ID;
        }
        public void setName(String name){
            this.employeeName = name ;
        }
        public void setsalary(double salary){
            this.salary = salary;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Employee ID : ");
        int ecmployeeID = sc.nextInt();

        System.out.print("Enter Employee Name : ");
        String ecmployeeName = sc.next();

        System.out.print("Enter Employee Salary : ");
        double salary = sc.nextDouble();

        Employee E = new Employee(ecmployeeID, ecmployeeName, salary);

        E.setID(ecmployeeID);
        E.setName(ecmployeeName);
        E.setsalary(salary);

        System.out.println(E.getID());
        System.out.println(E.getName());
        System.out.println(E.getsalary());

    }

}
