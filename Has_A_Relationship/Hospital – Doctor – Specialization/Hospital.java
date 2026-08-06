// c) Create class Hospital having variables (int hid, String name, Doctor doctor) 

public class Hospital {
    private int hid;
    private String name;
    private Doctor doctor;

    public void setHid(int hid){
        this.hid = hid;
    }
    public int getHid(){
        return hid;
    }

    

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }



    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }
    public Doctor getDoctor(){
        return doctor;
    }
}
