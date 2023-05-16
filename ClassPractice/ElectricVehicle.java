public class ElectricVehicle extends Vehicles {
    private String name;
    private String licence;
    private int speed;

    public ElectricVehicle() {
    }

    public ElectricVehicle(String name, String licence, int speed) {
        this.name = name;
        this.licence = licence;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getLicence() {
        return licence;
    }

    public int getSpeed() {
        return speed;
    }

    public void seName(String newname) {
        this.name = newname;
    }

    public void setLicence(String newlicence) {
        this.licence = newlicence;
    }

    public void setSpeed(int newspeed) {
        this.speed = newspeed;
    }
}