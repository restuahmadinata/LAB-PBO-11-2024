package TP6_1_H071231021.device;

public abstract class Device implements Moveable {
    int price;
    String brand;

    public Device(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    public abstract void displayInfo();
}
