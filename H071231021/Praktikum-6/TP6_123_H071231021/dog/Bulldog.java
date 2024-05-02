package TP6_1_H071231021.dog;

public class Bulldog extends Dog {
    public Bulldog(int position) {
        super(position, 50);
    }
    
    @Override
    public void describe() {
        System.out.println("Bulldog adalah anjing yang kuat dan berotot dengan kepala yang besar dan lebar. Mereka memiliki wajah yang khas dengan lipatan kulit yang menggemaskan di sekitar hidung mereka. Bulldog cenderung tenang dan santai, membuatnya menjadi hewan peliharaan yang baik untuk rumah tangga. Mereka tidak memerlukan banyak latihan fisik dan cenderung lebih suka bersantai di sekitar rumah.");
    }

    @Override
    public void move() {
        this.position += 1;
    }
}