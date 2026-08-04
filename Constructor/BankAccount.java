// Q. Create a class named BankAccount. 
// Declare private variables: accountNumber accountHolderName balance 
// Create a parameterized constructor to initialize the account number , account holder name,balance. 
// Create getters for the private variables In the main() method: Read account details using the Scanner class. 
// Create the object using the constructor. 
// Display all details using getter methods. 

import java.util.*;

public class BankAccount {

    private int accountNumber ;
    private String acname;
    private float acbalance;

    public BankAccount(int acno, String name, float balance){

        this.accountNumber = acno;
        this.acname = name;
        this.acbalance = balance;

    }
        
        public int getNo(){
            return accountNumber;
        }

        public String getName(){
            return acname;
        }

        public float getBal(){
            return acbalance;
        }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int acNo = sc.nextInt();
        String Name = sc.next();
        float balance = sc.nextFloat();

        BankAccount b = new BankAccount(acNo, Name, balance);

        System.out.println(b.getNo());
        System.out.println(b.getName());
        System.out.println(b.getBal());
        
    }
}
