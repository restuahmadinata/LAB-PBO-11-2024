package TP2_4_H071231021;

class Alamat {
    String jalan;
    String kota;

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getAlamat() {
        return alamat.getAlamat();
    }
}

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Restu Ahmadinata";
        mahasiswa.nim = "H071231021";

        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t: " + mahasiswa.getNim());
        System.out.println("Alamat\t: " + mahasiswa.getAlamat());
    }
}