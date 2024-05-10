package Kelas;

public class Pengalaman extends Kehidupan {
    String jenisPekerjaan;
    int masaKerja;

    public Pengalaman(String jenisPekerjaan, int masaKerja) {
        this.jenisPekerjaan = jenisPekerjaan;
        this.masaKerja = masaKerja;
    }

    public void prosesKehidupan() {
        System.out.println("Memproses pengalaman...");
    }

    public void prosesKehidupan(String jenisPekerjaan, int pengalaman) {
        System.out.println("Pengalaman karyawan: " + jenisPekerjaan + ", " + masaKerja + " tahun.");
    }
}