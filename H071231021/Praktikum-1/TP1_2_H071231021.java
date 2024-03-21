import java.util.Scanner;

public class TP1_2_H071231021 {

    public static String KapitalisasiHurufPertama(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        
        StringBuilder result = new StringBuilder();
        String[] words = sentence.toLowerCase().split("\\s");
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                
                if (i > 0) {
                    result.append(" ");
                }
                
                result.append(firstChar).append(restOfWord);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan judul film: ");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Input kosong");
            }
            
            String result = KapitalisasiHurufPertama(input);
            System.out.println("Output: " + result);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}