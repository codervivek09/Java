// - c) Create class Account having variables (int accNo, String type, Customer customer) 

class Account {
    
    private int acNo;
    private String type;
    private Customer customer;


    public void setACNO(int acNo){
        this.acNo = acNo;
    }
    public int getACNO (){
        return acNo;
    }

    
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }


    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public Customer getCustomer(){
        return customer;
    }

}
