// File: Typer.java
package No2;

public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        //TODO 1 : Buatlah variable howLongToType yang memuat waktu yang diperlukan typer untuk menulis 1 kata dalam milisecond 
        long startTime = System.currentTimeMillis();
        double howLongToType = 60000 / wpm;

        //TODO 2 : Buatlah perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType
        for (String word : wordsToType) {
            addWordsTyped(word);
            try {
                Thread.sleep((long) howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordsTyped("(selesai)");
        
        //TODO 3 : Tambahkan typer yang telah selesai mengetik semua kata ke list typeRaceTabel yang ada di class typeRacer. 
        long finishTime = System.currentTimeMillis();
        int elapsedTime = (int) ((finishTime - startTime) / 1000);
        
        typeRacer.addResult(new Result(botName, elapsedTime));
    }
}
