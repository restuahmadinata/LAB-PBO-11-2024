package TP2_3_H071231021;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 30;
        cuboid.width = 25;
        cuboid.length = 6;
        
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}