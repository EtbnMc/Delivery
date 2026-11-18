package Controller;

import Model.BikeDelivery;
import Model.Chargeable;
import Model.Packaging;
import Model.VanDelivery;

public class ChargeableControler {

    private Chargeable[] lista = new Chargeable[100];
    private int cantidad = 0;

    public void regBikeDelivery(String trackingId, double distanceKm) {
        lista[cantidad++] = new BikeDelivery(trackingId, distanceKm);
    }

    public void regVanDelivery(String trackingId, double distanceKm) {
        lista[cantidad++] = new VanDelivery(trackingId, distanceKm);
    }

    public void regPackaging(int items, double chargePerItem) {
        lista[cantidad++] = new Packaging(items,(int) chargePerItem);
    }

    public double calcTotalGeneral() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += lista[i].calculateCharge();
        }
        return total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Chargeable getElemento(int i) {
        return lista[i];
    }
}