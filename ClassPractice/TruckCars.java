public class TruckCars extends Vehicles {
    private String name;
    private String licenseNum;
    private int carSpeed;

    public TruckCars() {
    }

    public TruckCars(String name, String licenseNum, int carSpeed) {
        this.name = name;
        this.licenseNum = licenseNum;
        this.carSpeed = carSpeed;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void seName(String newname) {
        this.name = newname;
    }

    public void setLicenseNum(String newlicenseNum) {
        this.licenseNum = newlicenseNum;
    }

    public void setCarSpeed(int newcarSpeed) {
        this.carSpeed = newcarSpeed;
    }
}