// b) Create class Processor having variables (int pid, String type, Brand brand) 

class Processor {

    private int pid;
    private String type;
    private Brand brand;

    public void setPid(int pid){
        this.pid = pid;
    }
    public int getPid(){
        return pid;
    }


    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public Brand getBrand(){
        return brand;
    }

}