package Interfaces;

interface IReserved {
    void showReservation1();
    abstract  void showReservation2();
}
public class InadvanceReservation implements IReserved {
    @Override
    public void showReservation1() {
        System.out.println("On the screen of your phone you can check you taxi reservation. Your number #TY437472-423-344");
    }
    @Override
    public void showReservation2() {
        System.out.println("On the screen of your phone you can check you taxi reservation. Your number #TY437472-657-112");
    }
}