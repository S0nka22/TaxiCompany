
enum TaxiRides {
    ShortDestination, MediumDestination, LongDestination
}

public class TaxiOrderOptions {
    TaxiRides ridesDistance;
    public TaxiOrderOptions(TaxiRides ridesDistance) {
        this.ridesDistance = ridesDistance;
    }
    public void taxiOrder() {
        switch(ridesDistance) {
            case ShortDestination:
                System.out.println("30 min");
                break;
            case MediumDestination:
                System.out.println("60 min");
                break;
            default:
                System.out.println("120 min");
                break;
        }
    }
}

