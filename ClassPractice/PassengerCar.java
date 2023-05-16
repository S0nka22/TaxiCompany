public class PassengerCar extends Vehicles {
    private String carName;
    private String licenseNum;
    private int carSpeed;

    public PassengerCar() {
    }

    public PassengerCar(String carName, String licenseNum, int carSpeed) {
        this.carName = carName;
        this.licenseNum = licenseNum;
        this.carSpeed = carSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarName(String newcarName) {
        this.carName = carName;
    }

    public void setLicenseNum(String newlicenseNum) {
        this.licenseNum = newlicenseNum;
    }

    public void setCarSpeed(int newcarSpeed) {
        this.carSpeed = newcarSpeed;
    }
}