package TP5_2_H071231021;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private ArrayList<Product> products = new ArrayList<>();

    public void tambahProduk(Product product) {
        products.add(product);
    }

    public void tampilkanSemuaProduk() {
        if (products.isEmpty()) {
            System.out.println("Belum ada produk sama sekali.");
        } else {
            for (Product product : products) {
                product.displayInfo();
                System.out.println();
            }
        }
    }

    public boolean beliProduk(int seriesNumber) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).seriesNumber == seriesNumber) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main toko = new Main();

        int choice;
        do {
            System.out.println("\nSELAMAT DATANG DI TOKO ANDI");
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Masukkan nama produk: ");
                        scanner.nextLine();
                        String brand = scanner.nextLine();
                        System.out.print("Masukkan nomor seri: ");
                        int serialNumber = scanner.nextInt();
                        if (toko.checkSerialNumber(serialNumber)) {
                            System.out.println("Nomor seri sudah ada.");
                            break;
                        }
                        System.out.print("Masukkan harga: ");
                        double price = scanner.nextDouble();
                        System.out.println("Pilih tipe produk:");
                        System.out.println("1. Smartphone");
                        System.out.println("2. Laptop");
                        System.out.println("3. Kamera");
                        System.out.print("Tipe produk (1-3): ");
                        int productType = scanner.nextInt();
                        switch (productType) {
                            case 1:
                                System.out.print("Masukkan ukuran layar (inci): ");
                                double screenSize = scanner.nextDouble();
                                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                                int storageCapacity = scanner.nextInt();
                                toko.tambahProduk(new Smartphone(brand, serialNumber, price, screenSize, storageCapacity));
                                break;
                            case 2:
                                System.out.print("Masukkan ukuran RAM (GB): ");
                                int ramSize = scanner.nextInt();
                                System.out.print("Masukkan tipe prosesor: ");
                                scanner.nextLine();
                                String processorType = scanner.nextLine();
                                toko.tambahProduk(new Laptop(brand, serialNumber, price, ramSize, processorType));
                                break;
                            case 3:
                                System.out.print("Masukkan resolusi (MP): ");
                                int resolution = scanner.nextInt();
                                System.out.print("Masukkan tipe lensa: ");
                                scanner.nextLine();
                                String lensType = scanner.nextLine();
                                toko.tambahProduk(new Camera(brand, serialNumber, price, resolution, lensType));
                                break;
                            default:
                                System.out.println("Tipe produk tidak valid!");
                        }
                        break;
                    case 2:
                        System.out.println("Menu:");
                        toko.tampilkanSemuaProduk();
                        break;
                    case 3:
                        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                        int beliSerial = scanner.nextInt();
                        if (toko.beliProduk(beliSerial)) {
                            System.out.println("Anda telah berhasil membeli produk.");
                        } else {
                            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
                        }
                        break;
                    case 4:
                        System.out.println("Terimakasih telah menggunakan layanan kami. Sayonara!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan nomor.");
                scanner.next();
                choice = 0;
            }
        } while (choice != 4);

        scanner.close();
    }
    
    public boolean checkSerialNumber(int serialNumber) {
        for (Product product : products) {
            if (product.seriesNumber == serialNumber) {
                return true;
            }
        }
        return false;
    }
}