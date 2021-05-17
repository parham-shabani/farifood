package ir.ac.kntu;

import java.util.ArrayList;

public class DeliveryIsAvailable {

    public DeliveryIsAvailable() {
        delivery();
    }

    private final DeliveryMenu delivery1 = new DeliveryMenu(DeliveryVehicle.MOTORBIKE, CourierSalary.HOURLY, 30000);

    private final DeliveryMenu delivery2 = new DeliveryMenu(DeliveryVehicle.MOTORBIKE, CourierSalary.BYSERVICE, 50000);

    private final DeliveryMenu delivery3 = new DeliveryMenu(DeliveryVehicle.CAR, CourierSalary.HOURLY, 35000);

    private final DeliveryMenu delivery4 = new DeliveryMenu(DeliveryVehicle.CAR, CourierSalary.BYSERVICE, 65000);

    private ArrayList<DeliveryMenu> kfcDeliveries = new ArrayList<>();

    private ArrayList<DeliveryMenu> mcDonaldDeliveries = new ArrayList<>();

    private  ArrayList<DeliveryMenu> atawichDeliveries = new ArrayList<>();

    private ArrayList<DeliveryMenu> ferikasifDeliveries = new ArrayList<>();


    final public void delivery() {
        kfcDeliveries.add(0, delivery1);

        mcDonaldDeliveries.add(0, delivery2);

        atawichDeliveries.add(0, delivery3);
        atawichDeliveries.add(1, delivery1);

    }


    public ArrayList<DeliveryMenu> getKfcDeliveries() {
        return kfcDeliveries;
    }

    public void setKfcDeliveries(ArrayList<DeliveryMenu> kfcDeliveries) {
        this.kfcDeliveries = kfcDeliveries;
    }

    public ArrayList<DeliveryMenu> getMcDonaldDeliveries() {
        return mcDonaldDeliveries;
    }

    public void setMcDonaldDeliveries(ArrayList<DeliveryMenu> mcDonaldDeliveries) {
        this.mcDonaldDeliveries = mcDonaldDeliveries;
    }

    public ArrayList<DeliveryMenu> getAtawichDeliveries() {
        return atawichDeliveries;
    }

    public void setAtawichDeliveries(ArrayList<DeliveryMenu> atawichDeliveries) {
        this.atawichDeliveries = atawichDeliveries;
    }

    public ArrayList<DeliveryMenu> getFerikasifDeliveries() {
        return ferikasifDeliveries;
    }

    public void setFerikasifDeliveries(ArrayList<DeliveryMenu> ferikasifDeliveries) {
        this.ferikasifDeliveries = ferikasifDeliveries;
    }
}
