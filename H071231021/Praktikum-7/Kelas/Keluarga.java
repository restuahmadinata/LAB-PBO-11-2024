package Kelas;

public class Keluarga extends Kehidupan {
    boolean sudahMenikah;
    int jumlahAnak;

    public Keluarga(boolean sudahMenikah, int jumlahAnak) {
        this.sudahMenikah = sudahMenikah;
        this.jumlahAnak = jumlahAnak;
    }

    public void prosesKehidupan() {
        System.out.println("Memproses status pernikahan...");
    }

    public void infoKeluarga() {
        if (sudahMenikah) {
            System.out.println("Status\t\t: Sudah Menikah");
            System.out.println("Jumlah Anak\t: " + jumlahAnak);
        } else {
            System.out.println("Status\t\t: Belum Menikah");
        }
    }
}
