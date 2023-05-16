public class NewOrders extends Client {
    private int gettaxi;
    private int newOrder;

    public NewOrders(){

    }
    public NewOrders (int gettaxi, int newOrder){
        this.gettaxi = gettaxi;
        this.newOrder = newOrder;
    }
    public int getGettaxi() {
        return gettaxi;
    }
    public int getNewOrder() {
        return newOrder;
    }
    public void setGettaxi(int newGettaxi) {
        this.gettaxi = newGettaxi;
    }
    public void setNewOrder(int newOrder) {
        this.newOrder = newOrder;
    }
}
