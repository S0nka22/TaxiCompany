public class Client extends Person {
    private boolean installedApp;
    private int orders;

    public Client(){

    }
    public Client (String name, String lastName, int age, boolean installedApp, int orders){
        super(name, lastName, age);
        this.installedApp = installedApp;
        this.orders = orders;
    }
    public boolean getInstalledApp() {
        return installedApp;
    }
    public int getOrders() {
        return orders;
    }
    public void setInstalledApp(boolean newInstalledApp) {
        this.installedApp = newInstalledApp;
    }
    public void setOrders(int newOrders) {
        this.orders = newOrders;
    }
}
