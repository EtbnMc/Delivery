package Model;

abstract class Delivery implements Chargeable{
    private String trackingId;
    private double distanceKm;

    public Delivery(String trackingId, double distanceKm) {
        this.trackingId = trackingId;
        this.distanceKm = distanceKm;
    }
    
    public double baseCharge(){
        return 40;
    }
    
    protected abstract double ratePerKm();

    @Override
    public String label() {
        return "Envio a domilicio";
    }

    @Override
    public double calculateCharge() {
        return baseCharge() + distanceKm *
                ratePerKm();
    }

    public String getTrackingId() {
        return trackingId;
    }

    public double getDistanceKm() {
        return distanceKm;
    }
    
    
}

