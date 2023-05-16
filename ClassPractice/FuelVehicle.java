public class FuelVehicle extends Vehicles {
    private String name;
    private String flue;
    private int speed;

    public FuelVehicle() {
    }

    public FuelVehicle(String name, String flue, int speed) {
        this.name = name;
        this.flue = flue;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getFlue() {
        return flue;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public void setFlue(String newflue) {
        this.flue = newflue;
    }

    public void setSpeed(int newspeed) {
        this.speed = newspeed;
    }
}