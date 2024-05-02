package TP6_1_H071231021.main;
import TP6_1_H071231021.device.*;
import TP6_1_H071231021.dog.*;

public class Main {
    public static void main(String[] args) {
        Dog bulldog = new Bulldog(69);
        System.out.println();
        bulldog.describe();
        System.out.println("\nPosisi Bulldog sebelum bergerak: " + bulldog.position);
        bulldog.move();
        System.out.println("Posisi Bulldog setelah bergerak: " + bulldog.position);

        Device smartphone = new Smartphone(6969, "Smasnug S69 Ultraman");
        smartphone.displayInfo();
        smartphone.move();

        Device car = new Car(69696969, "Totoya Supri", 69, "Blue", 696);
        car.displayInfo();
        car.move();
    }
}
