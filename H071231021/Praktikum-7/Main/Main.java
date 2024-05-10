package Main;

import java.util.Scanner;
import java.util.ArrayList;

import javax.sound.sampled.*;
import java.io.*;

import Kelas.Karyawan;
import Kelas.Keluarga;
import Kelas.Organisasi;
import Kelas.Pendidikan;
import Kelas.Pengalaman;
import Kelas.Projek;


public class Main {

    // Play Sound Method
    public static void playSound(String filename) {
        try {
            File file = new File(filename);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        while (true) {
            System.out.println("\n=== APLIKASI MANAJEMEN KARYAWAN PERUSAHAN AITI ===");
            System.out.println("Data karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "a":

                // Input nama
                    String nama = "";
                    while (nama.trim().isEmpty()) {
                        System.out.print("\nMasukkan nama: ");
                        nama = scanner.nextLine().trim();
                        if (nama.isEmpty()) {
                            System.out.println("Anda belum memasukkan nama.");
                        }
                    }

                // Input umur
                    int umur = 0;
                    boolean inputUmurValid = false;
                    while (!inputUmurValid) {
                        try {
                            System.out.print("\nMasukkan umur: ");
                            umur = Integer.parseInt(scanner.nextLine());
                            if (umur < 18) {
                                System.out.println("Karyawan harus berumur 18 tahun atau lebih.");
                                playSound("Sound/rejected.wav");
                            } else {
                                inputUmurValid = true;
                                // continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Umur harus berupa angka.");
                        }
                    }
                    
                    // Input Nikah
                    System.out.println("\nSudah menikah?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    int statusMenikah = 0;
                    boolean inputStatusMenikahValid = false;
                    while (!inputStatusMenikahValid) {
                        try {
                            System.out.print("Input (1/2): ");
                            statusMenikah = Integer.parseInt(scanner.nextLine());
                            if (statusMenikah == 1 || statusMenikah == 2) {
                                inputStatusMenikahValid = true;
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka.");
                        }
                    }
                    
                    boolean sudahMenikah = statusMenikah == 1;

                // Input anak (jika sudah menikah)
                    int jumlahAnak = 0;
                    if (sudahMenikah) {
                        boolean inputJumlahAnakValid = false;
                        while (!inputJumlahAnakValid) {
                            try {
                                System.out.print("\nMasukkan jumlah anak: ");
                                jumlahAnak = Integer.parseInt(scanner.nextLine());
                                inputJumlahAnakValid = true;
                            } catch (NumberFormatException e) {
                                System.out.println("Jumlah anak harus berupa angka.");
                            }
                        }
                    }

                    Keluarga keluarga = new Keluarga(sudahMenikah, jumlahAnak);
                    keluarga.prosesKehidupan();


                    // Pengalaman - Pekerjaan
                    int pengalaman = 0;
                    boolean inputPengalamanValid = false;
                    while (!inputPengalamanValid) {
                        try {
                            System.out.println("\nPengalaman sebelumnya:");
                            System.out.println("1. Freelancer");
                            System.out.println("2. Magang");
                            System.out.println("3. Pekerja tetap");
                            System.out.println("4. Tidak ada");
                            System.out.print("Input: ");
                            pengalaman = Integer.parseInt(scanner.nextLine());
                            if (pengalaman >= 1 && pengalaman <= 4) {
                                inputPengalamanValid = true;
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka.");
                        }
                    }

                    if (pengalaman == 4) {
                        System.out.println("Karyawan tidak memenuhi syarat.");
                        playSound("Sound/rejected.wav");
                        continue;
                    }

                    String jenisPekerjaan;
                    switch (pengalaman) {
                        case 1:
                            jenisPekerjaan = "Freelancer";
                            break;
                        case 2:
                            jenisPekerjaan = "Magang";
                            break;
                        case 3:
                            jenisPekerjaan = "Pekerja tetap";
                            break;
                        default:
                            jenisPekerjaan = "Tidak ada";
                            break;
                    }

                    int masaKerja = 0;
                    boolean inputMasaKerja = false;
                    while (!inputMasaKerja) {
                        try {
                            System.out.println("\nMasa aktif kerja:");
                            System.out.print("Input: ");
                            masaKerja = Integer.parseInt(scanner.nextLine());
                            if (masaKerja < 4) {
                                System.out.println("Karyawan tidak memenuhi syarat.");
                                playSound("Sound/rejected.wav");
                            } else {
                                inputMasaKerja = true;
                                continue;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka.");
                        }
                    }

                    if (masaKerja < 4) {
                        System.out.println("Karyawan tidak memenuhi syarat.");
                        playSound("Sound/rejected.wav");
                        continue;
                    }

                    Pengalaman pengalamanObjek = new Pengalaman(jenisPekerjaan, masaKerja);
                    pengalamanObjek.prosesKehidupan();
                    pengalamanObjek.prosesKehidupan(jenisPekerjaan, masaKerja);

                    // Pendidikan
                    System.out.println("\nPendidikan terakhir:");
                    System.out.println("1. SD");
                    System.out.println("2. SMP");
                    System.out.println("3. SMA");
                    System.out.println("4. SMK");
                    System.out.println("5. S1");
                    System.out.println("6. S2");
                    System.out.println("7. S3");
                    int opsiPendidikan = 0;
                    boolean inputOpsiPendidikanValid = false;
                    while (!inputOpsiPendidikanValid) {
                        try {
                            System.out.print("Pilih opsi (1-7): ");
                            opsiPendidikan = Integer.parseInt(scanner.nextLine());
                            if (opsiPendidikan >= 1 && opsiPendidikan <= 7) {
                                inputOpsiPendidikanValid = true;
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka.");
                        }
                    }
                    
                    String pendidikanTerakhir;
                    switch (opsiPendidikan) {
                        case 1:
                            pendidikanTerakhir = "SD";
                            break;
                        case 2:
                            pendidikanTerakhir = "SMP";
                            break;
                        case 3:
                            pendidikanTerakhir = "SMA";
                            break;
                        case 4:
                            pendidikanTerakhir = "SMK";
                            break;
                        case 5:
                            pendidikanTerakhir = "S1";
                            break;
                        case 6:
                            pendidikanTerakhir = "S2";
                            break;
                        case 7:
                            pendidikanTerakhir = "S3";
                            break;
                        default:
                            System.out.println("Pilihan pendidikan tidak valid.");
                            continue;
                    }

                    if (pendidikanTerakhir.equals("SD") || pendidikanTerakhir.equals("SMP")) {
                        System.out.println("Karyawan harus memiliki pendidikan minimal SMA.");
                        playSound("Sound/rejected.wav");
                        continue;
                    }

                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesKehidupan();

                    switch (pendidikanTerakhir) {
                        case "SMA":
                        case "SMK":
                        case "S1":
                        case "S2":
                        case "S3":
                            pendidikan.pendidikanTinggi();
                            break;
                        default:
                            System.out.println("Pilihan pendidikan tidak valid.");
                            break;
                    }

                    // Projek
                    int projek = 0;
                    boolean inputProjekValid = false;
                    while (!inputProjekValid) {
                        try {
                            System.out.println("\nProjek IT:");
                            System.out.println("1. Minimal 4");
                            System.out.println("2. Minimal 8");
                            System.out.println("3. Minimal 12");
                            System.out.println("4. Lebih dari 15");
                            System.out.print("Input: ");
                            projek = Integer.parseInt(scanner.nextLine());
                            if (projek >= 1 && projek <= 4) {
                                inputProjekValid = true;
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka.");
                        }
                    }

                    if (projek == 1) {
                        System.out.println("Karyawan harus memiliki minimal 8 projek.");
                        playSound("Sound/rejected.wav");
                        continue;
                    }

                    Projek projekObjek = new Projek();
                    projekObjek.prosesKehidupan();

                    switch (projek) {
                        case 1:
                            projekObjek.prosesKehidupan(4);
                            break;
                        case 2:
                            projekObjek.prosesKehidupan(8);
                            break;
                        case 3:
                            projekObjek.prosesKehidupan(12);
                            break;
                        case 4:
                            projekObjek.prosesKehidupan(16);
                            break;
                    }

                    // Organisasi
                    System.out.println("\nPengalaman organisasi:");
                    System.out.println("1. Aktif di organisasi sosial");
                    System.out.println("2. Aktif di organisasi kemahasiswaan");
                    System.out.println("3. Aktif di organisasi profesi");
                    System.out.println("4. Tidak ada");
                    int organisasi = 0;
                    boolean inputOrganisasiValid = false;
                    while (!inputOrganisasiValid) {
                        try {
                            System.out.print("Input (1-4): ");
                            organisasi = Integer.parseInt(scanner.nextLine());
                            if (organisasi >= 1 && organisasi <= 4) {
                                inputOrganisasiValid = true;
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan harus berupa angka.");
                        }
                    }
                    
                    if (organisasi == 4) {
                        System.out.println("Karyawan tidak memenuhi syarat.");
                        playSound("Sound/rejected.wav");
                        continue;
                    }

                    String jenisOrganisasi;
                    switch (organisasi) {
                        case 1:
                            jenisOrganisasi = "Organisasi Sosial";
                            break;
                        case 2:
                            jenisOrganisasi = "Organisasi Kemahasiswaan";
                            break;
                        case 3:
                            jenisOrganisasi = "Organisasi Profesi";
                            break;
                        default:
                            jenisOrganisasi = "Tidak ada";
                            break;
                    }

                    int masaAktif = 0;
                    boolean inputMasaAktifValid = false;
                    while (!inputMasaAktifValid) {
                        try {
                            System.out.print("\nMasukkan masa aktif (dalam tahun): ");
                            masaAktif = Integer.parseInt(scanner.nextLine());
                            inputMasaAktifValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Masa aktif harus berupa angka.");
                        }
                    }

                    Organisasi organisasiObjek = new Organisasi(jenisOrganisasi, masaAktif);
                    organisasiObjek.prosesKehidupan();
                    organisasiObjek.prosesKehidupan(jenisOrganisasi, masaAktif);

                    // Jabatan
                    System.out.print("\nMasukkan jabatan karyawan: ");
                    String jabatan = scanner.nextLine();

                    // Gaji
                    double gaji = 0.0;
                    boolean inputGajiValid = false;
                    while (!inputGajiValid) {
                        try {
                            System.out.print("\nMasukkan gaji karyawan: ");
                            gaji = Double.parseDouble(scanner.nextLine());
                            inputGajiValid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Gaji harus berupa angka.");
                        }
                    }

                    // Karyawan diterima
                    Karyawan karyawan = new Karyawan(nama, umur, jabatan, gaji);
                    karyawan.prosesKehidupan();
                    karyawan.setKeluarga(keluarga);
                    karyawan.setPendidikanTerakhir(pendidikanTerakhir);
                    daftarKaryawan.add(karyawan);
                    System.out.println("Selamat, karyawan diterima!");
                    playSound("Sound/accepted.wav");
                    break;

                case "b":
                    if (!daftarKaryawan.isEmpty()) {
                        System.out.println("\nDetail semua karyawan:");
                        for (Karyawan k : daftarKaryawan) {
                            System.out.println("Nama\t\t: " + k.getNama());
                            System.out.println("Umur\t\t: " + k.getUmur());
                            System.out.println("Pendidikan\t: " + k.getPendidikanTerakhir());
                            System.out.println("Jabatan\t\t: " + k.getJabatan());
                            System.out.println("Gaji\t\t: " + k.getGaji());
                            System.out.println(">> Info Keluarga << ");
                            k.infoKeluarga();
                            System.out.println("----------------------");
                        }
                    } else {
                        System.out.println("Belum ada data karyawan.");
                    }
                    break;

                case "c":
                    System.out.println("\nTerima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}