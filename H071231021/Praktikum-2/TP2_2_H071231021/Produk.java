package TP2_2_H071231021;

public class Produk {
    private String nama;
    private int ID;
    private int harga;
    private int stok;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }
    public void infoProduk() {
        System.out.println("Nama\t: " + nama);
        System.out.println("ID\t: " + ID);
        System.out.println("Harga\t: Rp. " + formatHarga());
        System.out.println("Stok\t: " + stok);
    }
    public String formatHarga() {
        return String.format("%,d", harga).replace(',', '.');
    }

    public void cekStok() {
        if (stok > 0) {
            System.out.println("Masih ada ji, pesan maki.");
        } else if (stok < 0) {
            System.out.println("Barang minus, ngutang kh?");
        } else {
            System.out.println("Maaf, habis mi barangnya.");
        }
    }

    public static void main(String[] args) {
        Produk smartphone = new Produk();

        smartphone.setNama("iPhone 15 Pro Max 1TB");
        smartphone.setID(15);
        smartphone.setHarga(31999000);
        smartphone.setStok(-1);

        smartphone.infoProduk();
        smartphone.cekStok();
    }
}
