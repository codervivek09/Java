// a) Create class Brand having variables (int bid, String brandName, String country) 


class Brand {
    private int bid;
    private String brandname;
    private String Country;
    
    public void setBid(int bid){
        this.bid = bid;
    }
    public int getBid(){
        return bid;
    }


    public void setName(String brandname){
        this.brandname= brandname;
    }
    public String getName(){
        return brandname;
    }


    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return Country;
    }


}