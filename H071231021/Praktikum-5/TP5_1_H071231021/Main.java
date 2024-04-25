package TP5_1_H071231021_Simple;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        while (true) {
            try {
                System.out.println("===== BANGUN RUANG =====");
                System.out.println("1. KUBUS");
                System.out.println("2. BALOK");
                System.out.println("3. BOLA");
                System.out.println("4. TABUNG");

                System.out.println("\n===== BANGUN DATAR =====");
                System.out.println("5. PERSEGI");
                System.out.println("6. PERSEGI PANJANG");
                System.out.println("7. LINGKARAN");
                System.out.println("8. TRAPESIUM");
                System.out.println("\n========================");
                System.out.println("9. KELUAR");

                System.out.print("\nPilihan: ");
                pilihan = input.nextInt();

                if (pilihan == 9) {
                    System.out.println("Ywdh sih.");
                    break;
                }

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan sisi kubus: ");
                        double sisiKubus = input.nextDouble();
                        if (sisiKubus <= 0) {
                            throw new IllegalArgumentException("Sisi kubus harus lebih besar dari 0.");
                        }
                        Kubus kubus = new Kubus(sisiKubus);
                        System.out.println("\nLuas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
                        System.out.println("Volume Kubus: " + kubus.hitungVolume());
                        break;
                    case 2:
                        System.out.print("Masukkan panjang balok: ");
                        double panjangBalok = input.nextDouble();
                        System.out.print("Masukkan lebar balok: ");
                        double lebarBalok = input.nextDouble();
                        System.out.print("Masukkan tinggi balok: ");
                        double tinggiBalok = input.nextDouble();
                        if (panjangBalok <= 0 || lebarBalok <= 0 || tinggiBalok <= 0) {
                            throw new IllegalArgumentException("Panjang, lebar, dan tinggi balok harus lebih besar dari 0.");
                        }
                        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                        System.out.println("\nLuas Permukaan Balok: " + balok.hitungLuasPermukaan());
                        System.out.println("Volume Balok: " + balok.hitungVolume());
                        break;
                    case 3:
                        System.out.print("Masukkan radius bola: ");
                        double radiusBola = input.nextDouble();
                        if (radiusBola <= 0) {
                            throw new IllegalArgumentException("Radius bola harus lebih besar dari 0.");
                        }
                        Bola bola = new Bola(radiusBola);
                        System.out.println("\nLuas Permukaan Bola: " + bola.hitungLuasPermukaan());
                        System.out.println("Volume Bola: " + bola.hitungVolume());
                        break;
                    case 4:
                        System.out.print("Masukkan radius tabung: ");
                        double radiusTabung = input.nextDouble();
                        System.out.print("Masukkan tinggi tabung: ");
                        double tinggiTabung = input.nextDouble();
                        if (radiusTabung <= 0 || tinggiTabung <= 0) {
                            throw new IllegalArgumentException("Radius dan tinggi tabung harus lebih besar dari 0.");
                        }
                        Tabung tabung = new Tabung(radiusTabung, tinggiTabung);
                        System.out.println("\nLuas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
                        System.out.println("Volume Tabung: " + tabung.hitungVolume());
                        break;
                    case 5:
                        System.out.print("Masukkan sisi persegi: ");
                        double sisiPersegi = input.nextDouble();
                        if (sisiPersegi <= 0) {
                            throw new IllegalArgumentException("Sisi persegi harus lebih besar dari 0.");
                        }
                        Persegi persegi = new Persegi(sisiPersegi);
                        System.out.println("\nLuas Persegi: " + persegi.hitungLuas());
                        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
                        break;
                    case 6:
                        System.out.print("Masukkan panjang persegi panjang: ");
                        double panjangPersegiPanjang = input.nextDouble();
                        System.out.print("Masukkan lebar persegi panjang: ");
                        double lebarPersegiPanjang = input.nextDouble();
                        if (panjangPersegiPanjang <= 0 || lebarPersegiPanjang <= 0) {
                            throw new IllegalArgumentException("Panjang dan lebar persegi panjang harus lebih besar dari 0.");
                        }
                        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                        System.out.println("\nLuas Persegi Panjang: " + persegiPanjang.hitungLuas());
                        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
                        break;
                    case 7:
                        System.out.print("Masukkan radius lingkaran: ");
                        double radiusLingkaran = input.nextDouble();
                        if (radiusLingkaran <= 0) {
                            throw new IllegalArgumentException("Radius lingkaran harus lebih besar dari 0.");
                        }
                        Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
                        System.out.println("\nLuas Lingkaran: " + lingkaran.hitungLuas());
                        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
                        break;
                    case 8:
                        System.out.print("Masukkan sisi 1 trapesium: ");
                        double sisi1Trapesium = input.nextDouble();
                        System.out.print("Masukkan sisi 2 trapesium: ");
                        double sisi2Trapesium = input.nextDouble();
                        System.out.print("Masukkan sisi 3 trapesium: ");
                        double sisi3Trapesium = input.nextDouble();
                        System.out.print("Masukkan sisi 4 trapesium: ");
                        double sisi4Trapesium = input.nextDouble();
                        System.out.print("Masukkan tinggi trapesium: ");
                        double tinggiTrapesium = input.nextDouble();
                        if (sisi1Trapesium <= 0 || sisi2Trapesium <= 0 || sisi3Trapesium <= 0 || sisi4Trapesium <= 0 || tinggiTrapesium <= 0) {
                            throw new IllegalArgumentException("Semua sisi dan tinggi trapesium harus lebih besar dari 0.");
                        }
                        Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                        System.out.println("\nLuas Trapesium: " + trapesium.hitungLuas());
                        System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        input.close();
    }
}