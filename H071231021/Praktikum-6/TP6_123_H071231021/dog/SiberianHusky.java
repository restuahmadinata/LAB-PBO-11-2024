package TP6_1_H071231021.dog;

public class SiberianHusky extends Dog {
    SiberianHusky(int position) {
        super(position, 55);
    }
    
    @Override
    public void describe() {
        System.out.println("Siberian Huskies adalah anjing yang indah dan berenergi tinggi. Mereka memiliki bulu tebal dan mata biru yang mempesona. Siberian Huskies sangat suka berlari dan memerlukan latihan fisik yang cukup. Mereka cenderung ramah dan suka bermain, meskipun bisa keras kepala. Mereka juga sering digunakan sebagai anjing penarik kereta salju karena daya tahan dan kekuatan mereka.");
    }

    @Override
    public void move() {
        this.position += 2;
    }
}