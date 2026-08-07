// - d) Create Test class and In main method: 
// - • Create Production → Director → Movie Object • Display all details 

public class Test {
    public static void main(String[] args) {
        
        Production P = new Production();
        P.setPid(10);
        P.setCompanyName("HP");

        Director D = new Director();
        D.setDid(20);
        D.setName("");
        D.setProduction(P);

        Movie M = new Movie();
        M.setMid(30);
        M.setTitle("");
        M.setDirector(D);

        Director Dr = M.getDirector();
        Production Pr = D.getProduction();

        int mid = M.getMid();
        String title = M.getTitle();

        int Did = Dr.getDid();
        String DName = Dr.getName();

        int Pid = Pr.getPid();
        String CName = Pr.getCompanyName();



        System.out.println("Production Id: " + Pid);
        System.out.println("Company Name: " + CName);


        System.out.println("Director Id: " + Did);
        System.out.println("Director Name: " + DName);

        System.out.println("Movie ID: " + mid);
        System.out.println("Movie Title: " + title);

    }
}
