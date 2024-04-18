package TP4_2_H071231021;

public class Main {
    public static void main(String[] args) {
        
    Handphone hp1 = new Handphone();
    hp1.setMerk("Poco");
    hp1.setModel("X5 Pro");
    hp1.setHarga(3500000);
    hp1.setTahunProduksi(2023);
    hp1.setDeskripsi("Hp yang dimiliki oleh Restu Ahmadinata.");

    hp1.displayInfo();

    SelfUtils.displaySelfData();
    }
}
