package ir.ac.kntu;

public class DeliveryMenu {
    private DeliveryVehicle deliveryVehicle;

    private CourierSalary courierSalary;

    private int salary;

    public DeliveryMenu() {
    }

    public DeliveryMenu(DeliveryVehicle deliveryVehicle, CourierSalary courierSalary, int salary) {
        this.deliveryVehicle = deliveryVehicle;
        this.courierSalary = courierSalary;
        this.salary = salary;
    }

    public DeliveryVehicle getDeliveryVehicle() {
        return deliveryVehicle;
    }

    public void setDeliveryVehicle(DeliveryVehicle deliveryVehicle) {
        this.deliveryVehicle = deliveryVehicle;
    }

    public CourierSalary getCourierSalary() {
        return courierSalary;
    }

    public void setCourierSalary(CourierSalary courierSalary) {
        this.courierSalary = courierSalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
