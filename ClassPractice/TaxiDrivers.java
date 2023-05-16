public class TaxiDrivers extends Person {
    private String name;
    private String lastName;
    private String carType;

    public TaxiDrivers() {

    }

    public TaxiDrivers(String name, String lastName, String carType) {
        this.name = name;
        this.lastName = lastName;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCarType() {
        return carType;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setCarType(String newcarType) {
        this.carType = newcarType;
    }
}
