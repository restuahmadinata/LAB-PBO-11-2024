package No1;

class UiThread extends Thread {
    private final int numData;
    private int loadedData = 0;
    private int failedData = 0;
    private long startTime;

    public UiThread(int numData) {
        this.numData = numData;
    }

    public void run() {
        System.out.println("Start load " + numData + " Data.");
        startTime = System.currentTimeMillis();

        while (loadedData + failedData < numData) {
            long elapsedTime = (System.currentTimeMillis() - startTime) / 1000 + 1;
            System.out.println("Loading... (" + elapsedTime + "s)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + executionTime / 1000 + "s");

        if (failedData == 0) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(loadedData + " Data Successfully loaded & " + failedData + " Data failed to load");
        }
    }

    public synchronized void incrementLoadedData() {
        loadedData++;
    }

    public synchronized void incrementFailedData() {
        failedData++;
    }
}