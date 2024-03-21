import java.util.Scanner;

public class TP1_4_H071231021 {

    public static double hitungLuasLingkaran(double jari) {
        return 3.14 * jari * jari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jari = scanner.nextDouble();

            double area = hitungLuasLingkaran(jari);
            System.out.printf("Luas lingkaran adalah: %.2f", area);
        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
        }
        scanner.close();
    }
}