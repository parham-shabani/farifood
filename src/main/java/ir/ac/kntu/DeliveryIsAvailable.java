package ir.ac.kntu;

import java.util.ArrayList;

public class DeliveryIsAvailable {

    public DeliveryIsAvailable() {
        delivery();
        couriers();
    }

    private ArrayList<DeliveryMenu> couriers = new ArrayList<>();


    private DeliveryMenu delivery1 = new DeliveryMenu(DeliveryVehicle.MOTORBIKE, CourierSalary.HOURLY, 30000);

    private DeliveryMenu delivery2 = new DeliveryMenu(DeliveryVehicle.MOTORBIKE, CourierSalary.BYSERVICE, 50000);

    private DeliveryMenu delivery3 = new DeliveryMenu(DeliveryVehicle.CAR, CourierSalary.HOURLY, 35000);

    private DeliveryMenu delivery4 = new DeliveryMenu(DeliveryVehicle.CAR, CourierSalary.BYSERVICE, 65000);



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

    public void couriers() {
        couriers.add(0,delivery1);
        couriers.add(1,delivery2);
        couriers.add(2,delivery3);
        couriers.add(3,delivery4);

    }

    public ArrayList<DeliveryMenu> getCouriers() {
        return couriers;
    }

    public void setCouriers(ArrayList<DeliveryMenu> couriers) {
        couriers = couriers;
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

    public DeliveryMenu getDelivery1() {
        return delivery1;
    }

    public void setDelivery1(DeliveryMenu delivery1) {
        this.delivery1 = delivery1;
    }

    public DeliveryMenu getDelivery2() {
        return delivery2;
    }

    public void setDelivery2(DeliveryMenu delivery2) {
        this.delivery2 = delivery2;
    }

    public DeliveryMenu getDelivery3() {
        return delivery3;
    }

    public void setDelivery3(DeliveryMenu delivery3) {
        this.delivery3 = delivery3;
    }

    public DeliveryMenu getDelivery4() {
        return delivery4;
    }

    public void setDelivery4(DeliveryMenu delivery4) {
        this.delivery4 = delivery4;
    }
}
