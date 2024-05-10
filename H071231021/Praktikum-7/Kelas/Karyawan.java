package Kelas;

public class Karyawan extends Kehidupan {
    String nama;
    int umur;
    String jabatan;
    String pendidikanTerakhir;
    double gaji;
    Keluarga keluarga;

    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void infoKeluarga() {
        if (keluarga != null) {
            keluarga.infoKeluarga();
        } else {
            System.out.println("Belum ada informasi keluarga.");
        }
    }
    
    public void prosesKehidupan() {
        System.out.println("Karyawan bekerja untuk mencari nafkah.");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public Keluarga getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(Keluarga keluarga) {
        this.keluarga = keluarga;
    }
}
