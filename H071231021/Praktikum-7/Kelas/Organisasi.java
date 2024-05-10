package Kelas;

public class Organisasi extends Kehidupan {
    String jenisOrganisasi;
    int masaAktif;

    public Organisasi(String jenisOrganisasi, int masaAktif) {
        this.jenisOrganisasi = jenisOrganisasi;
        this.masaAktif = masaAktif;
    }

    public void prosesKehidupan() {
        System.out.println("Memproses pengalaman organisasi...");
    }

    public void prosesKehidupan(String jenisOrganisasi, int masaAktif) {
        System.out.println("Pengalaman organisasi Karyawan: " + jenisOrganisasi + ", masa aktif " + masaAktif + " tahun.");
    }
}