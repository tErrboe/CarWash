public class WashType {
    private String wTypeName;
    private int wTypePrice;

    public WashType(String wTypeName, int wTypePrice) {
        this.wTypeName = wTypeName;
        this.wTypePrice = wTypePrice;
    }


    // public void printWashTypes(Washtype wTypes){
    //     for(WashType wt : wTypes){
    //         System.out.println(wt);
    //     }
    // }

    public String getWTypeName() {
        return wTypeName;
    }

    public int getWTypePrice() {
        return wTypePrice;
    }

    public String toString() {
        return wTypeName;
    }

    
}





