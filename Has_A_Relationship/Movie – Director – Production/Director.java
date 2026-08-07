// - b) Create class Director having variables (int did, String name, Production production) 

public class Director {
    
    private int did;
    private String name;
    private Production production;

    public void setDid(int did) {
        this.did = did;
    }
    public int getDid () {
        return did;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }


    public void setProduction(Production production) {
        this.production = production;
    }

    public Production getProduction () {
        return production;
    }
}