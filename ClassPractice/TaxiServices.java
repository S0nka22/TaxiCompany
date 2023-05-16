public class TaxiServices extends Client {
    private String fooddelivery;
    private String taxiservice;
    private String freightdelivery;


    public TaxiServices(){

    }
    public TaxiServices (String fooddelivery, String taxiservice, String freightdelivery){
        this.fooddelivery = fooddelivery;
        this.taxiservice = taxiservice;
        this.freightdelivery = freightdelivery;
    }
    public String getfooddelivery() {
        return fooddelivery;
    }
    public String gettaxiservice() {
        return taxiservice;
    }
    public String getfreightdelivery() {
        return freightdelivery;
    }
    public void setFooddelivery(String newFooddelivery) {
        this.fooddelivery = newFooddelivery;
    }
    public void setTaxiservice(String newTaxiservice) {
        this.taxiservice = newTaxiservice;
    }
    public void setFreightdelivery(String newFreightdelivery) {
        this.freightdelivery = newFreightdelivery;
    }
}
