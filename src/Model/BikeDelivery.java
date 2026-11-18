package Model;

public class BikeDelivery extends Delivery{

    public BikeDelivery(String trackingId, double distanceKm) {
        super(trackingId, distanceKm); // referencia al constructor del padre
    }

    @Override
    protected double ratePerKm() {
        return 8;
    }
    
}

