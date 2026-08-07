// - a) Create class Production having variables (int pid, String companyName) 

public class Production {
    
    private int pid; 
    private String companyName;

    public void setPid(int pid) {
        this.pid = pid;
    }
    public int getPid () {
        return pid;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName () {
        return companyName;
    }
}
