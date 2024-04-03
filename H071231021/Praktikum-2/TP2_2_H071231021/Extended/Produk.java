package TP2_2_H071231021.Extended;

public class Produk {
    private String nama;
    private int ID;
    private int harga;
    private int stok;

    public Produk(String nama, int ID, int harga, int stok) {
        this.nama = nama;
        this.ID = ID;
        this.harga = harga;
        this.stok = stok;
    }

    public String formatHarga() {
        return String.format("%,d", harga).replace(',', '.');
    }

    public void displayInfo() {
        System.out.println("Nama\t: " + nama);
        System.out.println("ID\t: " + ID);
        System.out.println("Harga\t: " + formatHarga());
        System.out.println("Stok\t: " + stok);
    }

    public void cekStok() {
        System.err.println((stok > 0) ? "Produk masih ada, silahkan pesan!" : "Produk sudah habis, kembali lagi nanti.");
    }

    public void beliProduk(int beli) {
        if (stok >= beli) {
            stok -= beli;
            System.out.println("Terima kasih telah membeli " + beli + " " + nama);
        } else {
            System.out.println("Maaf, stok tidak mencukupi untuk pembelian ini.");
        }
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------- INFO PRODUK PERTAMA ---------------");
        Produk produk1 = new Produk("iPhone 15 Pro Max", 15, 15000000, 15);
        produk1.displayInfo();
        System.out.println();

        System.out.println("--------------------- INFO PRODUK KEDUA ----------------");
        Produk produk2 = new Produk("POCO X5 PRO", 5, 4000000, 0);
        produk2.displayInfo();
        System.out.println();

        System.out.println("--------------------- BELI PRODUK ----------------------");
        System.out.println("Produk 1 " );
        produk1.beliProduk(3);
        System.out.println();
        System.out.println("Produk 2");
        produk2.beliProduk(2);
        System.out.println();
        
        System.out.println("--------------------- ABIS BELI ------------------------");
        produk1.displayInfo();
        produk1.cekStok();

        System.out.println();
  
        produk2.displayInfo();
        produk2.cekStok();

        System.out.println();

        System.out.println("-------------------- MENGUBAH DETAIL PRODUK ------------");
        produk1.setNama("IQOO 12");
        produk1.setID(12);
        produk1.setHarga(10000000);
        produk1.setStok(5);
        produk1.displayInfo();
        produk1.beliProduk(1);
        System.out.println();
        System.out.println("Stok setelah dibeli: " + produk1.getStok());
    }
}