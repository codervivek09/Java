// - e) Create Test class and In main method: 
//     • Create objects. 
//     • Set values using Setter methods 
//     • Display all details using Getter methods 

class Test {
    
    public static void main(String[] args) {
        Address A = new Address();
        A.setAID(46);
        A.setCity("Pune");

        Customer C = new Customer();
        C.setCID(23);
        C.setName("Vivek Phad");
        C.setAddress(A);

        Account AC = new Account();
        AC.setACNO(2518);
        AC.setType("Saving AC");
        AC.setCustomer(C);

        Bank B = new Bank ();
        B.setBID(0016);
        B.setBName("BOM Karvenagar");
        B.setAccount(AC);

        Account Ac = B.getAccount();
        Customer Cust = AC.getCustomer();
        Address Adr = C.getAddress();

        int B_ID = B.getBID();
        String B_Name = B.getBName();

        int AC_NO = AC.getACNO();
        String AC_Type = AC.getType();

        int C_ID = C.getCID();
        String C_Name = C.getName();

        int A_ID = A.getAID();
        String City = A.getCity();


        System.out.println("Account No. : " + AC_NO);
        System.out.println("Account Type : " + AC_Type);

        System.out.println("Customer ID : " + C_ID);
        System.out.println("Customer Name : " + C_Name);



        System.out.println("Bank ID : "+ B_ID);
        System.out.println("Bank Name : "+ B_Name);

        System.out.println("Address : " + A_ID);
        System.out.println("City : " + City);


    }
}