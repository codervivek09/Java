// d) Create Test class and In main method: 
// • Create objects. • Set values using Setter methods • Access and display using Getter methods 



class Test {
    public static void main(String [] args){

        Specialization SP = new Specialization();       
        SP.setSid(2);
        SP.setField("JAVA");


        Doctor DR = new Doctor();       
        DR.setDid(85);
        DR.setName("Rahul");
        DR.setSpecialization(SP);
        

        Hospital HP = new Hospital();        
        HP.setHid(15);
        HP.setName("SMBT");
        HP.setDoctor(DR);

        int Hid = HP.getHid();
        String Hname = HP.getName();

        Doctor d = HP.getDoctor();       
        int Did =  d.getDid();
        String Dname = d.getName();

        Specialization s = DR.getSpecialization();   
        int Sid = s.getSid();
        String field = s.getField();


        System.out.println("Specialization id :- " + Sid);
        System.out.println("Specialization field :- " + field);

        System.out.println("Doctor id :- " + Did);
        System.out.println("Doctor name :- "+ Dname);

        System.out.println("Hospital id :- " + Hid);
        System.out.println("Hospital name :- " + Hname);


    }
}