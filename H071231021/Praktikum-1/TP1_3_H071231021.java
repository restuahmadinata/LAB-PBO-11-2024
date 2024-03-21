import java.util.HashMap;
import java.util.Scanner;

public class TP1_3_H071231021 {

    public static String konversiTanggal(String inputStr) {
        HashMap<String, String> bulan = new HashMap<>();
        bulan.put("01", "Januari");
        bulan.put("02", "Februari");
        bulan.put("03", "Maret");
        bulan.put("04", "April");
        bulan.put("05", "Mei");
        bulan.put("06", "Juni");
        bulan.put("07", "Juli");
        bulan.put("08", "Agustus");
        bulan.put("09", "September");
        bulan.put("10", "Oktober");
        bulan.put("11", "November");
        bulan.put("12", "Desember");

        String[] splitInput = inputStr.split("-");
        
        if (splitInput.length != 3) {
            return "";
        }
        
        String tanggal = splitInput[0];
        String bulanStr = splitInput[1];
        String tahun = splitInput[2];

        if (!tanggal.matches("\\d{2}") || !bulanStr.matches("\\d{2}") || !tahun.matches("\\d{2}")) {
            return "";
        }

        int tanggalInt = Integer.parseInt(tanggal);
        if (tanggalInt < 1 || tanggalInt > 31) {
            return "eTanggal";
        }

        int bulanInt = Integer.parseInt(bulanStr);
        if (bulanInt < 1 || bulanInt > 12) {
            return "eBulan";
        }

        int tahunInt = Integer.parseInt(tahun);
        if (tahunInt >= 0 && tahunInt <= 49) {
            tahun = "20" + tahun;
        } else {
            tahun = "19" + tahun;
        }

        return tanggal + " " + bulan.get(bulanStr) + " " + tahun;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal (format: DD-MM-YY): ");
        String input = scanner.nextLine();
        String output = konversiTanggal(input);
        if (output.equals("")) {
            System.out.println("Format tanggal salah. Harap masukkan tanggal dengan format yang benar.");
        } else if (output.equals("eTanggal")) {
            System.out.println("Input tanggal hanya 1-31");
        } else if (output.equals("eBulan")) {
            System.out.println("Input bulan hanya 1-12");
        } else {
            System.out.println("Output: " + output);
        }
        scanner.close();
    }
}
