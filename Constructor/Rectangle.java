// Q. Create a class named Rectangle. 
// Create the following methods: 
// calculateArea(double length, double width) 
// calculatePerimeter(double length, double width) 
// Both methods should accept values as parameters and return the result. 
// In the main() method: Read length and width using the Scanner class. 
// Call both methods. 
// Display the area and perimeter. 

import java.util.Scanner;

class Rectangle{

    public double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }

    public double calculatePerimeter(double length, double width){
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length : ");
        double length = sc.nextDouble();

        System.out.print("Enter Width : ");
        double width = sc.nextDouble();

        Rectangle r = new Rectangle();

        System.out.println("Area of Rectangle : "+r.calculateArea(length, width));

        System.out.println("Perimeter of Area : "+r.calculatePerimeter(length, width));

    }
}