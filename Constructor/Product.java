//Q.Create a class named Product. 
// Declare: productId productName price Initialize the variables using a parameterized constructor. 
// Create a method: calculateDiscount(double discountPercentage) This method should: 
// Accept the discount percentage as a parameter. 
// Calculate the discount amount. 
// Return the final price after the discount. 
// In the main() method: Read product details using the Scanner class. 
// Create the object. Read the discount percentage. 
// Call the method and display the final price. 

import java.util.Scanner;

public class Product {

    int prodID ;
    String prodName ;
    float price;

    // Parameterized Constructor
    public Product(int P_ID, String P_Name, float P_Price){
        this.prodID = P_ID;
        this.prodName = P_Name;
        this.price = P_Price;
    }

    public double calculateDiscount(double discountPercentage){

        // Discount Calculation
        double value = 0;
        value = (price * discountPercentage) / 100 ;

        System.out.println("Discount Price : " + value);

        // Final Price
        double Final_Price = price - value;
        System.out.println("Final Price : " + Final_Price);

        return Final_Price;
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID : ");
        int prodID = sc.nextInt();

        System.out.print("Enter Product Name : ");
        String prodName = sc.next();

        System.out.print("Enter Product Price : ");
        float price = sc.nextFloat();

        System.out.print("Enter Discount Percentage : ");
        float Discount = sc.nextFloat();

        // Object
        Product P = new Product(prodID, prodName, price);


        // Method Call
        P.calculateDiscount(Discount);
    }   
}
