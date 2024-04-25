package TP5_2_H071231021;

class Product {
    protected String brand;
    protected int seriesNumber;
    protected double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Nomor Seri: " + seriesNumber);
        System.out.println("Harga: $" + price);
    }
}