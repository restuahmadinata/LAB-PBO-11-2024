package TP6_1_H071231021.device;

public class Smartphone extends Device {
    public Smartphone(int price, String brand) {
        super(price, brand);
    }

    @Override
    public void move() {
        System.out.println("\nSmartphone berpindah");
    }
    
    @Override
    public void displayInfo() {
        System.out.println("\nSmartphone Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}