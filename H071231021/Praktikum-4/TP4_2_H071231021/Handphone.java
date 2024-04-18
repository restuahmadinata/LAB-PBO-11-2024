package TP4_2_H071231021;

public class Handphone {
    private String merk;
    private String model;
    private int harga;
    private int tahunProduksi;
    private String deskripsi;

    public Handphone() {
    }
    
    public Handphone(String merk, String model, int harga, int tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }
    // getter/setter
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    void displayInfo(){
        System.out.println("Merk\t: " + getMerk());
        System.out.println("Model\t: " + getModel());
        System.out.println("Harga\t: " + getHarga());
        System.out.println("Tahun produksi\t: " + getTahunProduksi());
        System.out.println("Deskripsi\t: " + getDeskripsi());
    }
    
}
