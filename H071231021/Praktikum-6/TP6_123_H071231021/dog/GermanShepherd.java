package TP6_1_H071231021.dog;

public class GermanShepherd extends Dog {
    GermanShepherd(int position) {
        super(position, 65);
    }
    
    @Override
    public void describe() {
        System.out.println("German Shepherds adalah anjing yang cerdas, setia, dan sangat berani. Mereka memiliki tubuh yang atletis dengan bulu ganda yang tebal. German Shepherds adalah anjing pekerja yang sangat baik dan sering digunakan sebagai anjing polisi, anjing penjaga, atau anjing penelusur. Mereka memerlukan latihan fisik dan mental yang teratur untuk tetap bahagia dan sehat.");
    }

    @Override
    public void move() {
        this.position += 3;
    }
}