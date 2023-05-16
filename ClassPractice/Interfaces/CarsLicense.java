package Interfaces;

interface ILicenses {
    void printLicenses1();
    abstract void printLicenses2();
}
public class CarsLicense implements ILicenses {
    @Override
    public void printLicenses1(){
        System.out.println("Licence1 number TR797809-79-35");
    }
    @Override
    public void printLicenses2() {
        System.out.println("Licence2 number TR75698-79-21");
    }
}