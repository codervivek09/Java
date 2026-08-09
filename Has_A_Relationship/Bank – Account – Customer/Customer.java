// - b) Create class Customer having variables (int cid, String name, Address address) 

public class Customer {
    
    private int cid ;
    private String name;
    private Address address;

    public void setCID(int cid){
        this.cid = cid;
    }
    public int tgetCID(){
        return cid;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }
}
