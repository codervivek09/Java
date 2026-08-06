// d) Create Test class and In main method: 
// • Create Brand → Processor → Laptop Object • Display all details 


public class Test {
    public static void main(String[] args) {
        
        Brand b = new Brand();
        b.setBid(10);
        b.setName("HP");
        b.setCountry("India");

        Processor P = new Processor();
        P.setPid(10);
        P.setType("RTX_3050");
        P.setBrand(b);

        Laptop L = new Laptop();
        L.setLid(10);
        L.setModelname("VICTUS");
        L.setProcessor(P);

        Processor Pr = L.getProcessor();
        Brand Bd = P.getBrand();
        int lid = L.getLid();
        String LName = L.getModelname();

        int Pid = Pr.getPid();
        String PType = Pr.getType();
        
        int Bid = Bd.getBid();
        String BName = Bd.getName();
        String Country = Bd.getCountry();

        System.out.println("Brand ID : " + L.getProcessor().getBrand().getBid());
        System.out.println("Brand Name : " + BName);
        System.out.println("Brand Country : " + Country);


        System.out.println("Processor ID : " + Pid);
        System.out.println("Processor Type : " + PType);

        System.out.println("Laptop ID : " + lid);
        System.out.println("Laptop Name : " + LName);

    }
}
