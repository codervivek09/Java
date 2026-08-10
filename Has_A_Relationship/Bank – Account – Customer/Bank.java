// - d) Create class Bank having variables (int bid, String bankName, Account account) 

class Bank {
    private int bid;
    private String bankName;
    private Account account;


    public void setBID(int bid){
        this.bid = bid;
    }
    public int getBID(){
        return bid;
    }


    public void setBName(String bankName){
        this.bankName = bankName;
    }
    public String getBName(){
        return bankName;
    }


    public void setAccount(Account account){
        this.account = account;
    }
    public Account getAccount(){
        return account;
    }
}
