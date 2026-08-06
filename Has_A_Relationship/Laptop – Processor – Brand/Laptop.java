// c) Create class Laptop having variables (int lid, String modelName, Processor processor)

public class Laptop {
    private int lid;
    private String modelName;
    private Processor processor;


    public void setLid(int lid){
        this.lid = lid;
    }
    public int getLid(){
        return lid;
    }

    public void setModelname(String modelName){
        this.modelName = modelName;
    }
    public String getModelname(){
        return modelName;
    }


    public void setProcessor(Processor processor){
        this.processor = processor;
    }
    public Processor getProcessor(){
        return processor;
    }
}
