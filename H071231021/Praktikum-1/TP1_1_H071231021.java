import java.util.Scanner;

public class TP1_1_H071231021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input banyak bilangan: ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Inputan harus angka");
            }
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n <= 0) {
                throw new IllegalArgumentException("Input banyak bilangan tidak boleh kosong");
            }

            System.out.print("Input " + n + " bilangan (pisahkan dengan spasi): ");
            String bilanganInput = scanner.nextLine();

            if (bilanganInput.isEmpty()) {
                throw new IllegalArgumentException("Input bilangan tidak boleh kosong");
            }

            String[] bilangan = bilanganInput.split(" ");
            if (bilangan.length != n) {
                throw new IllegalArgumentException("Jumlah angka yang dimasukkan tidak sesuai dengan yang diinputkan sebelumnya");
            }

            int desimal = 0;
            int bulat = 0;

            for (String num : bilangan) {
                try {
                    double value = Double.parseDouble(num);
                    if (value == (int) value && !num.contains(".0")) {
                        bulat++;
                    } else {
                        desimal++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ada input bukan angka");
                    return;
                }
            }

            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
