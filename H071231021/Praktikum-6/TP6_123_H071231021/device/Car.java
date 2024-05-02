package TP6_1_H071231021.device;

public class Car extends Device {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int price, String brand, int totalForwardGear, String color, int maxSpeed) {
        super(price, brand);
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("\nMobil sedang berakselerasi");
    }

    @Override
    public void displayInfo() {
        System.out.println("\nCar Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Total Forward Gears: " + totalForwardGear);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
