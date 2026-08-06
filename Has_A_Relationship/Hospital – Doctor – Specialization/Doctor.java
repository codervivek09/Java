// b) Create class Doctor having variables (int did, String name, Specialization specialization)

public class Doctor {

    private int did;
    private String name;
    private Specialization specialization;


    public void setDid(int did){
        this.did = did;
    }
    public int getDid(){
        return did;
    }



    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }



    public void setSpecialization(Specialization specialization){
        this.specialization = specialization;
    }
    public Specialization getSpecialization (){
        return specialization;
    }
    
}
