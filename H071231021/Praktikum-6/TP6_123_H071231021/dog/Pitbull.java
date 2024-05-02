package TP6_1_H071231021.dog;

public class Pitbull extends Dog {
    Pitbull(int position) {
        super(position, 60);
    }
    
    public void describe() {
        System.out.println("Pitbulls adalah anjing yang kuat dan atletis dengan otot yang terdefinisi dengan baik. Mereka memiliki kepala yang lebar dan kuat dengan rahang yang kuat. Pitbulls sering dikenal karena loyalitas mereka terhadap pemilik mereka dan kecerdasan mereka yang tinggi. Mereka juga bisa menjadi teman yang baik dengan latihan yang tepat dan sosialisasi yang baik.");
    }

    public void move() {
        this.position += 3;
    }
}